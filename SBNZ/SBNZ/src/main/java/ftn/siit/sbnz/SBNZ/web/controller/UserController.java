package ftn.siit.sbnz.SBNZ.web.controller;

import ftn.siit.sbnz.SBNZ.exceptions.PasswordsDoNotMatchException;
import ftn.siit.sbnz.SBNZ.model.User;
import ftn.siit.sbnz.SBNZ.security.TokenUtils;
import ftn.siit.sbnz.SBNZ.services.UserDetailsServiceImpl;
import ftn.siit.sbnz.SBNZ.web.dto.LoginDTO;
import ftn.siit.sbnz.SBNZ.web.dto.RegisterDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class UserController {

    @Autowired
    AuthenticationManager authenticationManager;


    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Autowired
    TokenUtils tokenUtils;

    @PostMapping("/login")
    public ResponseEntity<String> login(@Valid @RequestBody LoginDTO loginDTO) {
        try {
            UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(
                    loginDTO.getEmail(), loginDTO.getPassword());
            authenticationManager.authenticate(token);
            UserDetails details = userDetailsService.loadUserByUsername(loginDTO.getEmail());
            return new ResponseEntity<String>(tokenUtils.generateToken(details), HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<String>("Invalid login", HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@Valid @RequestBody RegisterDTO registerDTO) {
        if (!registerDTO.getPassword1().equals(registerDTO.getPassword2())) throw new PasswordsDoNotMatchException();

        User user = new User(registerDTO.getName(), registerDTO.getLastName(), registerDTO.getEmail(), registerDTO.getPassword1(), false);
        userDetailsService.createUser(user);
        return new ResponseEntity<String>("User successfully created", HttpStatus.CREATED);
    }


}
