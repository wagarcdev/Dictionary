package com.arcieri.wagner.dictionary.feature_dictionary.data.util

import androidx.room.TypeConverter
import androidx.room.TypeConverters
import java.lang.reflect.Type

interface JsonParser {

    fun <T> fromJson(json: String, type: Type): T?


    fun <T> toJson(obj: T, type: Type): String?


}