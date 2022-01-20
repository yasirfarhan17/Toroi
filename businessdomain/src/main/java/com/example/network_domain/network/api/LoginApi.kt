package com.example.network_domain.network.api

import com.example.network_domain.network.model.login.LoginResponseModel
import retrofit2.Response
import retrofit2.http.Header
import retrofit2.http.POST

interface LoginApi {
    @POST(Endpoints.Login.GET_LOGIN)
    suspend fun doLogin(@Header("Authorization") authHeader: String): Response<LoginResponseModel>

    @POST(Endpoints.Login.CHANGE_PASSWORD)
    suspend fun changePassword(string: String): Response<String>
}