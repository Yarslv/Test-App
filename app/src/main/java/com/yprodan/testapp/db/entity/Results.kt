package com.yprodan.testapp.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "results", foreignKeys = [ForeignKey(entity = Users::class, parentColumns = ["id"], childColumns = ["user"]),
    ForeignKey(entity = Tests::class, parentColumns = ["id"], childColumns = ["test"])])
data class Results(
    @PrimaryKey
    var id:Int,
    @ColumnInfo
    var date: Date,
    @ColumnInfo
    var score:Float,
    @ColumnInfo
    var question: Int,//lol
    @ColumnInfo
    var user:Int,
    @ColumnInfo
    var test:Int
)
