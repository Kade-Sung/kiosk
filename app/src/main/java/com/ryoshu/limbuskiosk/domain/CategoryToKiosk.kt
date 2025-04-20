package com.ryoshu.limbuskiosk.domain

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "category",
    foreignKeys = [
        ForeignKey(
            entity = Kiosk::class,
            parentColumns = ["id"],
            childColumns = ["kiosk"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = Category::class,
            parentColumns = ["id"],
            childColumns = ["category"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class CategoryToKiosk(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: ULong,

    @ColumnInfo(name = "category")
    val category: Int,

    @ColumnInfo(name = "kiosk")
    val kiosk: Short
)
