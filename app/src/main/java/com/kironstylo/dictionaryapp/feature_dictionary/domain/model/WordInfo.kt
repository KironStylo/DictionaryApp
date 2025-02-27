package com.kironstylo.dictionaryapp.feature_dictionary.domain.model

data class WordInfo(
    val meanings: List<Meaning>?,
    val word: String,
    val phonetic:String,
)
