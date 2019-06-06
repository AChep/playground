package com.artemchep.playground.kotlin_multiplatform_jvm

import com.artemchep.playground.kotlin_multiplatform_common.viewmodel.MainViewModel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.runBlocking

fun main() {
    val mainViewModel = MainViewModel()
    runBlocking {
        mainViewModel.outChannel.consumeEach(::println)
    }
}