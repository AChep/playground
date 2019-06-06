package com.artemchep.playground.kotlin_multiplatform_common.viewmodel

import com.artemchep.playground.kotlin_multiplatform_common.timeMillis
import kotlinx.coroutines.channels.BroadcastChannel
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch

/**
 * @author Artem Chepurnoy
 */
class MainViewModel : ViewModelBase() {

    val outChannel = BroadcastChannel<String>(CAPACITY_OUT_CHANNEL)

    init {
        // Our strange shared business logic...
        launch {
            while (isActive) {
                delay(1000L)

                val msg = "Current time is $timeMillis"
                outChannel.send(msg)
            }
        }
    }

    companion object {
        private const val CAPACITY_OUT_CHANNEL = 100
    }

}
