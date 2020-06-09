import React from "react";
import {
  TextField,
  Select,
  Checkbox,
  MenuItem,
  Button,
  Container,
  Paper,
} from "@material-ui/core";
import Axios from "axios";
import FormTitle from "../layout/FormTitle";
import ViewOne from "../cars/ViewOne";

const Query = (props) => {
  const [budget, setBudget] = React.useState("");
  const [familySize, setFamilySize] = React.useState("");
  const [experience, setExperience] = React.useState("");
  const [purpose, setPurpose] = React.useState("EVERYDAY");
  const [purposeOptions] = React.useState(["EVERYDAY", "SPORT", "OFFROAD", "TRANSPORT"]);
  const [regNotExpensive, setRegNotExpensive] = React.useState(false);
  const [lowFuelConsumption, setLowFuelConsumption] = React.useState(false);
  const [lowKm, setLowKm] = React.useState(false);
  const [age, setAge] = React.useState("");
  const [luxury, setLuxury] = React.useState(false);
  const [country, setCountry] = React.useState("NA");
  const [countryOptions] = React.useState(["GERMANY", "ITALY", "FRANCE", "JAPAN", "USA", "RUSSIA", "ROMANIA", "CZECHIA", "SPAIN", "UK", "SOUTH_KOREA", "CHINA", "NA"]);
  const [make, setMake] = React.useState("");
  const [gear, setGear] = React.useState("NA");
  const [gearOptions] = React.useState(["MANUAL", "AUTOMATIC", "NA"]);
  const [environment, setEnvironment] = React.useState(false);
  const [cars, setCars] = React.useState([]);
  
  const handleCheckRegNotExpensive = (event) => {
    setRegNotExpensive(event.target.checked);
  };
  const handleCheckLowFuelConsumption = (event) => {
    setLowFuelConsumption(event.target.checked);
  };
  const handleCheckLowKm = (event) => {
    setLowKm(event.target.checked);
  };
  const handleCheckLuxury = (event) => {
    setLuxury(event.target.checked);
  };
  const handleCheckEnvironment = (event) => {
    setEnvironment(event.target.checked);
  };
  const handleSelectChangePurpose = (event) => {
    setPurpose(event.target.value);
  };
  const handleSelectChangeCountry = (event) => {
    setCountry(event.target.value);
  };
  const handleSelectChangeGear = (event) => {
    setGear(event.target.value);
  };
  const submitForm = () => {
    let query = {
      budget: budget,
      familySize: familySize,
      experience: experience,
      purpose: purpose,
      regNotExpensive: regNotExpensive,
      lowFuelConsumption: lowFuelConsumption,
      lowKm: lowKm,
      age: age,
      luxury: luxury,
      country: country,
      make: make,
      gear: gear,
      environment: environment,
    };
    console.log(query);
    Axios.post(
      "http://localhost:8080/query",
      query
    ).then((response) => setCars(response.data));
  };
  const purposeOptionsList = purposeOptions.map((opt) => (
    <MenuItem key={opt} value={opt}>
      {opt}
    </MenuItem>
  ));
  const countryOptionsList = countryOptions.map((opt) => (
    <MenuItem key={opt} value={opt}>
      {opt}
    </MenuItem>
  ));
  const gearOptionsList = gearOptions.map((opt) => (
    <MenuItem key={opt} value={opt}>
      {opt}
    </MenuItem>
  ));
  const viewCar = cars.map((c) => (
    <ViewOne car = {c} key = {c.id}/>
  ));
  return (
    <Container className="form-container">
      <Paper elevation={3}>
        <FormTitle>Enter your preferences</FormTitle>
        <form>
          <TextField
            type="number"
            label="Budget"
            value={budget}
            onChange={(event) => setBudget(event.target.value)}
          />
          <TextField
            type="number"
            label="Family Size"
            value={familySize}
            onChange={(event) => setFamilySize(event.target.value)}
          />
          <TextField
            type="number"
            label="Years of experience"
            value={experience}
            onChange={(event) => setExperience(event.target.value)}
          />
          <label>Purpose</label>
          <Select
            id="purpose"
            value={purpose}
            onChange={handleSelectChangePurpose}
          >
            {purposeOptionsList}
          </Select>
          <label>Registration not expensive</label>
          <Checkbox checked={regNotExpensive} onChange={handleCheckRegNotExpensive} />
          <label>Low fuel consumption</label>
          <Checkbox checked={lowFuelConsumption} onChange={handleCheckLowFuelConsumption} />
          <label>Low mileage</label>
          <Checkbox checked={lowKm} onChange={handleCheckLowKm} />
          <TextField
            type="number"
            label="Maximum car age"
            value={age}
            onChange={(event) => setAge(event.target.value)}
          />          
          <label>Luxury cars prefered</label>
          <Checkbox checked={luxury} onChange={handleCheckLuxury} />
          <label>Prefered country of origin</label>
          <Select
            id="country"
            value={country}
            onChange={handleSelectChangeCountry}
          >
            {countryOptionsList}
          </Select>
          <TextField
            label="Prefered make"
            value={make}
            onChange={(event) => setMake(event.target.value)}
          />
          <label>Prefered gear type</label>
          <Select
            id="gear"
            value={gear}
            onChange={handleSelectChangeGear}
          >
            {gearOptionsList}
          </Select>
          <label>Environment-friendly</label>
          <Checkbox checked={environment} onChange={handleCheckEnvironment} />

          <Button variant="contained" color="primary" onClick={submitForm}>
            Send
          </Button>
        </form>
      </Paper>
      {viewCar}
    </Container>
  );
};

export default Query;
