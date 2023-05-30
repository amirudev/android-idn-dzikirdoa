package com.amirudev.doadandzikir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    private fun initView() {
        val llDzikirDoaShalat: LinearLayout = findViewById(R.id.ll_dzikir_doa_shalat)
        val llDzikirSetiapSaat: LinearLayout = findViewById(R.id.ll_dzikir_setiap_saat)
        val llDzikirDoaHarian: LinearLayout = findViewById(R.id.ll_dzikir_doa_harian)
        val llDzikirPagiPetang : LinearLayout = findViewById(R.id.ll_dzikir_pagi_petang)

        llDzikirDoaShalat.setOnClickListener {
            startActivity(Intent(this, HarianDzikirDoaActivity::class.java))
        }

        llDzikirSetiapSaat.setOnClickListener {
            startActivity(Intent(this, SetiapSaatDzikirActivity::class.java))
        }

        llDzikirDoaHarian.setOnClickListener {
            startActivity(Intent(this, HarianDzikirDoaActivity::class.java))
        }

        llDzikirPagiPetang.setOnClickListener {
            startActivity(Intent(this, PagiPetangDzikirActivity::class.java))
        }
    }
}