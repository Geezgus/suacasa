package com.github.geezgus.suacasa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnCreateAccount = findViewById<Button>(R.id.register_atv_btn_register)
        btnCreateAccount.setOnClickListener {
            Navigation.Activity.homePage(this)
        }

        val linkGoLogin = findViewById<TextView>(R.id.register_atv_link_go_login)
        linkGoLogin.setOnClickListener {
            Navigation.Activity.login(this)
        }
    }
}