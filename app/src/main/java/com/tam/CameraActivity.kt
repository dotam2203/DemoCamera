package com.tam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.lib.FunSDK
import com.tam.databinding.ActivityCameraBinding
import com.tam.databinding.ActivityMainBinding

class CameraActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCameraBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCameraBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val imbBack : ImageButton = findViewById(R.id.imb_back)
        imbBack.setOnClickListener {
            getEvent()
        }
       //FunSDK.CancelDevPublic(1,"a",1)
    }

    private fun getEvent() {
        startActivity(Intent(this, MainActivity::class.java))
    }
}