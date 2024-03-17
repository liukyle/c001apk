package com.example.c001apk.logic.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.c001apk.logic.dao.HistoryFavoriteDao
import com.example.c001apk.logic.model.FeedEntity

@Database(version = 1, entities = [FeedEntity::class])
abstract class BrowseHistoryDatabase : RoomDatabase() {
    abstract fun browseHistoryDao(): HistoryFavoriteDao
}