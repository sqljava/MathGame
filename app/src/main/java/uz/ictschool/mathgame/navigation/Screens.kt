package uz.ictschool.mathgame.navigation

sealed class Screens(val route: String) {
    object Splash: Screens("splash_screen")
    object MainMenu: Screens("main_menu_screen")
    object Game: Screens("game_screen")
}