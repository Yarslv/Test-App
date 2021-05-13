package com.yprodan.testapp.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Users(
    @PrimaryKey
    var id: Int,
    @ColumnInfo
    var login: String,
    @ColumnInfo
    var password: String,
    @ColumnInfo
    var firstName: String,
    @ColumnInfo
    var lastName: String,
    @ColumnInfo
    var role: Int
)
