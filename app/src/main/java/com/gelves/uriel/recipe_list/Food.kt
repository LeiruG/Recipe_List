package com.gelves.uriel.recipe_list

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by Lucem on 08/12/2017.
 */
data class Food  (val q: String,
                  val w: String,
                  val e: Int = 0,
                  val r: String,
                  val t: String
): Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readInt(),
            parcel.readString(),
            parcel.readString()) {
    }
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(q)//name
        parcel.writeString(w)//desc
        parcel.writeInt(e)//img
        parcel.writeString(r)//ingred
        parcel.writeString(t)//proced
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Food> {
        override fun createFromParcel(parcel: Parcel): Food {
            return Food(parcel)
        }

        override fun newArray(size: Int): Array<Food?> {
            return arrayOfNulls(size)
        }
    }
}
