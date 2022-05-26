package com.example.punchandroidtest.util


//Generic resource class to handle network errors
sealed class Resource<out T>(val data: T? =null) {

    class Success<out T>(data: T) : Resource<T>(data)
    data class Error(val exception: String, val nothing: Nothing?) : Resource<Nothing>()
    object Loading: Resource<Nothing>()
}