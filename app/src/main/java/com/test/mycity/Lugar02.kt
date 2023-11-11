package com.test.mycity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.test.mycity.databinding.ActivityLugar02Binding

class Lugar02 : AppCompatActivity() {
    private lateinit var biding: ActivityLugar02Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        biding = ActivityLugar02Binding.inflate(layoutInflater)
        setContentView(biding.root)

        goBack()
    }

    private fun goBack(){
        biding.btnGoBack.setOnClickListener {
            onBackPressed()
        }
    }
}