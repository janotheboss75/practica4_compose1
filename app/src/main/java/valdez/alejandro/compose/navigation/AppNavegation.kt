package valdez.alejandro.compose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import valdez.alejandro.compose.ui.components.FilmCard
import valdez.alejandro.compose.ui.screens.FilmsScreen
import valdez.alejandro.compose.ui.screens.LoginScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.LOGIN_SCREEN){
        composable(Routes.LOGIN_SCREEN){
            LoginScreen(onLogginSuccess = {navController.navigate(Routes.FILMS_SCREEN)})
        }
        composable(Routes.FILMS_SCREEN){
            FilmsScreen()
        }
    }
}


object Routes{
    const val  LOGIN_SCREEN = "login"
    const val FILMS_SCREEN = "list"
}