package com.example.quraan.data.remote.remote

import com.example.quraan.model.Ayah
import com.example.quraan.model.Juza
import com.example.quraan.model.QuraanModel
import com.example.quraan.model.Surah
import kotlinx.coroutines.flow.Flow

interface IRemoteDataSource {
    suspend fun getJuz(juzNumber: Int): Flow<Juza>
    suspend fun getSurah(surahNumber: Int): Flow<Surah>
    suspend fun getAyah(ayahNumber: Int): Flow<Ayah>
    suspend fun getQuran(): Flow<QuraanModel>


}