package com.example.test_launch_mode.fragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.test_launch_mode.databinding.ActivityFragmentPassBetweenBinding

class FragmentPassBetweenActivity : AppCompatActivity() {

    lateinit var fragmentA: FragmentA
    lateinit var fragmentB: FragmentB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fragmentPassBetweenBinding = ActivityFragmentPassBetweenBinding.inflate(layoutInflater)
        fragmentA = FragmentA()
        // Activity传递给FragmentB的数据
        fragmentB = FragmentB.newInstance("data1", "data2")
        // 动态添加fragment
        supportFragmentManager.beginTransaction()
            .replace(fragmentPassBetweenBinding.fcvA.id, fragmentA).commit()
        supportFragmentManager.beginTransaction()
            .replace(fragmentPassBetweenBinding.fcvB.id, fragmentB).commit()
        setContentView(fragmentPassBetweenBinding.root)
    }
}