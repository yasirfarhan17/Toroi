package com.example.network_domain.repository

import com.example.network_domain.network.api.LoginApi

class LoginRepository(
    private val loginApi: LoginApi
) {
    suspend fun doLogin(params: String) = loginApi.doLogin(params)
    suspend fun changePassword(params: String) = loginApi.changePassword(params)

}