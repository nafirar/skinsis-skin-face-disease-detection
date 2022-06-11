package com.abeimaso.skinsis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.abeimaso.skinsis.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var camera_button: Button? = null
    private var history_button: Button?=null
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        camera_button?.setOnClickListener {
            val intent = Intent(this, CameraActivity::class.java)
            startActivity(intent)
        }
        history_button?.setOnClickListener{
            val intent = Intent(this, HistoryActivity::class.java)
            startActivity(intent)
        }
        finish()
    }


//    private fun setMyButtonEnable(item:MenuItem): Boolean{
//        when(item.itemId){
//            R.id.camera_button -> {
//                val intent = Intent (this, CameraActivity::class.java)
//                startActivity(intent)
//            }
//            R.id.history->{
//                val intent = Intent(this, FavoriteActivity::class.java)
//                startActivity(intent)
//            }
//        }
//        return true
//    }
}