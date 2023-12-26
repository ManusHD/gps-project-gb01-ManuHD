package es.unex.gps.weathevent.interfaces

import es.unex.gps.weathevent.model.Ciudad

fun interface CiudadParam {
    fun getCiudadParam() : Ciudad?
}