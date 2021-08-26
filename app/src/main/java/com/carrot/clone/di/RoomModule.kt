package com.carrot.clone.di

import android.content.Context
import androidx.room.Room
import com.carrot.clone.db.ChattingDAO
import com.carrot.clone.db.ChattingDB
import com.carrot.clone.db.HomeDAO
import com.carrot.clone.db.HomeDB
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RoomModule {
    @Singleton
    @Provides
    fun provideHomeDatabase(@ApplicationContext context: Context) : HomeDB {
        return Room
            .databaseBuilder(
                context,
                HomeDB::class.java,
                HomeDB.DATABASE_NAME)
            .build()
    }

    @Singleton
    @Provides
    fun provideHomeDAO(homeDB: HomeDB): HomeDAO {
        return homeDB.homeDAO()
    }

    @Singleton
    @Provides
    fun provideChattingDatabase(@ApplicationContext context: Context) : ChattingDB {
        return Room
            .databaseBuilder(
                context,
                ChattingDB::class.java,
                ChattingDB.DATABASE_NAME)
            .build()
    }

    @Singleton
    @Provides
    fun provideChattingDAO(chattingDB: ChattingDB): ChattingDAO {
        return chattingDB.chattingDao()
    }
}