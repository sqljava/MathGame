package uz.ictschool.mathgame.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

//@Preview(showBackground = true)
@Composable
fun MainMenuScreen(navController: NavHostController){

    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){

        Button(onClick = {
                         navController.navigate("game_screen")
        },
            colors = ButtonDefaults
                .buttonColors(containerColor = Color.Gray),

            ) {

            Text(text = "Play",
                modifier = Modifier,
                fontSize = 25.sp)
        }
    }

}