package com.example.dailyexerciseroutine.room.dao

import android.arch.persistence.room.*
import com.example.dailyexerciseroutine.room.entity.Routine
import java.util.*

@Dao
interface RoutineDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRoutine(routine: Routine)

    @Update
    fun updateRoutine(routine: Routine)

    @Delete
    fun deleteRoutine(routine: Routine)

    @Query("Select* from `trainee-routine` where `due-date` >= :date")
    fun getRoutineByDueDate(date: Date): List<Routine>
}