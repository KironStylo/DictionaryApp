package com.kironstylo.dictionaryapp.feature_dictionary.data.remote.dto

import com.google.gson.annotations.SerializedName
import com.kironstylo.dictionaryapp.feature_dictionary.domain.model.Meaning

data class MeaningsDto(
    @SerializedName("antonyms")
    val antonyms: List<String>?,
    @SerializedName("synonyms")
    val synonyms: List<String>?,
    @SerializedName("partOfSpeech")
    val partOfSpeech: String = "",
    @SerializedName("definitions")
    val definitions: List<DefintionDto>?
){
    fun toMeaning(): Meaning{
        return Meaning(
            definitions = definitions?.map{ definition -> definition.toDefintion()},
            partOfSpeech = partOfSpeech,
            synonyms = synonyms,
            antonyms = antonyms
        )
    }
}