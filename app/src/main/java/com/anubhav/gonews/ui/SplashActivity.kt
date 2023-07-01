package com.anubhav.gonews.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.anubhav.gonews.R
import kotlinx.android.synthetic.main.activity_splash.imageView2
import kotlinx.android.synthetic.main.activity_splash.textView2

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        textView2.translationX = -1000f
        textView2.animate().apply {
            duration = 1000
            translationXBy(1000f)
        }.start()

        imageView2.animate().apply {
            duration = 1000
            rotationYBy(360f)
        }.start()

        Handler().postDelayed({
            val intent = Intent(this@SplashActivity,NewsActivity::class.java)
            startActivity(intent)
            finish()
        },1500)
    }
}