package com.ryoshu.limbuskiosk.domain

import android.graphics.Bitmap
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "kiosk")
data class Kiosk(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Short,

    @ColumnInfo(name = "name")
    val name: String,

    @ColumnInfo(name = "image")
    val image: Bitmap? = null,

    @ColumnInfo(name = "description")
    val description: String
) {
}