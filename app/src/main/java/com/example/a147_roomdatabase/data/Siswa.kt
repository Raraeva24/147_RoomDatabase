package com.example.a147_roomdatabase.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tableSiswa")
data class Siswa(
    @PrimaryKey(autoGenerate = true)
    //srtiap entitas ada primarykey, cara bacanya dia baca baris bawah setelha dia, nanti jadi primary key, ini autogenerate makanya dia true
    val id : Int = 0,
    val nama : String,
    val alamat : String,
    val telpon : String,
    //5 entitas ada 5 tabel, ini ada 5 table  id nama alamat telpon
)
