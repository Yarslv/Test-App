package com.yprodan.testapp.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.yprodan.testapp.db.dao.AnswersDao
import com.yprodan.testapp.db.dao.TestsDao
import com.yprodan.testapp.db.dao.UsersDao
import com.yprodan.testapp.db.entity.Answers
import com.yprodan.testapp.db.entity.Questions
import com.yprodan.testapp.db.entity.Tests
import com.yprodan.testapp.db.entity.Users

@Database(entities = [Answers::class, Tests::class, Users::class, Questions::class], version = 1)
abstract class DataBase : RoomDatabase() {

    abstract fun answersDao(): AnswersDao
    abstract fun testsDao(): TestsDao
    abstract fun usersDao(): UsersDao
}