package uz.ictschool.mathgame.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import uz.ictschool.mathgame.R
import uz.ictschool.mathgame.navigation.NavGraph

//@Preview(showBackground = true)
@Composable
fun MainMenuScreen(navController: NavHostController){

    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){

        Image(painter = painterResource(id = R.drawable.menubg),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop)

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = {
                navController.navigate("game_screen")
            },
                modifier = Modifier,
                colors = ButtonDefaults
                    .buttonColors(containerColor = Color.Green),

                ) {
                Text(text = "Easy",
                    modifier = Modifier,
                    fontSize = 25.sp,
                    )
            }

            Spacer(modifier = Modifier.height(30.dp))

            Button(onClick = {
                navController.navigate("game_screen")
            },
                colors = ButtonDefaults
                    .buttonColors(containerColor = Color.Yellow),

                ) {

                Text(text = "Medium",
                    modifier = Modifier,
                    fontSize = 25.sp)
            }

            Spacer(modifier = Modifier.height(30.dp))

            Button(onClick = {
                navController.navigate("game_screen")
            },
                colors = ButtonDefaults
                    .buttonColors(containerColor = Color.Red),

                ) {

                Text(text = "Hard",
                    modifier = Modifier,
                    fontSize = 25.sp)
            }
        }


    }


}
@Preview(showBackground = true)
@Composable
fun test(){

    val navController = rememberNavController()
    NavGraph(navController = navController)
    MainMenuScreen(navController = navController)
}