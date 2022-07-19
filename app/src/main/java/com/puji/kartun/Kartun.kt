package com.puji.kartun

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Kartun(
    val imgKartun: Int,
    val nameKartun: String,
    val descKartun: String,
): Parcelable
