package com.example.test_launch_mode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ThirdActivity : AppCompatActivity() {
    companion object {
        val TAG = ThirdActivity::class.java.simpleName
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        Log.d("test", "I'm $TAG")
    }

    // 1 - 2 singleInstance - 3
    // back : 3 - 1 - 2
}