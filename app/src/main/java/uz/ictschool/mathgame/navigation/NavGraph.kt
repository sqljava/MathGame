package uz.ictschool.mathgame.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import uz.ictschool.mathgame.screens.GameScreen
import uz.ictschool.mathgame.screens.MainMenuScreen
import uz.ictschool.mathgame.screens.SplashScreen

@Composable
fun NavGraph (navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = Screens.Splash.route)
    {
        composable(route = Screens.Splash.route){
            SplashScreen(navController)
        }
        composable(route = Screens.MainMenu.route){
            MainMenuScreen(navController)
        }
        composable(route = Screens.Game.route){
            GameScreen()
        }
    }
}