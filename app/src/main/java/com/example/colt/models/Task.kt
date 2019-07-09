package com.example.colt.models

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "task")
data class Task(
    @PrimaryKey val id: Int,
    val name: String,
    val description: String)