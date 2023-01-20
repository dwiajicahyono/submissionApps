package com.provinsisumatra

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Prov(
    var name: String,
    var description: String,
    var photo: Int
) : Parcelable