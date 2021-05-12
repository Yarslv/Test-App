package com.yprodan.testapp.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.yprodan.testapp.db.entity.Tests

@Dao
interface TestsDao {
    @Query("SELECT * FROM tests")
    fun getAll(): List<Tests>

    @Insert
    fun insert(test: Tests)
}