package com.example.punchandroidtest.repository

import com.example.punchandroidtest.data.model.RealEstate
import com.example.punchandroidtest.data.remote.Api
import retrofit2.Response
import javax.inject.Inject

class RealEstateRepository @Inject constructor(
    private val api: Api
) {

    //Get responses for calls made by Api
    suspend fun getRealEstateItems(): Response<List<RealEstate>> {
        return api.getRealEstateItems()
    }
}