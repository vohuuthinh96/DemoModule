package com.example.android.demomodule

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android.thinhvh.EqualizerManager
import com.example.android.thinhvh.YourLibrary

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var yourLibraryManager: EqualizerManager? = null
        YourLibrary("thinhvh").prepare {
            yourLibraryManager = it

            yourLibraryManager?.changeBass()
            yourLibraryManager?.changeVirtual()
        }
    }
}