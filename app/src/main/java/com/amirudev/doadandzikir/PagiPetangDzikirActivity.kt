package com.amirudev.doadandzikir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.cardview.widget.CardView

class PagiPetangDzikirActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagi_petang_dzikir)

        val cvDzikirPagi: CardView = findViewById(R.id.cv_dzikir_pagi)
        val btnDzikirPagi: ImageButton = findViewById(R.id.img_btn_dzikir_pagi)
        cvDzikirPagi.setOnClickListener(this)
        btnDzikirPagi.setOnClickListener(this)

        val cvDzikirPetang: CardView = findViewById(R.id.cv_dzikir_petang)
        val btnDzikirPetang: ImageButton = findViewById(R.id.img_btn_dzikir_petang)
        cvDzikirPetang.setOnClickListener(this)
        btnDzikirPetang.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.cv_dzikir_pagi -> {
                startActivity(Intent(this, DzikirPagiActivity::class.java))
            }
            R.id.cv_dzikir_petang -> {
                startActivity(Intent(this, DzikirPetangActivity::class.java))
            }
            R.id.img_btn_dzikir_pagi -> {
                startActivity(Intent(this, DzikirPagiActivity::class.java))
            }
            R.id.img_btn_dzikir_petang -> {
                startActivity(Intent(this, DzikirPetangActivity::class.java))
            }
        }
    }
}