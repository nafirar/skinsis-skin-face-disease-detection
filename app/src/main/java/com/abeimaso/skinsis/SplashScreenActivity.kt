package com.abeimaso.skinsis

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
@SuppressLint("CustomSplashScreen")
@Suppress("DEPRECATION")
class SplashScreenActivity : AppCompatActivity() {
    private var _bg__splash_screen_ek2: View? = null
    private var _34185a6f9905e8b0b5b85b5efa284c88_2: ImageView? = null
    private var skinsis_your_personal_skin_doctor: TextView? = null
    private var logo_ek2: View? = null
    companion object {
        private const val EXTRA_DURATION = 3000L
    }
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
        getSupportActionBar()?.hide()
        _bg__splash_screen_ek2 = findViewById(R.id._bg__splash_screen_ek2) as View
        _34185a6f9905e8b0b5b85b5efa284c88_2 =
            findViewById<View>(R.id.background) as ImageView
        skinsis_your_personal_skin_doctor =
            findViewById<View>(R.id.skinsis_your_personal_skin_doctor) as TextView
        logo_ek2 = findViewById(R.id.logo_ek2) as View
        Handler().postDelayed(
            {
                startActivity(Intent(
                    applicationContext,
                    LoginActivity::class.java
                ))
                finish()
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            }, EXTRA_DURATION)
    }
}
