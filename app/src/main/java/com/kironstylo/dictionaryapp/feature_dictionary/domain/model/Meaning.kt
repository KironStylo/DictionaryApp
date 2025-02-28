package com.kironstylo.dictionaryapp.feature_dictionary.domain.model

data class Meaning(
    val definitions: List<Definition>?,
    val partOfSpeech: String,
    val synonyms: List<String>?,
    val antonyms: List<String>?
)
