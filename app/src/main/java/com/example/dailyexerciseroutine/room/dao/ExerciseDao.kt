package com.example.dailyexerciseroutine.room.dao

import android.arch.persistence.room.*
import com.example.dailyexerciseroutine.room.entity.Exercise

@Dao
interface ExerciseDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertDayRoutine(exercise: Exercise)

    @Update
    fun updateDayRoutine(exercise: Exercise)

    @Delete
    fun deleteDayRoutine(exercise: Exercise)

    @Query("SELECT* FROM Exercise where name = :name")
    fun getExerciseByName(name: String): List<Exercise>

}