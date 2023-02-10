package com.example.app2

import android.content.ComponentName
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btn_app2).setOnClickListener {
            val componetName = ComponentName(
                "com.example.test_launch_mode",  //这个是另外一个应用程序的包名
                "com.example.test_launch_mode.FirstActivity");   //这个参数是要启动的Activity的全路径名
            val intent = Intent()
            intent.component = componetName
            startActivity(intent)
        }
    }
}