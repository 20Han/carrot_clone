package com.carrot.clone.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Chatting")
data class Chat(
    @PrimaryKey(autoGenerate= true)
    var id : Long = 0
)
