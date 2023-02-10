package com.example.test_launch_mode

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FirstActivity : AppCompatActivity() {
    val TAG = FirstActivity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        Log.d("test","I'm $TAG")
        findViewById<Button>(R.id.btn_goto_second).setOnClickListener {
            startActivity(Intent(this@FirstActivity, SecondActivity::class.java))
//            val componetName = ComponentName(
//                "com.example.app2",  //这个是另外一个应用程序的包名
//                "com.example.app2.MainActivity");   //这个参数是要启动的Activity的全路径名
//            val intent = Intent()
//            intent.component = componetName
//            startActivity(intent)
        }
    }
}