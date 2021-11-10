package yayasan.idn.doaddandzikir.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Artikel(
    val imageArtikel: Int,
    val titleArtikel: String,
    val descArtikel: String
) : Parcelable


