import * as React from "react";
import Box from "@mui/material/Box";
import Toolbar from "@mui/material/Toolbar";
import Typography from "@mui/material/Typography";
import { Link, Stack } from "@mui/material";

export default function Footer() {
  return (
    <Box
      sx={{
        flexGrow: 1,
        maxWidth: "100vw",
        height: "10vh",
        bgcolor: "grey",
        padding: 5,
      }}
    >
      <Toolbar sx={{ color: "white" }}>
        <Stack align="left" sx={{ flexGrow: 1 }}>
          <Typography variant="h6">NextBook</Typography>
          <Typography>Some where,</Typography>
          <Typography>Some place,</Typography>
          <Typography>On this planet</Typography>

          <Typography>Copyright © 2023 NextBook</Typography>
        </Stack>
        <Stack align="right" spacing={2}>
          <Link color="inherit">Books</Link>
          <Link color="inherit">About Us</Link>
          <Link color="inherit">Contact</Link>
        </Stack>
      </Toolbar>
    </Box>
  );
}
