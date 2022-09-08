package com.example.binarchallange3

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class AlphabetModel(
    val alphabet:String,
    val word: Array<String>,

): Parcelable

val list = arrayListOf(
    AlphabetModel("A", arrayOf("apple", "apa", "appa")),
    AlphabetModel("B", arrayOf("Bajing", "Bagong", "Banjar")),
    AlphabetModel("C", arrayOf("Cicak", "Cangkuang", "Cakwe")),
    AlphabetModel("E", arrayOf("Elang", "apa", "appa")),
    AlphabetModel("D", arrayOf("apple", "apa", "appa")),
    AlphabetModel("F", arrayOf("apple", "apa", "appa")),
    AlphabetModel("G", arrayOf("apple", "apa", "appa")),
    AlphabetModel("H", arrayOf("apple", "apa", "appa")),
    AlphabetModel("I", arrayOf("apple", "apa", "appa")),
    AlphabetModel("J", arrayOf("apple", "apa", "appa")),
)