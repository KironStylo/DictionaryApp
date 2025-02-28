package com.kironstylo.dictionaryapp.feature_dictionary.data.remote.dto

import com.google.gson.annotations.SerializedName
import com.kironstylo.dictionaryapp.feature_dictionary.data.local.entity.WordInfoEntity
import com.kironstylo.dictionaryapp.feature_dictionary.domain.model.WordInfo

data class WordInfoDto(
    @SerializedName("license")
    val license: LicenseDto,
    @SerializedName("phonetic")
    val phonetic: String? = "",
    @SerializedName("phonetics")
    val phonetics: List<PhoneticsDto>?,
    @SerializedName("word")
    val word: String = "",
    @SerializedName("meanings")
    val meanings: List<MeaningsDto>?,
    @SerializedName("sourceUrls")
    val sourceUrls: List<String>?
){
    fun toWordInfoEntity(): WordInfoEntity {
        return WordInfoEntity(
            meanings = meanings?.map{ meaning -> meaning.toMeaning()} ?: emptyList(),
            word = word,
            phonetic = phonetic ?:""
        )
    }
}