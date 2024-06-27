package com.example.tokopediacompose.model

import com.example.tokopediacompose.R

data class ListItem(
    val image: Int,
    val title: String,
    val price: String
)

val dummyItem = listOf(
    ListItem(R.drawable.ic_computer, "Laptop", "Rp. 12.000.000"),
    ListItem(R.drawable.ic_camera, "Camera", "Rp. 5.000.000"),
    ListItem(R.drawable.ic_food, "Food", "Rp. 5.000.000"),
    ListItem(R.drawable.ic_electronic, "Electronic", "Rp.5.000.000"),
    ListItem(R.drawable.ic_smartphone, "Smartphone", "Rp. 5.000.000")
)

val dummyBestSeller = dummyItem.shuffled();