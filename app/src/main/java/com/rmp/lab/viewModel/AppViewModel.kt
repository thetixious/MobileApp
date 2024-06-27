package com.rmp.lab.viewModel

import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.CreationExtras
import com.rmp.lab.data.entities.RoomDbEntity
import com.rmp.lab.data.repo.RoomRepository
import com.rmp.lab.data.util.RoomType
import kotlinx.coroutines.launch

class AppViewModel(private val roomRepository: RoomRepository) : ViewModel() {

    val compSelectedRoom = mutableStateOf(RoomDbEntity())
    var selectedRoom: State<RoomDbEntity> = compSelectedRoom

    var roomName by mutableStateOf("")
    var roomType: RoomType by mutableStateOf(RoomType.BED_ROOM)
    var roomList by mutableStateOf<List<RoomDbEntity>>(emptyList())


    init {
        viewModelScope.launch {
            roomRepository.getAll().collect { items -> roomList = items }
        }
    }

    fun getById(id: Long) {
        viewModelScope.launch {
            roomRepository.getById(id).collect { item ->
                compSelectedRoom.value = item
            }
        }
    }

    fun addRoom() = viewModelScope.launch {
            roomRepository.addRoom(RoomDbEntity(roomName = roomName, roomType = roomType))
        }


    companion object {
        val factory: ViewModelProvider.Factory = object : ViewModelProvider.Factory {
            @Suppress("UNCHECKED_CAST")
            override fun <T : ViewModel> create(
                modelClass: Class<T>,
                extras: CreationExtras
            ): T {
                val database = (checkNotNull(extras[APPLICATION_KEY]) as App).database
                val roomDao = database.roomDao
                val repository = RoomRepository(roomDao)
                return AppViewModel(repository) as T
            }
        }
    }

}



