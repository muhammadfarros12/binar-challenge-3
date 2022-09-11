package com.example.binarchallange3

data class AlphabetModel(
    val alphabet: String,
    val word: Array<String>,
)

val list = arrayListOf(
    AlphabetModel("A", arrayOf("apple", "apa", "appa")),
    AlphabetModel("B", arrayOf("Bajing", "Bagong", "Banjar")),
    AlphabetModel("C", arrayOf("Cicak", "Cangkuang", "Cakwe")),
    AlphabetModel("E", arrayOf("Elang", "Enggrang", "Edge")),
    AlphabetModel("D", arrayOf("Dapur", "Data", "Dataran")),
    AlphabetModel("F", arrayOf("Faputa", "Flaminggo", "Fukouka")),
    AlphabetModel("G", arrayOf("Good Game", "Gala", "Gapura")),
    AlphabetModel("H", arrayOf("Hiu", "Haus", "Hampura")),
    AlphabetModel("I", arrayOf("Ikan", "Iodium", "IPA")),
    AlphabetModel("J", arrayOf("Jack Sparrow", "Jakarta", "JIS")),
)