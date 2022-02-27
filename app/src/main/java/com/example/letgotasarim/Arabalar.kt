package com.example.letgotasarim

import java.io.Serializable

data class Arabalar(
    var arabaId: Int,
    var arabaMarka: String,
    var arabaAciklama: String,
    var arabaResimAdi: String,
    var arabaYili: Int,
    var arabaFiyat: Int,
    var arabaKm: String,
    var arabaLokasyon: String


) : Serializable {
}