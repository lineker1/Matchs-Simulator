package me.dio.simulator.domain

import com.google.gson.annotations.SerializedName

data class Match(

    @SerializedName("descricao")
    val descricao: String,
    @SerializedName("Local")
    val place: Place,
    @SerializedName("mandante")
    val homeTeam: Team,
    @SerializedName("visitante")
    val visitantTeam: Team,

)
