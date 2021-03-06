package ftn.siit.sbnz.SBNZ.repository;

import ftn.siit.sbnz.SBNZ.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);
    List<User> findAllByNameContainingOrLastNameContaining(String firstName, String lastName);
}
