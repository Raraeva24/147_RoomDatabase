package com.example.a147_roomdatabase

import android.app.Application
import com.example.a147_roomdatabase.repositori.ContainerApp
import com.example.a147_roomdatabase.repositori.ContainerDataApp

class AplikasiSiswa : Application() {
    lateinit var container: ContainerApp
    private set
    override fun onCreate(){
        super.onCreate()
        container = ContainerDataApp(this)
    }
}