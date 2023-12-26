package es.unex.gps.weathevent.interfaces

import es.unex.gps.weathevent.model.User

fun interface UserParam {
    fun getUserFragment() : User
}