package com.example.dailyexerciseroutine.room.converter

import android.arch.persistence.room.TypeConverter
import com.example.dailyexerciseroutine.room.entity.Exercise
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.util.*

class ListConverter {

    private var gson = Gson()

    @TypeConverter
    fun converter(data: String?): List<Exercise> {

        if (data == null) {
            return Collections.emptyList()
        }

        val listType = object : TypeToken<ArrayList<Exercise>>() {}.type

        return gson.fromJson(data, listType)
    }
}