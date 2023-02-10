package com.example.test_launch_mode.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.test_launch_mode.R
import com.example.test_launch_mode.databinding.FragmentABinding

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentA.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentA : Fragment() {

    private lateinit var fragmentAChangeListener: FragmentAChangeListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val fragmentABinding = FragmentABinding.inflate(inflater, container, false)
        fragmentABinding.btnPassAByInterface.setOnClickListener {
            fragmentAChangeListener.onChange("fragment A发送的数据")
        }
        return fragmentABinding.root
    }


    /**
     * 定义数据发送方(被观察者)接口
     */
    interface FragmentAChangeListener {
        fun onChange(data: String)
    }

    /**
     * 对外暴露方法设置接口
     * @param fragmentAChangeListener
     */
    fun setFragmentAChangeListener(fragmentAChangeListener: FragmentAChangeListener) {
        this.fragmentAChangeListener = fragmentAChangeListener
    }
}