package com.example.tokopediacompose.utils

import com.example.tokopediacompose.model.ListCategory

val keys = kotlin.collections.mutableListOf<Int>()
fun itemKey(index: ListCategory): Int {
    while (true) {
        val key = Random.nextInt()
        if (!keys.contains(key)) {
            keys.add(key)
            return key
        }
    }
}