import * as React from "react";
import { styled } from "@mui/material/styles";
import Grid from "@mui/material/Grid";
import Paper from "@mui/material/Paper";
import Box from "@mui/material/Box";
import Card from "@mui/material/Card";
import CardMedia from "@mui/material/CardMedia";
import CardContent from "@mui/material/CardContent";
import Button from "@mui/material/Button";
import Typography from "@mui/material/Typography";
import Comments from "./main/Comments";

export default function BookDetailsPage() {
  return (
    <>
      <Box marginTop={10} sx={{ width: "100%", align: "center" }}>
        <Typography variant="h5" align="left" color="grey">
          Book Title
        </Typography>

        <Grid container direction="row" justifyContent="space-evenly">
          <Box sx={{ width: "30vw" }}>
            <CardContent>
              <CardMedia
                sx={{ height: "20vh" }}
                image="https://tse4.mm.bing.net/th?id=OIP.2bJ9_f9aKoGCME7ZIff-ZwHaJ4"
              />
            </CardContent>
            <Box align="center" margin={2}>
              <Button
                sx={{ width: "100%" }}
                variant="outlined"
                color="inherit"
                size="small"
              >
                Borrow
              </Button>
            </Box>
          </Box>
          <Box sx={{ width: "70vw" }}>
            <Typography>
              Book description............................
            </Typography>
            <Typography>Star Rating:</Typography>
          </Box>
        </Grid>
      </Box>
      <Comments />
    </>
  );
}
