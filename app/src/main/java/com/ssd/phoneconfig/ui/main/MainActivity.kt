package com.ssd.phoneconfig.ui.main

import android.os.Bundle
import com.ssd.phoneconfig.R
import com.ssd.phoneconfig.base.BaseActivity

class MainActivity : BaseActivity() {

    companion object {
        const val TAG: String = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}