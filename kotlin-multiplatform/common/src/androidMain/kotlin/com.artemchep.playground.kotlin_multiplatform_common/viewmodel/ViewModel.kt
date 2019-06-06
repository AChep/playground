package com.artemchep.playground.kotlin_multiplatform_common.viewmodel

import androidx.lifecycle.ViewModel

/**
 * @author Artem Chepurnoy
 */
actual abstract class ViewModel actual constructor() : ViewModel() {
    override fun onCleared() {
        super.onCleared()
        onDestroy()
    }

    actual abstract fun onDestroy()
}