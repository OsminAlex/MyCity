package com.test.mycity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.test.mycity.databinding.ActivityLugar01Binding
import com.test.mycity.databinding.ActivityRecommendationBinding

class Lugar01 : AppCompatActivity() {

    private lateinit var biding: ActivityLugar01Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        biding = ActivityLugar01Binding.inflate(layoutInflater)
        setContentView(biding.root)

        goBack()
    }

    private fun goBack(){
        biding.btnGoBack.setOnClickListener {
            onBackPressed()
        }
    }
}