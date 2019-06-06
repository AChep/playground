package com.artemchep.playground.kotlin_multiplatform_common.viewmodel

/**
 * @author Artem Chepurnoy
 */
expect abstract class ViewModel() {
    abstract fun onDestroy()
}
