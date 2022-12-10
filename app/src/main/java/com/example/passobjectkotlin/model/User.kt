package com.example.passobjectkotlin.model

import android.os.Parcel
import android.os.Parcelable

class User(var name: String?, var age: String?): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString()
    ) {
    }
    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(age)
    }

    companion object CREATOR : Parcelable.Creator<User> {
        override fun createFromParcel(parcel: Parcel): User {
            return User(parcel)
        }

        override fun newArray(size: Int): Array<User?> {
            return arrayOfNulls(size)
        }
    }
    override fun toString(): String {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}'
    }
}