package com.arcieri.wagner.dictionary.feature_dictionary.data

import androidx.room.TypeConverter
import com.arcieri.wagner.dictionary.feature_dictionary.domain.model.Definition
import com.arcieri.wagner.dictionary.feature_dictionary.domain.model.Meaning
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@OptIn(ExperimentalSerializationApi::class)
class Converters {


    private val meaningAdapter by lazy {
        val moshi = Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()
        val listMyData = Types.newParameterizedType(List::class.java, Meaning::class.java)
        return@lazy moshi.adapter<List<Meaning>>(listMyData)
    }


    private val definitionAdapter by lazy {
        val moshi = Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()
        val listMyData = Types.newParameterizedType(List::class.java, Definition::class.java)
        return@lazy moshi.adapter<List<Definition>>(listMyData)
    }

    @TypeConverter
    fun meaningToJson(meanings: List<Meaning>): String {
        return meaningAdapter.toJson(meanings)
    }

    @TypeConverter
    fun meaningFromJson(json: String) : List<Meaning>? {
        return meaningAdapter.fromJson(json)
    }

    @TypeConverter
    fun definitionToJson(definitions: List<Definition>): String {
        return definitionAdapter.toJson(definitions)
    }

    @TypeConverter
    fun definitionFromJson(json: String) : List<Definition>? {
        return definitionAdapter.fromJson(json)
    }

    @TypeConverter
    fun fromList(value: List<String>) = Json.encodeToString(value)

    @TypeConverter
    fun toList(value: String) = Json.decodeFromString<List<String>>(value)
}