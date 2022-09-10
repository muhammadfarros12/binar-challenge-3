package com.example.binarchallange3.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class AlphabetModel(
    val alphabet:String,
    val word: ArrayList<String>,

): Parcelable

val list = arrayListOf(
    AlphabetModel("A", arrayListOf("apple", "apa", "appa")),
    AlphabetModel("B", arrayListOf("Bajing", "Bagong", "Banjar")),
    AlphabetModel("C", arrayListOf("Cicak", "Cangkuang", "Cakwe")),
    AlphabetModel("E", arrayListOf("Elang", "Enggrang", "Edge")),
    AlphabetModel("D", arrayListOf("Dapur", "Data", "Dataran")),
    AlphabetModel("F", arrayListOf("Faputa", "Flaminggo", "Fukouka")),
    AlphabetModel("G", arrayListOf("Good Game", "Gala", "Gapura")),
    AlphabetModel("H", arrayListOf("Hiu", "Haus", "Hampura")),
    AlphabetModel("I", arrayListOf("Ikan", "Iodium", "IPA")),
    AlphabetModel("J", arrayListOf("Jack Sparrow", "Jakarta", "JIS")),
)