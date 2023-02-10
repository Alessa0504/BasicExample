package com.example.test_launch_mode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.test_launch_mode.databinding.ActivityMainBinding
import com.example.test_launch_mode.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    val TAG = SecondActivity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activitySecondBinding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(activitySecondBinding.root)
        Log.d("test", "I'm $TAG")
        activitySecondBinding.btnGotoThird.setOnClickListener {
            startActivity(Intent(this@SecondActivity, ThirdActivity::class.java))
        }
    }
}