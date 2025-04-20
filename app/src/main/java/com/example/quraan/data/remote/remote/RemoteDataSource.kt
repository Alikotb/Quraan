package com.example.quraan.data.remote.remote

import com.example.quraan.data.remote.api.Retrofit
import com.example.quraan.model.Ayah
import com.example.quraan.model.Juza
import com.example.quraan.model.QuraanModel
import com.example.quraan.model.Surah
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class RemoteDataSource : IRemoteDataSource {
    override suspend fun getJuz(juzNumber: Int): Flow<Juza> {
        val response = Retrofit.api.getJuz(juzNumber)
        return flowOf(
            response.body()!!
        )

    }

    override suspend fun getSurah(surahNumber: Int): Flow<Surah> {
        val response = Retrofit.api.getSurah(surahNumber)
        return flowOf(
            response.body()!!
        )

    }

    override suspend fun getAyah(ayahNumber: Int): Flow<Ayah> {
        val response = Retrofit.api.getAyah(ayahNumber)
        return flowOf(
            response.body()!!
        )

    }

    override suspend fun getQuran(): Flow<QuraanModel> {
        val response = Retrofit.api.getQuran()
        return flowOf(
            response.body()!!
        )
    }
}