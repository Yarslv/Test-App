package com.yprodan.testapp.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.yprodan.testapp.db.entity.Answers

@Dao
interface AnswersDao {
    @Query("SELECT * FROM answers")
    fun getAll(): List<Answers>

    @Insert
    fun insert(answer: Answers)
}