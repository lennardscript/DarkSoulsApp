package com.leandro.darksoulsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ObjetosFragment : Fragment() {

    private lateinit var adapter : AdapterObjetos
    private lateinit var recyclerView: RecyclerView
    private lateinit var objetosArrayList : ArrayList<DataObjetos>

    lateinit var imageId : Array<Int>
    lateinit var titleObjeto : Array<String>
    lateinit var descObjeto : Array<String>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_objetos, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.recyclerViewObjetos)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = AdapterObjetos(objetosArrayList)
        recyclerView.adapter = adapter
    }

    private fun dataInitialize() {
        objetosArrayList = arrayListOf<DataObjetos>()

        imageId = arrayOf(
            R.drawable.objeto_1,
            R.drawable.objeto_2,
            R.drawable.objeto_3
        )

        titleObjeto = arrayOf(
            getString(R.string.title_objeto_1),
            getString(R.string.title_objeto_2),
            getString(R.string.title_objeto_3)

        )

        descObjeto = arrayOf(
            getString(R.string.desc_objeto_1),
            getString(R.string.desc_objeto_2),
            getString(R.string.desc_objeto_3),
        )

        for (i in imageId.indices) {

            val objeto = DataObjetos(imageId[i], titleObjeto[i], descObjeto[i])
            objetosArrayList.add(objeto)
        }
    }
}