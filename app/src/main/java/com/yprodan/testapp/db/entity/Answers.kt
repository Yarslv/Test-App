package com.yprodan.testapp.db.entity

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
    @ColumnInfo(name = "question", index = true)
    var question: Int
)
