package com.example.quraan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.quraan.view.navigation.SetUpNavHost

class MainActivity : ComponentActivity() {
    lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            navController = rememberNavController()
            MainScreen()
        }
    }

    @Composable
    fun MainScreen() {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            ){
            innerPadding ->
            SetUpNavHost(
                modifier = Modifier.padding(innerPadding),
                navController = navController,
            )
        }
    }
}
