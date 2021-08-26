package com.carrot.clone.di

import com.carrot.clone.db.ChattingDAO
import com.carrot.clone.db.HomeDAO
import com.carrot.clone.repository.ChattingRepository
import com.carrot.clone.repository.HomeRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    @Singleton
    @Provides
    fun provideChattingRepository(
        chattingDAO: ChattingDAO
    ) : ChattingRepository{
        return ChattingRepository(chattingDAO)
    }

    @Singleton
    @Provides
    fun provideHomeRepository(
        homeDAO: HomeDAO
    ) : HomeRepository{
        return HomeRepository(homeDAO)
    }
}