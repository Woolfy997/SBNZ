import React from "react";
import {
  Container,
  Paper,
  TextField,
  Button
} from "@material-ui/core";
import Axios from "axios";

const Add = (props) => {
  const [code, setCode] = React.useState("");
  const [name, setName] = React.useState("");
  
  const submitForm = () => {
    let rule = {
      code: code,
      name: name
    };
    Axios.post(
      "http://localhost:8080/addRule",
      rule, {headers: {"X-Auth-Token": props.accessToken}}
    ).then((response) => console.log(response.data));
  };

  return (
    <Container className="rule">
      <Paper elevation={3} className="code">
        <form>
        <TextField 
            label="Rule"
            value={code}
            variant="filled"
            multiline
            onChange={(event) => setCode(event.target.value)} 
        />
        <TextField label="File name" value={name} onChange={(event) => setName(event.target.value)} />
        <Button variant="contained" color="primary" onClick={submitForm}>
            Add Rule
          </Button>
        </form>
      </Paper>
    </Container>
  );
};

export default Add;
