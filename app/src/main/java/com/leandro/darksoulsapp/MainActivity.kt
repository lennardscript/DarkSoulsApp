package com.leandro.darksoulsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.leandro.darksoulsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var firebaseRef: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseRef = FirebaseDatabase.getInstance().getReference("test")

        binding.btnIngresar.setOnClickListener {
            firebaseRef.setValue("Conectado y funcionando")
                .addOnCompleteListener {
                    Toast.makeText(this, "Hola, mundo!", Toast.LENGTH_SHORT).show()
                }
        }

        /*
        *
        *val screenSplash = installSplashScreen()
        screenSplash.setKeepOnScreenCondition { true }
        * */


        val btnIngresar = findViewById<Button>(R.id.btnIngresar)
        btnIngresar.setOnClickListener { onButtonClick(it) }
    }

    fun onButtonClick(view: View) {
        val intent = Intent(this, SignInActivity::class.java)
        startActivity(intent)
    }
}