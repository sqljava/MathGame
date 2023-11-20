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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import uz.ictschool.mathgame.R
import uz.ictschool.mathgame.navigation.NavGraph
import uz.ictschool.mathgame.navigation.Screens

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
                navController.navigate(Screens.Game.passMaxNum(10))
            },
                modifier = Modifier,
                colors = ButtonDefaults
                    .buttonColors(containerColor = Color.Green),

                ) {
                Text(text = "Easy",
                    modifier = Modifier,
                    fontSize = 25.sp,
                    color = Color.Black)
            }

            Spacer(modifier = Modifier.height(30.dp))

            Button(onClick = {
                navController.navigate(Screens.Game.passMaxNum(50))
            },
                colors = ButtonDefaults
                    .buttonColors(containerColor = Color.Yellow),

                ) {

                Text(text = "Normal",
                    modifier = Modifier,
                    fontSize = 25.sp,
                    color = Color.Black)
            }

            Spacer(modifier = Modifier.height(30.dp))

            Button(onClick = {
                navController.navigate(Screens.Game.passMaxNum(100))
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