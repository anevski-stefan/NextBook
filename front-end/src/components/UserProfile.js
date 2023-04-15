import * as React from "react";
import Box from "@mui/material/Box";
import Typography from "@mui/material/Typography";
import Grid from "@mui/material/Grid";
import { styled } from "@mui/material/styles";
import Paper from "@mui/material/Paper";

export default function UserProfile() {
  const Item = styled(Paper)(({ theme }) => ({
    backgroundColor: "grey",
    ...theme.typography.body2,
    padding: theme.spacing(1),
    textAlign: "center",
    color: "white",
  }));

  return (
    <>
      <Box align="center" color="grey">
        <Typography variant="h5" align="left">
          User Name
        </Typography>
      </Box>
      <Grid
        container
        rowSpacing={2}
        columnSpacing={{ xs: 1, sm: 2, md: 3 }}
        padding={5}
      >
        <Grid item xs={6}>
          <Item>Borrowed</Item>
        </Grid>
        <Grid item xs={6}>
          <Item>Lent</Item>
        </Grid>
      </Grid>
    </>
  );
}
