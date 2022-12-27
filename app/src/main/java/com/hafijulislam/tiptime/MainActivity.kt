package com.hafijulislam.tiptime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hafijulislam.tiptime.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //if view view bind is enabled
    lateinit var mainActivityBind: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivityBind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainActivityBind.root)

        mainActivityBind.calculateButton.setOnClickListener {
            calculateTip()
        }
    }

    fun calculateTip() {
//        val costOfService = mainActivityBind.costOfService.text?.toDouble()

    }
}