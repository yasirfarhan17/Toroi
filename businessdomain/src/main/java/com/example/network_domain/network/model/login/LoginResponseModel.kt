package com.example.network_domain.network.model.login

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class LoginResponseModel(
    @SerializedName("employeeName") val employeeName: String? = null,
    @SerializedName("registeredAttendance") val registeredAttendance: String? = null,
    @SerializedName("loginId") val loginId: String? = null,
    @SerializedName("countryCode") val countryCode: Int? = null,
    @SerializedName("machineIpAddress") val machineIpAddress: String? = null,
    @SerializedName("deviceList") val deviceList: List<String?>? = null,
    @SerializedName("employeeId") val employeeId: String? = null,
    @SerializedName("mobileNo") val mobileNo: String? = null,
    @SerializedName("forceChangePassword") val forceChangePassword: String? = null,
    @SerializedName("loginMode") val loginMode: String? = null
)



