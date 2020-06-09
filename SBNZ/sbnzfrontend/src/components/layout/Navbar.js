import React from "react";
import { makeStyles } from "@material-ui/core/styles";
import AppBar from "@material-ui/core/AppBar";
import Toolbar from "@material-ui/core/Toolbar";
import Button from "@material-ui/core/Button";
import IconButton from "@material-ui/core/IconButton";
import MenuIcon from "@material-ui/icons/Menu";

import { Link } from "react-router-dom";

const useStyles = makeStyles((theme) => ({
  root: {
    flexGrow: 1,
  },
  menuButton: {
    marginRight: theme.spacing(2),
  },
  title: {
    flexGrow: 1,
  },
  link: {
    textDecoration: "none",
    color: "white",
  },
}));

const Navbar = () => {
  const classes = useStyles();
  return (
    <div className={classes.root}>
      <AppBar position="static">
        <Toolbar>
          <Button>
            <Link className={classes.link} to="/login">
              Login
            </Link>
          </Button>
          <Button>
            <Link className={classes.link} to="/query">
              Car recommender
            </Link>
          </Button>
          <Button>
            <Link className={classes.link} to="/viewall">
              View All
            </Link>
          </Button>
          <Button>
            <Link className={classes.link} to="/addrule">
              Add Rule
            </Link>
          </Button>
        </Toolbar>
      </AppBar>
    </div>
  );
};

export default Navbar;
