package com.ibrah.uts

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class KomikAdapter(private val contex: Context, private val komik: List<Komik>, val listener: (Komik) -> Unit)
    : RecyclerView.Adapter<KomikAdapter.KomikViewHolder>(){

    class KomikViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgKomik = view.findViewById<ImageView>(R.id.img_item_photo)
        val namekomik = view.findViewById<TextView>(R.id.tv_item_name)
        val DescriptionKomik = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(komik: Komik, listener: (Komik) -> Unit){
            imgKomik.setImageResource(komik.imgKomik)
            namekomik.text = komik.nameKomik
            DescriptionKomik.text = komik.DescriptionKomik
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KomikViewHolder {
        return KomikViewHolder(
            LayoutInflater.from(contex).inflate(R.layout.item_komik, parent, false)
        )
    }

    override fun onBindViewHolder(holder: KomikViewHolder, position: Int) {
        holder.bindView(komik[position], listener)
    }

    override fun getItemCount(): Int = komik.size
    }
