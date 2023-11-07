package com.test.mycity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.test.mycity.databinding.ActivityLugar03Binding

class Lugar03 : AppCompatActivity() {
    private lateinit var biding: ActivityLugar03Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        biding = ActivityLugar03Binding.inflate(layoutInflater)
        setContentView(biding.root)

        goBack()
    }

    private fun goBack(){
        biding.btnGoBack.setOnClickListener {
            val goBackIntent = Intent(this, Recommendation::class.java)
            startActivity(goBackIntent)
        }
    }
}