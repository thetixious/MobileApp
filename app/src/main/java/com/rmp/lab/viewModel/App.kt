package com.rmp.lab.viewModel

import android.app.Application
import com.rmp.lab.data.util.MainDataBase

class App : Application() {
    val database by lazy { MainDataBase.getDataBase(this) }
}