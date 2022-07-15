package com.ssd.phoneconfig.base

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // activity 내 화면 캡쳐 차단
        window.addFlags(WindowManager.LayoutParams.FLAG_SECURE)
    }

}