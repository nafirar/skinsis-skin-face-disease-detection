package com.abeimaso.skinsis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abeimaso.skinsis.R
import android.content.Intent
import android.os.Handler
import com.abeimaso.skinsis.SignInActivity

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.hide()
        setContentView(R.layout.activity_splashscreen)
        Handler().postDelayed({
            val intent = Intent(this@SplashScreenActivity, SignInActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}