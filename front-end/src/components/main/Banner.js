import * as React from "react";
import Box from "@mui/material/Box";
import Typography from "@mui/material/Typography";

export default function Banner() {
  return (
    <Box
      marginBottom={10}
      sx={{
        width: "100vw",
        height: "20vh",
        backgroundColor: "grey",
        position: "relative",
        top: 0,
        display: "flex",
        alignItems: "center",
        justifyContent: "center",
      }}
    >
      <Typography
        align="center"
        variant="h4"
        component="div"
        sx={{ flexGrow: 1, color: "white" }}
      >
        Discover a World of Books: Your Online Destination for Free Reading
      </Typography>
    </Box>
  );
}
