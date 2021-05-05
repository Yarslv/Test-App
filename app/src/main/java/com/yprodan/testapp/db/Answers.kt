package com.yprodan.testapp.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(foreignKeys = [ForeignKey(entity = Questions::class, parentColumns = ["id"], childColumns = ["question"])])
data class Answers(
    @PrimaryKey
    var id: Int,
    @ColumnInfo
    var text: String,
    @ColumnInfo
    var score: Float,
    @ColumnInfo
    var question: Int
)
