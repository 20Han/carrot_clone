package com.carrot.clone.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.carrot.clone.model.Home


@Database(entities = [Home::class], version = 1, exportSchema = false)
abstract class HomeDB : RoomDatabase() {
    abstract fun homeDAO() : HomeDAO

    companion object {
        const val DATABASE_NAME = "home.db"
    }
}