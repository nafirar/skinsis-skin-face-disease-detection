package com.abeimaso.skinsis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
<<<<<<< Updated upstream
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.abeimaso.skinsis.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var camera_button: Button? = null
    private var history_button: Button?=null
    private lateinit var binding: ActivityMainBinding

=======
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.ActionMenuView
import android.widget.Toast

import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var user: FirebaseAuth
>>>>>>> Stashed changes

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
<<<<<<< Updated upstream
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
=======


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        user = FirebaseAuth.getInstance()
        when(item.itemId){
            R.id.logout ->
                user.signOut()
        }
        startActivity(
            Intent(
                this,SignInActivity::class.java
            )
        )
        return super.onOptionsItemSelected(item)
>>>>>>> Stashed changes
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