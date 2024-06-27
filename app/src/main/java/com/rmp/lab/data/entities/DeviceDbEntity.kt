package com.rmp.lab.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.rmp.lab.data.util.DeviceType

@Entity(tableName = "device")
class DeviceDbEntity(
    @PrimaryKey(autoGenerate = true) var id: Long,
    @ColumnInfo(name = "device_name") var deviceName: String,
    @ColumnInfo(name= "type_device") var deviceType: DeviceType,
    @ColumnInfo(name="room_id") var roomId: Long
)

