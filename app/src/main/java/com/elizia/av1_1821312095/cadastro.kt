package com.elizia.av1_1821312095

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.elizia.av1_1821312095.databinding.ActivityCadastroBinding

class cadastro : AppCompatActivity() {

    private lateinit var binding: ActivityCadastroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCadastroBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}