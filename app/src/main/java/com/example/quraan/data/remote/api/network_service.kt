package com.example.quraan.data.remote.api


import com.example.quraan.model.Ayah
import com.example.quraan.model.Juza
import com.example.quraan.model.QuraanModel
import com.example.quraan.model.Surah
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface Service{

    @GET("juz/{juzNumber}/quran-uthmani")
    suspend fun getJuz(@Path("juzNumber") juzNumber: Int): Response<Juza>

    @GET("surah/{surahNumber}")
    suspend fun getSurah(@Path("surahNumber") surahNumber: Int): Response<Surah>

    @GET("ayah/{ayahNumber}")
    suspend fun getAyah(@Path("ayahNumber") ayahNumber: Int): Response<Ayah>

    @GET("quran/quran-uthmani")
    suspend fun getQuran(): Response<QuraanModel>

}