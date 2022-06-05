package com.abeimaso.skinsis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var _bg__home_ek2: View? = null
    private var _34185a6f9905e8b0b5b85b5efa284c88_7: ImageView? = null
    private var email_ek3: View? = null
    private var email_ek4: View? = null
    private var snap_your_skin: TextView? = null
    private var email_ek5: View? = null
    private var history: TextView? = null
    private var image_2: ImageView? = null
    private var image_1: ImageView? = null
    private var hi_fara__how_is_your_skin_today_: TextView? = null
    private var image_3: ImageView? = null
    private var image_4: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        _bg__home_ek2 = findViewById(R.id._bg__home_ek2) as View
        _34185a6f9905e8b0b5b85b5efa284c88_7 =
            findViewById<View>(R.id._34185a6f9905e8b0b5b85b5efa284c88_7) as ImageView
        email_ek3 = findViewById(R.id.email_ek3) as View
        email_ek4 = findViewById(R.id.email_ek4) as View
        snap_your_skin = findViewById<View>(R.id.snap_your_skin) as TextView
        email_ek5 = findViewById(R.id.email_ek5) as View
        history = findViewById<View>(R.id.history) as TextView
        image_2 = findViewById<View>(R.id.image_2) as ImageView
        image_1 = findViewById<View>(R.id.image_1) as ImageView
        hi_fara__how_is_your_skin_today_ =
            findViewById<View>(R.id.hi_fara__how_is_your_skin_today_) as TextView
        image_3 = findViewById<View>(R.id.image_3) as ImageView
        image_4 = findViewById<View>(R.id.image_4) as ImageView

    }
}