package com.example.a141_roomdatabase.view.route

interface DestinasiNavigasi {
    /**
     * Nama unik untuk menentukan jalur composable
     */
    val route: String

    /**
     * String resource ID yang berisi judul yang akan ditampilkan di layar halaman
     */
    val titleRes: Int
}