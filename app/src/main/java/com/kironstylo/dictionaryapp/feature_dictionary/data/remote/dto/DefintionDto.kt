package com.kironstylo.dictionaryapp.feature_dictionary.data.remote.dto

import com.google.gson.annotations.SerializedName
import com.kironstylo.dictionaryapp.feature_dictionary.domain.model.Definition

data class DefintionDto(
    @SerializedName("definition")
    val definition: String = "",
    @SerializedName("example")
    val example: String = ""
){
    fun toDefintion(): Definition {
        return Definition(
            example = example,
            definition = definition
        )
    }
}