package com.rmp.lab.data.util

import androidx.room.TypeConverter

class RoomTypeConverter {

    @TypeConverter
    fun toRoomType(input: String) = enumValueOf<RoomType>(input)

    @TypeConverter
    fun fromRoomType(input: RoomType) = input.name

}