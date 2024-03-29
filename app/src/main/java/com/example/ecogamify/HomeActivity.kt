package com.example.ecogamify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.ecogamify.databinding.ActivityHomeBinding
import com.example.ecogamify.databinding.ActivityRegisterBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)

        binding.btnLogout.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}