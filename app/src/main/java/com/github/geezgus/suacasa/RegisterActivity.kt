package com.github.geezgus.suacasa

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText
import com.google.firebase.database.FirebaseDatabase

class RegisterActivity : AppCompatActivity() {

    private val database = FirebaseDatabase.getInstance().reference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnCreateAccount = findViewById<Button>(R.id.register_atv_btn_register)
        btnCreateAccount.setOnClickListener {
            val firstName = findViewById<AppCompatEditText>(R.id.register_atv_input_first_name).text.toString()
            val lastName = findViewById<AppCompatEditText>(R.id.register_atv_input_last_name).text.toString()
            val emailAddress = findViewById<AppCompatEditText>(R.id.register_atv_input_email).text.toString()
            val password = findViewById<AppCompatEditText>(R.id.register_atv_input_password).text.toString()

            val user = User(firstName, lastName, emailAddress, password)
            val userId = User.getId(user)

            database.child("users").child(userId).setValue(user)

            Navigation.Activity.login(this)
            Toast.makeText(this, "Conta criada com sucesso", Toast.LENGTH_LONG).show()
        }

        val linkGoLogin = findViewById<TextView>(R.id.register_atv_link_go_login)
        linkGoLogin.setOnClickListener {
            Navigation.Activity.login(this)
        }
    }
}