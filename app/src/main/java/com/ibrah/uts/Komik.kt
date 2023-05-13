package com.ibrah.uts

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Komik(
    val imgKomik: Int,
    val nameKomik: String,
    val DescriptionKomik: String
) : Parcelable
