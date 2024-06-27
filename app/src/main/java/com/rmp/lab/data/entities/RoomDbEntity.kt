package com.rmp.lab.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.rmp.lab.data.util.RoomType
import com.rmp.lab.data.util.RoomTypeConverter

@Entity(tableName = "room")
@TypeConverters(RoomTypeConverter::class)
class RoomDbEntity(
    @PrimaryKey(autoGenerate = true) var id: Int? = null,
    @ColumnInfo(name = "room_name") var roomName: String = "",
    @ColumnInfo(name = "room_type") var roomType: RoomType = RoomType.LIVING_ROOM


)