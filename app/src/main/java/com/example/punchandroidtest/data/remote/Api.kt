package com.example.punchandroidtest.data.remote

import com.example.punchandroidtest.data.model.RealEstate
import retrofit2.Response
import retrofit2.http.GET


interface Api {

    @GET("realestate")
    suspend fun getRealEstateItems(
    ): Response<List<RealEstate>>
}