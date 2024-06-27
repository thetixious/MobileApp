package com.rmp.lab.data.util

import android.content.Context
import androidx.room.Database
import androidx.room.Room.databaseBuilder
import androidx.room.RoomDatabase
import com.rmp.lab.data.dao.RoomDao
import com.rmp.lab.data.entities.DeviceDbEntity
import com.rmp.lab.data.entities.RoomDbEntity

@Database(
    version = 2,
    exportSchema = false,
    entities = arrayOf(DeviceDbEntity::class, RoomDbEntity::class)

)
abstract class MainDataBase : RoomDatabase() {
    abstract val roomDao: RoomDao

    companion object {
        fun getDataBase(context: Context): MainDataBase {
            return databaseBuilder(
                context,
                MainDataBase::class.java,
                "smart_house")
                .fallbackToDestructiveMigrationFrom().build()
        }
    }

}