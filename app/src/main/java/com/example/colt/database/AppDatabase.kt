package com.example.colt.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.example.colt.dao.TaskDao
import com.example.colt.models.Task

@Database(entities = arrayOf(Task::class), version = 1)
abstract class HabitRoomDatabase : RoomDatabase() {
    abstract fun TaskDao(): TaskDao
}