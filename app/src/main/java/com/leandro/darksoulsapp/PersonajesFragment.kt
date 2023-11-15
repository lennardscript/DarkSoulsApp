package com.leandro.darksoulsapp

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class PersonajesFragment : Fragment() {

    private lateinit var adapter : AdapterPersonajes
    private lateinit var recyclerView: RecyclerView
    private lateinit var personajesArrayList : ArrayList<DataPersonajes>

    lateinit var imageId : Array<Int>
    lateinit var titlePersonaje : Array<String>
    lateinit var descPersonaje : Array<String>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_personajes, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.recyclerViewPersonajes)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = AdapterPersonajes(personajesArrayList)
        recyclerView.adapter = adapter
    }

    private fun dataInitialize() {
        personajesArrayList = arrayListOf<DataPersonajes>()

        imageId = arrayOf(
            R.drawable.personaje_1,
            R.drawable.personaje_2,
            R.drawable.personaje_3
        )

        titlePersonaje = arrayOf(
            getString(R.string.title_personaje_1),
            getString(R.string.title_personaje_2),
            getString(R.string.title_personaje_3)

        )

        descPersonaje = arrayOf(
            getString(R.string.desc_personaje_1),
            getString(R.string.desc_personaje_2),
            getString(R.string.desc_personaje_3)
        )

        for (i in imageId.indices) {

            val personajes = DataPersonajes(imageId[i], titlePersonaje[i], descPersonaje[i])
            personajesArrayList.add(personajes)
        }
    }

}