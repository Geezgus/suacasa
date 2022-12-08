package com.github.geezgus.suacasa

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText
import com.google.firebase.database.FirebaseDatabase

class LoginActivity : AppCompatActivity() {

    private val database = FirebaseDatabase.getInstance().reference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin = findViewById<Button>(R.id.login_atv_btn_login)
        btnLogin.setOnClickListener {
            val emailAddress =
                findViewById<AppCompatEditText>(R.id.login_atv_input_email).text.toString()
            val password =
                findViewById<AppCompatEditText>(R.id.login_atv_input_password).text.toString()

            val user = User(null, null, emailAddress, password)
            val userId = User.getId(user)

            val userDbEntry = database.child("users").child(userId)
            userDbEntry.get().addOnSuccessListener { entry ->
                if (entry.value != null) {
                    val intent = Intent(this, HomePageActivity::class.java)

                    intent.putExtra("FIRST_NAME", entry.child("firstName").value as String)
                    intent.putExtra("USER_ID", entry.key as String)

                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Email ou senha incorretos", Toast.LENGTH_LONG).show()
                }
            }
        }

        val linkGoRegister = findViewById<TextView>(R.id.login_atv_link_go_register)
        linkGoRegister.setOnClickListener {
            Navigation.Activity.register(this)
        }
    }
}