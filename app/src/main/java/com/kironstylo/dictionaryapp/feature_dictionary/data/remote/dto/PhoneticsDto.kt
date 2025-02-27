package com.kironstylo.dictionaryapp.feature_dictionary.data.remote.dto

import com.google.gson.annotations.SerializedName

data class PhoneticsDto(
    @SerializedName("sourceUrl")
    val sourceUrl: String = "",
    @SerializedName("license")
    val licenseDto: LicenseDto,
    @SerializedName("text")
    val text: String = "",
    @SerializedName("audio")
    val audio: String = ""
)