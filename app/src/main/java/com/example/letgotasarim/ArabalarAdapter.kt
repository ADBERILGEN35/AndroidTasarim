package com.example.letgotasarim

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.letgotasarim.databinding.CardTasarimBinding
import com.google.android.material.snackbar.Snackbar

class ArabalarAdapter(var mContext: Context, var arabalarListesi: List<Arabalar>) :
    RecyclerView.Adapter<ArabalarAdapter.CardTasarimTutucu>() {
    inner class CardTasarimTutucu(tasarim: CardTasarimBinding) :
        RecyclerView.ViewHolder(tasarim.root) {
        var tasarim: CardTasarimBinding

        init {
            this.tasarim = tasarim

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim = CardTasarimBinding.inflate(layoutInflater, parent, false)
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val araba = arabalarListesi.get(position)
        val t = holder.tasarim

        t.imageAraba.setImageResource(
            mContext.resources.getIdentifier(
                araba.arabaResimAdi,
                "drawable",
                mContext.packageName
            )
        )
        t.textAciklama.text = araba.arabaAciklama
        t.textFiyat.text = "${araba.arabaFiyat} ₺"
        t.textKm.text = "${araba.arabaKm}"
        t.textLokasyon.text = "${araba.arabaLokasyon}"
        t.textTarih.text = "${araba.arabaYili}"
    }

    override fun getItemCount(): Int {
        return arabalarListesi.size
    }

}