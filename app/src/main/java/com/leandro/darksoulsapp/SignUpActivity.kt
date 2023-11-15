package com.leandro.darksoulsapp

import android.content.Intent
import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.UserProfileChangeRequest
import com.google.firebase.database.FirebaseDatabase
import com.leandro.darksoulsapp.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {

    private lateinit var binding:ActivitySignUpBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)

        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.btnSignUp.setOnClickListener {

            val email = binding.txtEmail.text.toString()
            val password = binding.txtPassword.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {

                firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener{
                    if (it.isSuccessful) {
                        val intent = Intent(this, HomeFragment::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
                    }
                }
            } else {
                Toast.makeText(this, "Debe completar los campos solicitados", Toast.LENGTH_SHORT).show()
            }

        }

        val textvLogin = findViewById<TextView>(R.id.textvLogin)
        textvLogin.setOnClickListener { onButtonClick(it) }
    }

    fun onButtonClick(view: View) {
        val intent = Intent(this, SignInActivity::class.java)
        startActivity(intent)
    }


    /*
    val btnRegister = findViewById<Button>(R.id.btnSignUp)
        btnRegister.setOnClickListener { onButtonClickSignUp(it) }

    fun onButtonClickSignUp(view: View) {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
    * */


}