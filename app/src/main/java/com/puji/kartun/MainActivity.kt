package com.puji.kartun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val kartunList = listOf(
            Kartun(
             R.drawable.doraemon,
                nameKartun = "Doraemon",
                descKartun = "Doraemon adalah sebuah robot kucing berwarna biru"
            ),
            Kartun(
                R.drawable.nobita,
                nameKartun = "Nobita",
                descKartun = "Nobita Nobi,umumnya disebut Nobita lahir pada 7 Agustus"
            ),
            Kartun(
                R.drawable.shizuka,
                nameKartun = "Shizuka",
                descKartun = "Shizuka し ず か, シ ズ カ adalah kata dalam bahasa Jepang yang berarti tenang"
            ),
            Kartun(
                R.drawable.jayen,
                nameKartun = "Jayen",
                descKartun = "Bocah gempal yang menyebalkan ini merupakan musuh besar Nobita"
            ),

            Kartun(
                R.drawable.jery,
                nameKartun = "Jery",
                descKartun = "Salah satu persaingan paling dicintai dalam sejarah muncul kembali ketika Jerry pindah ke hotel terbaik di New York City pada malam"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_kartun)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter= KartunAdapter(this,kartunList){
            val intent = Intent (this,Detailkartun::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}