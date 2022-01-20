package com.example.network_domain.usecase.login

import com.example.network_domain.repository.LoginRepository
import com.example.network_domain.usecase.base.BaseSuspendUseCase
import com.example.network_domain.network.model.login.LoginResponseModel
import com.example.network_domain.network.util.NetworkResult
import com.example.network_domain.network.util.NetworkResult.Failure
import com.example.network_domain.network.util.NetworkResult.Success
import com.example.network_domain.network.util.safeApiCallHeaders

class LoginUseCase(
    private val loginRepository: LoginRepository
) : BaseSuspendUseCase<NetworkResult<Pair<LoginResponseModel, String>>, String>() {
    override suspend fun perform(params: String): NetworkResult<Pair<LoginResponseModel, String>> {
        return when (val result = safeApiCallHeaders { loginRepository.doLogin(params) }) {
            is Success -> Success(result.body)
            is Failure -> result
        }
    }

}