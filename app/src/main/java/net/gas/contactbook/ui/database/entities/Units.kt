package net.gas.contactbook.ui.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "units")
data class Units (
    @PrimaryKey val id: Int,
    val name: String?,
    val code: String?,
    val rangir: Int?
)