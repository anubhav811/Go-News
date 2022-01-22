package com.anubhav.newsapi_mvvmretrofit.db

import androidx.room.TypeConverter
import com.anubhav.newsapi_mvvmretrofit.models.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source) : String{
        return source.name
    }

    @TypeConverter
    fun toSource(name:String) : Source {
        return Source(name,name)
    }
}