package com.abeimaso.skinsis

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.abeimaso.skinsis.databinding.ActivityResultBinding
import com.bumptech.glide.Glide

class ResultActivity : AppCompatActivity(){
    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val result = intent.getParcelableExtra<Result>(DETAIL_RESULT) as Result
        Glide.with(this)
            .load(result.photo)
            .into(binding.imagePreview)
        binding.professionalAdvice.text = result.personal_advice
        binding.skinIndication.text = result.skin_indication
    }
    companion object{
        const val DETAIL_RESULT = "detail_result"
        const val CAMERA_X_RESULT = 200

        }
}