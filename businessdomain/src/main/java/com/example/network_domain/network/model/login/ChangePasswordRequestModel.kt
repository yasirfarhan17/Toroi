package com.example.network_domain.network.model.login

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ChangePasswordRequestModel(
    @SerialName("employeeId") var employeeId: String = "",
    @SerialName("loginId") var loginId: String = "",
    @SerialName("oldPassword") var oldPassword: String = "",
    @SerialName("newPassword") var newPassword: String = ""
)

