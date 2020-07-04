import React from "react";
import {
  Container,
  Paper,
} from "@material-ui/core";

const ViewOne = (props) => {

  const luxuryCar = () => {
    if (props.car.luxury === true)
      return "Yes";
    return "No";
  };
  
  return (
    <Container className="viewone">
      <Paper elevation={3} className="car">
        <div><b>{props.car.year} {props.car.make} {props.car.model} - {props.car.price}e</b></div>
        <div>{props.car.type} {props.car.fuel}</div>
        <div>Gearbox: {props.car.gear}</div>
        <div>Luxury car: {luxuryCar()}</div>
        <div>Space: {props.car.doors} doors, {props.car.seats} seats</div>
        <div>Engine: {props.car.cc}cc, {props.car.kw}kw</div>
        <div>Mileage: {props.car.km}km</div>
        <div>Fuel consumption: {props.car.fuelConsumption}l/100km</div>
        <div>Registration price: {props.car.regPrice}rsd</div>
      </Paper>
    </Container>
  );
};

export default ViewOne;
