package com.leandro.darksoulsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val btnRegister = findViewById<Button>(R.id.btnSignUp)
        btnRegister.setOnClickListener { onButtonClickSignUp(it) }

        val textvLogin = findViewById<TextView>(R.id.textvLogin)
        textvLogin.setOnClickListener { onButtonClick(it) }
    }

    fun onButtonClick(view: View) {
        val intent = Intent(this, SignInActivity::class.java)
        startActivity(intent)
    }

    fun onButtonClickSignUp(view: View) {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
}