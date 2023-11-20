package uz.ictschool.mathgame.navigation

const val GAME_MAX_NUM = "maxNum"

sealed class Screens(val route: String) {
    object Splash: Screens("splash_screen")
    object MainMenu: Screens("main_menu_screen")
    object Game: Screens("game_screen/{$GAME_MAX_NUM}"){
        fun passMaxNum(num: Int):String{
            return this.route.replace(
                oldValue = "{$GAME_MAX_NUM}",
                newValue = num.toString())
        }
    }
}