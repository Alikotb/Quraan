package com.example.quraan.model

data class Juza(
    val code: Int,
    val `data`: Data,
    val status: String
) {

    data class Data(
        val ayahs: List<Ayah>,
        val edition: Edition,
        val number: Int,
        val surahs: Surahs
    )

    data class Ayah(
        val hizbQuarter: Int,
        val juz: Int,
        val manzil: Int,
        val number: Int,
        val numberInSurah: Int,
        val page: Int,
        val ruku: Int,
        val sajda: Boolean,
        val surah: Surah,
        val text: String
    )

    data class Edition(
        val direction: String,
        val englishName: String,
        val format: String,
        val identifier: String,
        val language: String,
        val name: String,
        val type: String
    )

    data class Surahs(
        val `100`: X100,
        val `101`: X100,
        val `102`: X100,
        val `103`: X100,
        val `104`: X100,
        val `105`: X100,
        val `106`: X100,
        val `107`: X100,
        val `108`: X100,
        val `109`: X100,
        val `110`: X100,
        val `111`: X100,
        val `112`: X100,
        val `113`: X100,
        val `114`: X100,
        val `78`: X100,
        val `79`: X100,
        val `80`: X100,
        val `81`: X100,
        val `82`: X100,
        val `83`: X100,
        val `84`: X100,
        val `85`: X100,
        val `86`: X100,
        val `87`: X100,
        val `88`: X100,
        val `89`: X100,
        val `90`: X100,
        val `91`: X100,
        val `92`: X100,
        val `93`: X100,
        val `94`: X100,
        val `95`: X100,
        val `96`: X100,
        val `97`: X100,
        val `98`: X100,
        val `99`: X100
    )

    data class Surah(
        val englishName: String,
        val englishNameTranslation: String,
        val name: String,
        val number: Int,
        val numberOfAyahs: Int,
        val revelationType: String
    )

    data class X100(
        val englishName: String,
        val englishNameTranslation: String,
        val name: String,
        val number: Int,
        val numberOfAyahs: Int,
        val revelationType: String
    )
}