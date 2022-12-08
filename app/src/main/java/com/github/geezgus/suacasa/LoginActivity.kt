package com.github.geezgus.suacasa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton = findViewById<Button>(R.id.login_atv_btn_login)
        loginButton.setOnClickListener {
            Navigation.Activity.homePage(this)
        }

        val linkGoRegister = findViewById<TextView>(R.id.login_atv_link_go_register)
        linkGoRegister.setOnClickListener {
            Navigation.Activity.register(this)
        }
    }
}