package io.caamp888.sql_sample.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import io.caamp888.sql_sample.data.dao.CityDao
import io.caamp888.sql_sample.data.entity.City

@Database(entities = [City::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun cityDao() : CityDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context = context.applicationContext,
                    klass = AppDatabase::class.java,
                    name = "app_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}