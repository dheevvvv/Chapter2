package com.example.chapter2

const val DEPPP_TES = "Halo"

open class DeliveryFood(private var resto:String, private var jenisPesanan:String ,private var jumlah:Int) {
    fun pengirimanMakanan(){
        print(DEPPP_TES)
        print("$resto mengirim $jenisPesanan dengan jumlah $jumlah")
    }
}

fun main() {
    val deliveryFood = DeliveryFood("Yoshinoya", "esTeh", 10)
    deliveryFood.pengirimanMakanan()
}