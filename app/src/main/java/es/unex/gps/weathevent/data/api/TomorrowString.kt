package es.unex.gps.weathevent.data.api

import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class TomorrowString (

  @SerializedName("p" ) var p : String? = null

) : Serializable