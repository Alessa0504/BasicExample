package com.example.test_launch_mode.localbroadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

/**
 * @Description:
 * @author zouji
 * @date 2023/2/9
 */
class MyBroadcastReceiver: BroadcastReceiver() {
    private val TAG = "MyBroadcastReceiver"
    override fun onReceive(context: Context?, intent: Intent?) {
        Log.d(TAG, "onReceive: 收到本地广播")
    }
}