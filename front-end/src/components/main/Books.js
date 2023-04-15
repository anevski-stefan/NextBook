import * as React from "react";
import Box from "@mui/material/Box";
import Typography from "@mui/material/Typography";
import Card from "@mui/material/Card";
import CardMedia from "@mui/material/CardMedia";
import CardContent from "@mui/material/CardContent";
import Button from "@mui/material/Button";

export default function Books() {
  const bookCard = (
    <Box
      sx={{
        flexGrow: 1,
        width: "100vw",
        color: "grey",
        margin: 4,
      }}
      align="center"
    >
      <Typography variant="h3" align="center">
        Books
      </Typography>
      <Card variant="outlined" sx={{ width: "30vw" }}>
        <CardContent>
          <CardMedia
            sx={{ height: "20vh" }}
            image="https://tse4.mm.bing.net/th?id=OIP.2bJ9_f9aKoGCME7ZIff-ZwHaJ4"
          />
          <Typography variant="body2">
            {"Book Title"} <br /> {"Author: "}{" "}
          </Typography>
        </CardContent>
        <Box align="center" margin={2}>
          <Button variant="outlined" color="inherit" size="small">
            Learn More
          </Button>
        </Box>
      </Card>
    </Box>
  );

  return (
    <>
      <div>{bookCard}</div>
      <Box align="center">
        <Button variant="outlined" color="inherit" size="small">
          See more books
        </Button>
      </Box>
    </>
  );
}
