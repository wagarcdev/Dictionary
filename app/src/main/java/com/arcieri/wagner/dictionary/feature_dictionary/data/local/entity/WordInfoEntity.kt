package com.arcieri.wagner.dictionary.feature_dictionary.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.arcieri.wagner.dictionary.feature_dictionary.domain.model.Meaning
import com.arcieri.wagner.dictionary.feature_dictionary.domain.model.WordInfo

@Entity
data class WordInfoEntity(

    @PrimaryKey
    val id: Int? = null,
    val meanings: List<Meaning>,
    val phonetic: String,
    val sourceUrls: List<String>,
    val word: String


) {

    fun toWordInfo(): WordInfo {
        return WordInfo(
            meanings = meanings,
            phonetic = phonetic,
            sourceUrls = sourceUrls,
            word = word
        )
    }

}
