package com.rmp.lab.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.TypeConverters
import com.rmp.lab.data.entities.RoomDbEntity
import com.rmp.lab.data.util.RoomTypeConverter
import kotlinx.coroutines.flow.Flow

@Dao
@TypeConverters(RoomTypeConverter::class)
interface RoomDao {
    @Query("SELECT * FROM room WHERE id = :roomId")
    fun getRoomWithDevices(roomId: Long): Flow<RoomDbEntity>

    @Query("SELECT * FROM room")
     fun getAll(): Flow<List<RoomDbEntity>>

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRoom(vararg rooms: RoomDbEntity)

//    @Query("SELECT * FROM room")
//    fun getAllDevicesFromRoom(roomId: Long): Flow<List<DeviceDbEntity>>
}