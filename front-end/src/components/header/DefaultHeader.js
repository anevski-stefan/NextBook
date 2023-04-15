import * as React from "react";
import Box from "@mui/material/Box";
import Toolbar from "@mui/material/Toolbar";
import Typography from "@mui/material/Typography";
import Button from "@mui/material/Button";

export default function DefaultHeader() {
  return (
    <Box sx={{ flexGrow: 1, width: "100vw", bgcolor: "grey" }}>
      <Toolbar sx={{ color: "white" }}>
        <Typography
          variant="h6"
          component="div"
          sx={{ flexGrow: 1 }}
          align="left"
        >
          NextBook
        </Typography>
        <Button color="inherit">Books</Button>
        <Button color="inherit">About Us</Button>
        <Button color="inherit">Contact</Button>
        <Button color="inherit">Login / Sign Up</Button>
      </Toolbar>
    </Box>
  );
}
