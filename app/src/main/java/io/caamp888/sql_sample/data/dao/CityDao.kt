package io.caamp888.sql_sample.data.dao

import androidx.room.Dao
import androidx.room.Query
import io.caamp888.sql_sample.data.entity.City
import kotlinx.coroutines.flow.Flow

@Dao
interface CityDao {
    @Query("select * from city")
    suspend fun selectCities() : List<City>

    @Query("select * from city where name = :name")
    suspend fun selectByName(name: String) : City
}