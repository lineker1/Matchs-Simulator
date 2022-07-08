package me.dio.simulator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.dio.simulator.databinding.ActivityDetailAcitivityBinding

class DetailAcitivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailAcitivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailAcitivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}