package com.ryoshu.limbuskiosk.domain

import android.graphics.Bitmap
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "item",
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
            onDelete = ForeignKey.SET_NULL
        )
    ]
)
data class Item(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: ULong,

    @ColumnInfo(name = "name")
    val name: String,

    @ColumnInfo(name = "price")
    val price: Double,

    @ColumnInfo(name = "description")
    val description: String,

    @ColumnInfo(name = "image")
    val image: Bitmap,

    @ColumnInfo(name = "kiosk")
    val kiosk: Short,

    @ColumnInfo(name = "category")
    val category: Int
)
