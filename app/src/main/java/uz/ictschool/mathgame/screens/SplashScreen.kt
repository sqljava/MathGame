package uz.ictschool.mathgame.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.delay
import uz.ictschool.mathgame.R
import uz.ictschool.mathgame.navigation.NavGraph


@Composable
fun SplashScreen(navController: NavHostController){

    LaunchedEffect(key1 = true){
        delay(2000)
        navController.navigate("main_menu_screen")

    }

    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center){

        Image(painter = painterResource(
            id = R.drawable.splashimg),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            contentScale = ContentScale.Crop)
    }
}

@Preview(showBackground = true)
@Composable
fun TestSplash(){
    val navController = rememberNavController()
    NavGraph(navController = navController)
    SplashScreen(navController)
}
