package com.rmp.lab.data.repo

import com.rmp.lab.data.dao.RoomDao
import com.rmp.lab.data.entities.RoomDbEntity
import kotlinx.coroutines.flow.Flow

class RoomRepository(private val roomDao: RoomDao) {

    fun getById(id: Long): Flow<RoomDbEntity> {
        return roomDao.getRoomWithDevices(id)
    }

     fun getAll():Flow<List<RoomDbEntity>>{
        return roomDao.getAll()
    }

    suspend fun addRoom(vararg room:RoomDbEntity){
        return roomDao.insertRoom(*room)
    }


}