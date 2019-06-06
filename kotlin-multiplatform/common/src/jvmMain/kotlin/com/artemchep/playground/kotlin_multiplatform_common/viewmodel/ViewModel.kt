package com.artemchep.playground.kotlin_multiplatform_common.viewmodel

/**
 * @author Artem Chepurnoy
 */
actual abstract class ViewModel actual constructor() {
    actual abstract fun onDestroy()
}