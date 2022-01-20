package com.example.toroi.ui.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.toroi.R
import com.example.toroi.ui.home.HomeActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        normalFlow()

    }

    private fun normalFlow() {
        startActivity(Intent(this, HomeActivity::class.java))
        finish()
    }
}
