package com.artemchep.playground.kotlin_multiplatform_common.viewmodel

import com.artemchep.playground.kotlin_multiplatform_common.mainDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlin.coroutines.CoroutineContext

/**
 * @author Artem Chepurnoy
 */
abstract class ViewModelBase : ViewModel(), CoroutineScope {

    private val job = SupervisorJob()

    override val coroutineContext: CoroutineContext
        get() = mainDispatcher + job

    /**
     * Called when this viewmodel is cleared from the system and will
     * not be used.
     */
    override fun onDestroy() {
        // After canceling this job, all children jobs
        // will be cancelled automatically.
        job.cancel()
    }

}
