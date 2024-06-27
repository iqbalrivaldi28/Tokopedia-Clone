package com.example.tokopediacompose.model

import com.example.tokopediacompose.R

data class ListBanner(
    val imgBanner: Int
)

val dummyListBanner = listOf(
    ListBanner(R.drawable.banner1),
    ListBanner(R.drawable.banner2),
    ListBanner(R.drawable.banner3)
)