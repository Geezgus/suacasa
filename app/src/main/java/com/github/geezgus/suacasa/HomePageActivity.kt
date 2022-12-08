package com.github.geezgus.suacasa

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userFirstName = intent.getStringExtra("FIRST_NAME")
        val userId = intent.getStringExtra("USER_ID")

        val txtUserName = findViewById<TextView>(R.id.main_atv_txt_username)
        txtUserName.text = userFirstName

        val navBtnAddItem = findViewById<Button>(R.id.main_atv_nav_btn_add_item)
        navBtnAddItem.setOnClickListener {
            val intent = Intent(this, AddItemActivity::class.java)

            intent.putExtra("USER_ID", userId)

            startActivity(intent)
        }

        val navBtnLogOff = findViewById<Button>(R.id.main_atv_nav_btn_logoff)
        navBtnLogOff.setOnClickListener {
            Navigation.Activity.login(this)
        }
    }
}