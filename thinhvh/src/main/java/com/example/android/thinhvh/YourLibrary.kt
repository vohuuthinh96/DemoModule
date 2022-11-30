package com.example.android.thinhvh

import androidx.annotation.Keep


/**
 * Created by Thinhvh on 30/11/2022.
 * Phone: 0398477967
 * Email: thinhvh.fpt@gmail.com
 */

@Keep
class YourLibrary(var key: String) {
    private lateinit var equalizerManager: EqualizerManager

    fun prepare(onPrepareCallback: (EqualizerManager) -> Unit) {
        if (key == "thinhvh") {
            equalizerManager = EqualizerImp()
            onPrepareCallback(equalizerManager)
        } else throw Exception("sai key roi")
    }
}