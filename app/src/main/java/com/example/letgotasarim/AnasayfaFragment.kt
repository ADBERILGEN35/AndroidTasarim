package com.example.letgotasarim

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.letgotasarim.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var tasarim: FragmentAnasayfaBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false)


/*
        tasarim.toolbarAnasayfa.title = "Letgo"
*/
        tasarim.rv.layoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        val arabalarListesi = ArrayList<Arabalar>()
        val a1 = Arabalar(
            1, "Kia",
            " * Son Fiyat * 2020 Model Hasarsız. Sedan 120hp", "araba1",
            2020, 365000, "11230 km", "İzmir"
        )
        val a2 = Arabalar(
            1, "Renault", "Clio 3, Temiz, Bakımlı, Ekonomik, Full paket",
            "araba2", 2018, 250000, "56000 km", "Ankara"
        )

        arabalarListesi.add(a1)
        arabalarListesi.add(a2)

        val adapter = ArabalarAdapter(requireContext(), arabalarListesi)
        tasarim.rv.adapter = adapter


        return tasarim.root
    }

}