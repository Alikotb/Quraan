package com.example.quraan.data.repository

import com.example.quraan.data.remote.remote.IRemoteDataSource
import com.example.quraan.model.Ayah
import com.example.quraan.model.Juza
import com.example.quraan.model.QuraanModel
import com.example.quraan.model.Surah
import kotlinx.coroutines.flow.Flow

class Repository(private val remoteDataSource: IRemoteDataSource):IRepository{
    override suspend fun getJuz(juzNumber: Int): Flow<Juza> {
        return remoteDataSource.getJuz(juzNumber)

    }

    override suspend fun getSurah(surahNumber: Int): Flow<Surah> {
        return remoteDataSource.getSurah(surahNumber)
    }

    override suspend fun getAyah(ayahNumber: Int): Flow<Ayah> {
        return remoteDataSource.getAyah(ayahNumber)
    }

    override suspend fun getQuran(): Flow<QuraanModel> {
        return remoteDataSource.getQuran()
    }

}