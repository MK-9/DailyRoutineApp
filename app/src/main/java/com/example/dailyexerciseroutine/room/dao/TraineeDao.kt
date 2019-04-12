package com.example.dailyexerciseroutine.room.dao

import android.arch.persistence.room.*
import com.example.dailyexerciseroutine.room.entity.Trainee

@Dao
interface TraineeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTrainee(trainee: Trainee)

    @Update
    fun updateTrainee(trainee: Trainee)

    @Delete
    fun deleteTrainee(trainee: Trainee)

    @Query("Select* from Trainee where name = :nameToFind")
    fun getUserByName(nameToFind: String): List<Trainee>
}