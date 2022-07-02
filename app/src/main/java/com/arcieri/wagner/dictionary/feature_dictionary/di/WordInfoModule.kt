package com.arcieri.wagner.dictionary.feature_dictionary.di

import android.app.Application
import androidx.room.Room
import com.arcieri.wagner.dictionary.feature_dictionary.data.Converters
import com.arcieri.wagner.dictionary.feature_dictionary.data.local.WordInfoDatabase
import com.arcieri.wagner.dictionary.feature_dictionary.data.remote.DictionaryAPI
import com.arcieri.wagner.dictionary.feature_dictionary.data.repository.WordInfoRepositoryImpl
import com.arcieri.wagner.dictionary.feature_dictionary.data.util.GsonParser
import com.arcieri.wagner.dictionary.feature_dictionary.domain.repository.WordInfoRepository
import com.arcieri.wagner.dictionary.feature_dictionary.domain.use_cases.GetWordInfo
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object WordInfoModule {

    @Provides
    @Singleton
    fun provideGetWordInfoUseCase(repository: WordInfoRepository): GetWordInfo {
        return GetWordInfo(repository)
    }

    @Provides
    @Singleton
    fun provideWordInfoRepository(api: DictionaryAPI, db: WordInfoDatabase): WordInfoRepository {
        return WordInfoRepositoryImpl(api, db.dao)
    }

    @Provides
    @Singleton
    fun provideWordInfoDatabase(app: Application): WordInfoDatabase {
        return Room.databaseBuilder(
            app,
            WordInfoDatabase::class.java,
            "word_db"
        ).build()
    }


    @Provides
    @Singleton
    fun providesDictionaryAPI(): DictionaryAPI {
        return Retrofit.Builder()
            .baseUrl(DictionaryAPI.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(DictionaryAPI::class.java)
    }

}