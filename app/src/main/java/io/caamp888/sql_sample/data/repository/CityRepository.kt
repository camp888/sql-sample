package io.caamp888.sql_sample.data.repository

import io.caamp888.sql_sample.data.dao.CityDao
import io.caamp888.sql_sample.data.entity.City
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CityRepository(
    val cityDao: CityDao
) {
    suspend fun getAllCities() = withContext(Dispatchers.IO) {
        cityDao.selectCities()
    }
}