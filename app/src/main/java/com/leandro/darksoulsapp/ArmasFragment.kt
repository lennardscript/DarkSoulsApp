package com.leandro.darksoulsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.leandro.darksoulsapp.databinding.ActivityMainBinding
import com.leandro.darksoulsapp.databinding.FragmentArmasBinding

class ArmasFragment : Fragment() {

    private lateinit var adapter : AdapterArmas
    private lateinit var recyclerView: RecyclerView
    private lateinit var armasArrayList : ArrayList<DataArmas>

    private var _binding : FragmentArmasBinding? = null
    private  val binding get() = _binding!!

    lateinit var imageId : Array<Int>
    lateinit var titleArma : Array<String>
    lateinit var descArma : Array<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentArmasBinding.inflate(inflater, container, false)

        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.recyclerViewArmas)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = AdapterArmas(armasArrayList)
        recyclerView.adapter = adapter
    }

    private fun dataInitialize() {
        armasArrayList = arrayListOf<DataArmas>()

        imageId = arrayOf(
            R.drawable.arma_1,
            R.drawable.arma_2,
            R.drawable.arma_3,
            R.drawable.arma_4,
            R.drawable.arma_5,
            R.drawable.arma_6,
            R.drawable.arma_7
        )

        titleArma = arrayOf(
            getString(R.string.title_arma_1),
            getString(R.string.title_arma_2),
            getString(R.string.title_arma_3),
            getString(R.string.title_arma_4),
            getString(R.string.title_arma_5),
            getString(R.string.title_arma_6),
            getString(R.string.title_arma_7)

        )

        descArma = arrayOf(
            getString(R.string.desc_arma_1),
            getString(R.string.desc_arma_2),
            getString(R.string.desc_arma_3),
            getString(R.string.desc_arma_4),
            getString(R.string.desc_arma_5),
            getString(R.string.desc_arma_6),
            getString(R.string.desc_arma_7)
        )

        for (i in imageId.indices) {

            val armas = DataArmas(imageId[i], titleArma[i], descArma[i])
            armasArrayList.add(armas)
        }
    }

}