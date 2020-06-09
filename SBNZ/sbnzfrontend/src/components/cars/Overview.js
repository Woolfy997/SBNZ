import React, { useEffect } from "react";
import Axios from "axios";
import ViewOne from "../cars/ViewOne";
import {
    Container, 
    Paper,
    Select,
    MenuItem,
    Button
  } from "@material-ui/core";

const Overview = (props) => {
    const [cars, setCars] = React.useState([]);
    const [fuel, setFuel] = React.useState("ELECTRIC");
    const [fuelOptions] = React.useState(["ELECTRIC", "HYBRID", "DIESEL", "GAS", "LPG"]);
    const [type, setType] = React.useState("HATCHBACK");
    const [typeOptions] = React.useState(["HATCHBACK", "SEDAN", "STATIONWAGON", "COUPE", "CONVERTIBLE", "SUV", "PICKUP", "MINIVAN"]);
    const [gear, setGear] = React.useState("MANUAL");
    const [gearOptions] = React.useState(["MANUAL", "AUTOMATIC"]);
    const viewCar = cars.map((c) => (
        <ViewOne car = {c} key = {c.id}/>
    ));
    const handleSelectChangeFuel = (event) => {
        setFuel(event.target.value);
    };
    const fuelOptionsList = fuelOptions.map((opt) => (
        <MenuItem key={opt} value={opt}>
          {opt}
        </MenuItem>
    ));
    const handleSelectChangeType = (event) => {
        setType(event.target.value);
    };
    const typeOptionsList = typeOptions.map((opt) => (
        <MenuItem key={opt} value={opt}>
          {opt}
        </MenuItem>
    ));
    const handleSelectChangeGear = (event) => {
        setGear(event.target.value);
    };
    const gearOptionsList = gearOptions.map((opt) => (
        <MenuItem key={opt} value={opt}>
          {opt}
        </MenuItem>
    ));
    useEffect(() => {
        Axios.get("http://localhost:8080/getAll").then((response) => {
            console.log(response.data); setCars(response.data);
        });
      }, [props]);
    const submitForm = () => {
        let filter = {
          fuel: fuel,
          type: type,
          gear: gear
        };
        console.log(filter);
        Axios.post(
          "http://localhost:8080/filter",
          filter
        ).then((response) => {console.log(response.data); setCars(response.data)});
    };
  return (
    <Container className="form-container">
        <Paper>
            <form>
                <label>Fuel type</label>
                <Select
                    id="fuel"
                    value={fuel}
                    onChange={handleSelectChangeFuel}
                >
                    {fuelOptionsList}
                </Select>
                <label>Car type</label>
                <Select
                    id="type"
                    value={type}
                    onChange={handleSelectChangeType}
                >
                    {typeOptionsList}
                </Select>
                <label>Gear type</label>
                <Select
                    id="gear"
                    value={gear}
                    onChange={handleSelectChangeGear}
                >
                    {gearOptionsList}
                </Select>
                <Button variant="contained" color="primary" onClick={submitForm}>
                    Filter
                </Button>
            </form>
        </Paper>
        {viewCar}
    </Container>
  );
};

export default Overview;
