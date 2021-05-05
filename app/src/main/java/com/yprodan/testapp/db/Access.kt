package com.yprodan.testapp.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "access", foreignKeys = [ForeignKey(entity = Users::class, parentColumns = ["id"], childColumns = ["user"]),
    ForeignKey(entity = Tests::class, parentColumns = ["id"], childColumns = ["test"])])
data class Access(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    @ColumnInfo
    var user: Int = 0,
    @ColumnInfo
    var test: Int,
    @ColumnInfo
    var access: Boolean //int
)
