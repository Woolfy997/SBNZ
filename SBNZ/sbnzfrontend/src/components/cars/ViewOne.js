import React from "react";
import {
  Container,
  Paper,
} from "@material-ui/core";

const ViewOne = (props) => {
  
  return (
    <Container className="viewone">
      <Paper elevation={3} className="car">
        <div>Year: {props.car.year}</div>
        <div>Make: {props.car.make}</div>
        <div>Model: {props.car.model}</div>
        <div>Price: {props.car.price}</div>
      </Paper>
    </Container>
  );
};

export default ViewOne;
