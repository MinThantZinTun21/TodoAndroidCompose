package com.mtz.todoandroidcompose.data

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class ToDoDatabase:RoomDatabase() {
    abstract fun todoDao(): ToDoDao

}