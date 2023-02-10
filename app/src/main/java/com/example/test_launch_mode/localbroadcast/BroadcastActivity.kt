package com.example.test_launch_mode.localbroadcast

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.example.test_launch_mode.R

class BroadcastActivity : AppCompatActivity() {

    private val myBroadcastReceiver = MyBroadcastReceiver()
    private var localBroadcastManager: LocalBroadcastManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_broadcast)

        //注册本地广播
        localBroadcastManager = LocalBroadcastManager.getInstance(this@BroadcastActivity)
        val intentFilter = IntentFilter()
        intentFilter.addAction("local_broad_cast")
        localBroadcastManager?.registerReceiver(myBroadcastReceiver, intentFilter)
    }

    /**
     * 发送本地广播
     */
    fun sendBroadcast(view: View) {
        val intent = Intent()
        intent.action = "local_broad_cast"
        localBroadcastManager?.sendBroadcast(intent)
    }

    override fun onDestroy() {
        super.onDestroy()
        //解注册
        localBroadcastManager?.unregisterReceiver(myBroadcastReceiver)
    }
}