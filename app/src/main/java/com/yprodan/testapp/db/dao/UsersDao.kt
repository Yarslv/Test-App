package com.yprodan.testapp.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.yprodan.testapp.db.entity.Users

@Dao
interface UsersDao {
    @Query("SELECT * FROM users")
    fun getAll(): List<Users>

    @Query("SELECT * FROM users WHERE login LIKE :login")
    fun getByLogin(login: String): Users

    @Insert
    fun insert(user: Users)
}