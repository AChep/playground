package com.artemchep.playground.kotlin_multiplatform_common

import kotlinx.coroutines.CoroutineDispatcher

/** Current UNIX time in millis */
expect val timeMillis: Long

expect val mainDispatcher: CoroutineDispatcher
