package com.puji.kartun

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class KartunAdapter(private val context: Context, private val kartun: List<Kartun>, private val listener:(Kartun)-> Unit)
    : RecyclerView.Adapter<KartunAdapter.kartunViewHolder>(){

    class kartunViewHolder(view: View): RecyclerView.ViewHolder(view){

        private val imgKartun = view.findViewById<ImageView>(R.id.img_item_photo)
        private val nameKartun = view.findViewById<TextView>(R.id.tv_item_name)
        private val descKartun = view.findViewById<TextView>(R.id.tv_item_description)


        fun bindview(kartun: Kartun, listener: (Kartun) -> Unit) {

            imgKartun.setImageResource(kartun.imgKartun)
            nameKartun.text = kartun.nameKartun
            descKartun.text = kartun.descKartun
            itemView.setOnClickListener{listener(kartun)}
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): kartunViewHolder {
        return kartunViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_kartun, parent, false)
        )
    }

    override fun onBindViewHolder(holder: kartunViewHolder, position: Int) {
        holder.bindview(kartun[position],listener)
    }

    override fun getItemCount(): Int = kartun.size

    }








