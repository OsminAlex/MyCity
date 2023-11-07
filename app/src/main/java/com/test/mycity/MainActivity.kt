package com.test.mycity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.test.mycity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var biding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        biding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(biding.root)

        goRecommendation()
    }

    private fun goRecommendation(){
        biding.btnGoRecommendation.setOnClickListener {
            val recommendationIntent = Intent(this, Recommendation::class.java)
            startActivity(recommendationIntent)
        }
    }
}