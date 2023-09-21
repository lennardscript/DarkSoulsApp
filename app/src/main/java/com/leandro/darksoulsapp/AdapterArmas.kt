package com.leandro.darksoulsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterArmas(private val armasList : ArrayList<DataArmas>)
    : RecyclerView.Adapter<AdapterArmas.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return armasList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = armasList[position]
        holder.imgArma.setImageResource(currentItem.imagen_arma)
        holder.titleArma.text = currentItem.nombre_arma
        holder.descArma.text = currentItem.descripcion_arma
    }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        val imgArma : ImageView = itemView.findViewById(R.id.card_image)
        val titleArma : TextView = itemView.findViewById(R.id.card_title)
        val descArma : TextView = itemView.findViewById(R.id.card_description)
    }
}