package com.leandro.darksoulsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class AdapterPersonajes(private val personajesList : ArrayList<DataPersonajes>)
    : RecyclerView.Adapter<AdapterPersonajes.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return personajesList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = personajesList[position]
        holder.imgPersonaje.setImageResource(currentItem.imagen_personaje)
        holder.titlePersonaje.text = currentItem.nombre_personaje
        holder.descPersonaje.text = currentItem.descripcion_personaje
    }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        val imgPersonaje : ImageView = itemView.findViewById(R.id.card_image)
        val titlePersonaje : TextView = itemView.findViewById(R.id.card_title)
        val descPersonaje : TextView = itemView.findViewById(R.id.card_description)
    }
}