package com.puji.kartun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Detailkartun : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailkartun)
        val kartun = intent.getParcelableExtra<Kartun>(MainActivity.INTENT_PARCELABLE)

        val  imgKartun = findViewById<ImageView>(R.id.img_item_photo)
        val  nameKartun = findViewById<TextView>(R.id.tv_item_name)
        val  descKartun = findViewById<TextView>(R.id.tv_item_description)

        imgKartun.setImageResource(kartun?.imgKartun!!)
        nameKartun.text= kartun.nameKartun
        descKartun.text= kartun.descKartun
    }
}