package com.example.colt.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import com.example.colt.models.Task

@Dao
interface TaskDao {

    @Insert
    fun insert(task: Task)
}