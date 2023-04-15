import * as React from "react";
import { styled } from "@mui/material/styles";
import Grid from "@mui/material/Grid";
import Paper from "@mui/material/Paper";
import Box from "@mui/material/Box";
import Typography from "@mui/material/Typography";

const Item = styled(Paper)(({ theme }) => ({
  backgroundColor: "grey",
  ...theme.typography.body2,
  padding: theme.spacing(1),
  textAlign: "center",
  color: "white",
}));

export default function BookCategories() {
  return (
    <Box marginTop={10} x={{ width: "100%", align: "center" }}>
      <Typography variant="h3" align="center" color="grey">
        Book Categories
      </Typography>
      <Grid
        container
        rowSpacing={2}
        columnSpacing={{ xs: 1, sm: 2, md: 3 }}
        padding={5}
      >
        <Grid item xs={6}>
          <Item>Fantasy</Item>
        </Grid>
        <Grid item xs={6}>
          <Item>Adventure</Item>
        </Grid>
        <Grid item xs={6}>
          <Item>Romance</Item>
        </Grid>
        <Grid item xs={6}>
          <Item>Horror</Item>
        </Grid>
        <Grid item xs={6}>
          <Item>Autobiography</Item>
        </Grid>
        <Grid item xs={6}>
          <Item>Thriller</Item>
        </Grid>
        <Grid item xs={6}>
          <Item>Children</Item>
        </Grid>
        <Grid item xs={6}>
          <Item>History</Item>
        </Grid>
      </Grid>
    </Box>
  );
}
