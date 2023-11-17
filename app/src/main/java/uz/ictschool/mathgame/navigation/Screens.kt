package uz.ictschool.mathgame.navigation

sealed class Screens(val route: String) {
    object Splash: Screens("splash_screen")
    object Home: Screens("home_screen")
    object Detail: Screens("Detail_screen")
}