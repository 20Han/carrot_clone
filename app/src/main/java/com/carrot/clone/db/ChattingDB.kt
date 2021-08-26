package com.carrot.clone.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.carrot.clone.model.Chat

@Database(entities = [Chat::class], version = 1, exportSchema = false)
abstract class ChattingDB : RoomDatabase() {
    abstract fun chattingDao() : ChattingDAO

    companion object {
        const val DATABASE_NAME = "chatting.db"
    }
}