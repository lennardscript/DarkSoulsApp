package com.leandro.darksoulsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.leandro.darksoulsapp.databinding.ActivityHomeBinding
import com.leandro.darksoulsapp.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {

    private lateinit var binding:ActivitySignInBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.btnLogin.setOnClickListener {
            val email = binding.txtEmail.text.toString()
            val password = binding.txtPassword.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {

                firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener{
                    if (it.isSuccessful) {
                        val intent = Intent(this, HomeActivity::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
                    }
                }
            } else {
                Toast.makeText(this, "Debe completar los campos solicitados", Toast.LENGTH_SHORT).show()
            }
        }

        /*val btnLogin = findViewById<Button>(R.id.btnLogin)
        btnLogin.setOnClickListener { onButtonClick(it) }

        fun onButtonClick(view: View) {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }*/

        val textvRegister = findViewById<TextView>(R.id.textvRegister)
        textvRegister.setOnClickListener { onButtonClickV(it) }
    }

    fun onButtonClickV(view: View) {
        val intent = Intent(this, SignUpActivity::class.java)
        startActivity(intent)
    }

    /*
    * override fun onStart() {
        super.onStart()

        if (firebaseAuth.currentUser != null) {
            val intent = Intent(this, HomeFragment::class.java)
            startActivity(intent)
        }
    }
    * */


}