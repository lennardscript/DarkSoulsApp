package com.leandro.darksoulsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class AdapterObjetos(private val objetosList : ArrayList<DataObjetos>) :
    RecyclerView.Adapter<AdapterObjetos.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return objetosList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = objetosList[position]
        holder.imgObjeto.setImageResource(currentItem.imagen_objeto)
        holder.titleObjeto.text = currentItem.nombre_objeto
        holder.descObjeto.text = currentItem.descripcion_objeto
    }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        val imgObjeto : ImageView = itemView.findViewById(R.id.card_image)
        val titleObjeto : TextView = itemView.findViewById(R.id.card_title)
        val descObjeto : TextView = itemView.findViewById(R.id.card_description)
    }
}