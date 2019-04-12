package com.example.dailyexerciseroutine.room.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class Exercise(
    @PrimaryKey(autoGenerate = true)
    val exerciseId: Int,
    val name: String,
    val repetition: String,
    @ColumnInfo(name = "machine-name")
    val machineName: String,
    val liftedWeight: Int
)