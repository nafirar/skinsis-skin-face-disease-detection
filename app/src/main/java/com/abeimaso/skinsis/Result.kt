package com.abeimaso.skinsis

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Result(
    var skin_indication: String? = null,
    var photo: String? = null,
    var personal_advice: String? = null
): Parcelable
