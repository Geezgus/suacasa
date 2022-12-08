package com.github.geezgus.suacasa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AddItemActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_item)

        val navBtnHomePage = findViewById<Button>(R.id.item_atv_nav_btn_home_page)
        navBtnHomePage.setOnClickListener {
            Navigation.Activity.homePage(this)
        }

        val navBtnLogOff = findViewById<Button>(R.id.item_atv_nav_btn_logoff)
        navBtnLogOff.setOnClickListener {
            Navigation.Activity.login(this)
        }
    }
}