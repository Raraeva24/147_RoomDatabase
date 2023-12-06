package com.example.a147_roomdatabase.data

import android.content.Context
import android.provider.CalendarContract.Instances
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Siswa::class], version = 1, exportSchema = false)
abstract class DatabaseSiswa : RoomDatabase(){
    abstract fun siswaDao() : SiswaDao

    companion object{
        @Volatile
        private var  instance : DatabaseSiswa? = null

        fun getDatabase(context: Context): DatabaseSiswa {
            return (instance ?: synchronized(this) {
                Room.databaseBuilder(context, DatabaseSiswa::class.java, "siswa_database").build()
                    .also { instance = it }
            })
        }
    }
}