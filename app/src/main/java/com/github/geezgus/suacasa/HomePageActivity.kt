package com.github.geezgus.suacasa

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navBtnAddItem = findViewById<Button>(R.id.main_atv_nav_btn_add_item)
        navBtnAddItem.setOnClickListener {
            Navigation.Activity.addItem(this)
        }

        val navBtnLogOff = findViewById<Button>(R.id.main_atv_nav_btn_logoff)
        navBtnLogOff.setOnClickListener {
            Navigation.Activity.login(this)
        }
    }
}