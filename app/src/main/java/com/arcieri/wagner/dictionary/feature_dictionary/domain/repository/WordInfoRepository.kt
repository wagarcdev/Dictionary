package com.arcieri.wagner.dictionary.feature_dictionary.domain.repository

import com.arcieri.wagner.dictionary.core.util.Resource
import com.arcieri.wagner.dictionary.feature_dictionary.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {

    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>

}