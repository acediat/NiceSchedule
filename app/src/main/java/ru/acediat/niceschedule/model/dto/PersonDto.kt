package ru.acediat.niceschedule.model.dto

import com.google.gson.annotations.SerializedName

data class PersonDto(
    val name: String?,
    val gender: String?,
    @SerializedName("skin_color")
    val skinColor: String?
)
