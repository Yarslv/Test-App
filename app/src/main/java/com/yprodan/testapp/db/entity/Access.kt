package com.yprodan.testapp.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.yprodan.testapp.db.entity.Tests
import com.yprodan.testapp.db.entity.Users

@Entity(tableName = "access", foreignKeys = [ForeignKey(entity = Users::class, parentColumns = ["id"], childColumns = ["user"]),
    ForeignKey(entity = Tests::class, parentColumns = ["id"], childColumns = ["test"])])
data class Access(
    @PrimaryKey
    var id: Int = 0,
    @ColumnInfo
    var user: Int = 0,
    @ColumnInfo
    var test: Int,
    @ColumnInfo
    var access: Boolean //int
)
