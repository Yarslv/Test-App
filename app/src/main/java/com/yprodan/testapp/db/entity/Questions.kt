package com.yprodan.testapp.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(foreignKeys = [ForeignKey(entity = Tests::class, parentColumns = ["id"], childColumns = ["test"])])
data class Questions(
    @PrimaryKey
    var id: Int,
    @ColumnInfo
    var text: String,
    @ColumnInfo
    var type: Int,
    @ColumnInfo
    var test: Int
)
