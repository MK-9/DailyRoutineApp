package com.example.dailyexerciseroutine.room.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.arch.persistence.room.TypeConverters
import com.example.dailyexerciseroutine.room.converter.ListConverter
import java.util.*

@Entity(tableName = "trainee-routine")
data class Routine(
    @PrimaryKey(autoGenerate = true)
    val routineId: Int,
    @ColumnInfo(name = "due-date")
    val dueDay: Date,
    @TypeConverters(ListConverter::class)
    val exercises: List<Exercise>
)