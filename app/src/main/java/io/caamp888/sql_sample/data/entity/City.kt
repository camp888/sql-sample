package io.caamp888.sql_sample.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class City(
    @PrimaryKey val id: Int,
    val name: String,
    val loc: String
)
