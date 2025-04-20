package com.example.quraan.data.remote.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Retrofit {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.alquran.cloud/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val api: Service by lazy {
        retrofit.create(Service::class.java)
    }

}