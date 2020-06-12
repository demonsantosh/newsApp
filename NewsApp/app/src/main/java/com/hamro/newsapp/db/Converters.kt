package com.hamro.newsapp.db


import androidx.room.TypeConverter
import com.hamro.newsapp.response.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}