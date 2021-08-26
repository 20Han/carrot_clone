package com.carrot.clone.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Home")
data class Home(
    @PrimaryKey(autoGenerate= true)
    var id : Long = 0
)
