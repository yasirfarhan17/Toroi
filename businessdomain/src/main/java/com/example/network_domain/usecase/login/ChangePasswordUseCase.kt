package com.example.network_domain.usecase.login

import com.example.network_domain.repository.LoginRepository
import com.example.network_domain.usecase.base.BaseSuspendUseCase
import com.example.network_domain.network.util.NetworkResult
import com.example.network_domain.network.util.NetworkResult.Failure
import com.example.network_domain.network.util.NetworkResult.Success
import com.example.network_domain.network.util.safeApiCall

class ChangePasswordUseCase(
    private val loginRepository: LoginRepository
) : BaseSuspendUseCase<NetworkResult<String>, String>() {
    override suspend fun perform(params: String): NetworkResult<String> {
        return when (val result = safeApiCall { loginRepository.changePassword(params) }) {
            is Success -> Success(result.body)
            is Failure -> result
        }
    }

}