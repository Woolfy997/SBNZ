import React, { useState } from 'react';
import './App.css';

import Navbar from "./components/layout/Navbar";
import Overview from "./components/cars/Overview";
import Query from "./components/cars/Query";
import Login from "./components/user/Login";
import Add from "./components/cars/Add";

import { BrowserRouter as Router, Switch, Route } from "react-router-dom";

function App() {
  const [accessToken] = useState(localStorage.getItem("access_token"));

  return (
    <div className="App">
      <Router>
        <Navbar />
        <Switch>
          <Route path="/query">
            <Query />
          </Route>
          <Route path="/viewall">
            <Overview />
          </Route>
          <Route path="/login">
            <Login />
          </Route>
          <Route path="/addrule">
            <Add accessToken={accessToken}/>
          </Route>
        </Switch>
      </Router>
    </div>
  );
}

export default App;
