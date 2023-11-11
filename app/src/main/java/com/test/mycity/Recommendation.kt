package com.test.mycity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.test.mycity.databinding.ActivityRecommendationBinding

class Recommendation : AppCompatActivity() {

    private lateinit var biding: ActivityRecommendationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        biding = ActivityRecommendationBinding.inflate(layoutInflater)
        setContentView(biding.root)

        goDescription()
        goBack()

    }

    private fun goDescription(){

        biding.lugar01.setOnClickListener {
            val lugar01Intent = Intent(this, Lugar01::class.java)
            startActivity(lugar01Intent)
        }

        biding.lugar02.setOnClickListener {
            val lugar02Intent = Intent(this, Lugar02::class.java)
            startActivity(lugar02Intent)
        }

        biding.lugar03.setOnClickListener {
            val lugar03Intent = Intent(this, Lugar03::class.java)
            startActivity(lugar03Intent)
        }
    }

    private fun goBack(){
        biding.btnGoBack.setOnClickListener {
            onBackPressed()
        }
    }

}