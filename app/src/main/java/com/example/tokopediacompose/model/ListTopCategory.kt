package com.example.tokopediacompose.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.tokopediacompose.R

data class ListTopCategory(
    @DrawableRes val imgTopCategory: Int,
    @StringRes val txtTopCategory: Int
)

val dummyListTopCategory = listOf(
    R.drawable.cicil to R.string.txt_credit,
    R.drawable.cod to R.string.txt_cod,
    R.drawable.computer to R.string.txt_laptop,
    R.drawable.promo to R.string.txt_category_discount,
    R.drawable.official to R.string.txt_official_store,
    R.drawable.paylater to R.string.txt_pay_later
).map { ListTopCategory(it.first, it.second) }