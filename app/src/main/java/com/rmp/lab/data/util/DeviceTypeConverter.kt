package com.rmp.lab.data.util

import androidx.room.TypeConverter

class DeviceTypeConverter {
    @TypeConverter
    fun toDeviceType(input: String) = enumValueOf<DeviceType>(input)

    @TypeConverter
    fun fromDeviceType(input: DeviceType) = input.name

}