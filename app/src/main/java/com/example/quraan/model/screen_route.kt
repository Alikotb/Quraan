package com.example.quraan.model


import kotlinx.serialization.Serializable

sealed class ScreensRout {
    @Serializable
    object Splash : ScreensRout()
    @Serializable
    object Home : ScreensRout()

}
