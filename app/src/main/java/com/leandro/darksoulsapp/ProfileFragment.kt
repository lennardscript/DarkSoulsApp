package com.leandro.darksoulsapp

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog
import com.google.firebase.auth.FirebaseAuth

class ProfileFragment : Fragment() {

    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        firebaseAuth = FirebaseAuth.getInstance()

        /*
        *   val buttonLogout = view.findViewById<ImageButton>(R.id.imgArrowRight)

        buttonLogout.setOnClickListener {

            val dialog = AlertDialog.Builder(requireContext())
                .setTitle("Cerrar sesión")
                .setMessage("¿Estás seguro de que quieres cerrar sesión?")
                .setPositiveButton("Sí", DialogInterface.OnClickListener { dialog, wich ->
                    firebaseAuth.signOut()

                    val intent = Intent(requireContext(), MainActivity::class.java)
                    startActivity(intent)
                    requireActivity().finish()
                })
                .setNegativeButton("No", DialogInterface.OnClickListener{ dialog, wich ->

                }).create()
                dialog.show()
        }
        * */


        return inflater.inflate(R.layout.fragment_profile, container, false)
    }
}