package com.artemchep.playground.kotlin_multiplatform_common

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

/** Current UNIX time in millis */
actual val timeMillis: Long
    get() = System.currentTimeMillis()

actual val mainDispatcher: CoroutineDispatcher
    get() = Dispatchers.Default
