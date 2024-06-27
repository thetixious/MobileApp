package com.rmp.lab.data.entities

import androidx.room.Embedded
import androidx.room.Relation


 class RoomWithDevices(
    @Embedded var room: RoomDbEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "room_id"
    )
    var devices: List<DeviceDbEntity>
)