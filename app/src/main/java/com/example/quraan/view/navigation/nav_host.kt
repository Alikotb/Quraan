package com.example.quraan.view.navigation
import androidx.navigation.compose.NavHost
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.quraan.model.ScreensRout
import com.example.quraan.view.home.HomeScreen
import com.example.quraan.view.splash.SplashScreen

@Composable
fun SetUpNavHost(
    navController: NavHostController,
    modifier: Modifier
){
    NavHost(
        navController = navController,
        startDestination = ScreensRout.Splash
    ){
        composable<ScreensRout.Splash> {
            SplashScreen(
            ) {
                navController.popBackStack()
                navController.navigate(ScreensRout.Home)
            }
        }
        composable<ScreensRout.Home> {
            HomeScreen()
        }


    }
}