package com.leandro.darksoulsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        /*
        * val btnLogin = findViewById<Button>(R.id.btnLogin)
        btnLogin.setOnClickListener { onButtonClick(it) }
        *
        */

        val textvRegister = findViewById<TextView>(R.id.textvRegister)
        textvRegister.setOnClickListener { onButtonClickV(it) }
    }

    /*
    * fun onButtonClick(view: View) {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
    */

    fun onButtonClickV(view: View) {
        val intent = Intent(this, SignUpActivity::class.java)
        startActivity(intent)
    }

}