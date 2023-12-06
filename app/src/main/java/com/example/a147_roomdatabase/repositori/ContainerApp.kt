package com.example.a147_roomdatabase.repositori

import android.content.Context
import com.example.a147_roomdatabase.data.DatabaseSiswa

interface ContainerApp {
    val repositoriSiswa : RepositoriSiswa
}

class ContainerDataApp(private val context: Context): ContainerApp{
    override val repositoriSiswa: RepositoriSiswa by lazy {
        OfflineRepositoriSiswa(DatabaseSiswa.getDatabase(context).SiswaDao())
    }
}