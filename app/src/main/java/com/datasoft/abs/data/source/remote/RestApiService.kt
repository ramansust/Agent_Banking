package com.datasoft.abs.data.source.remote

import com.datasoft.abs.data.dto.CommonRequest
import com.datasoft.abs.data.dto.config.ConfigResponse
import com.datasoft.abs.data.dto.createCustomer.CreateCustomerRequest
import com.datasoft.abs.data.dto.customer.CustomerRequest
import com.datasoft.abs.data.dto.customer.CustomerResponse
import com.datasoft.abs.data.dto.dashboard.DashboardRequest
import com.datasoft.abs.data.dto.dashboard.DashboardResponse
import com.datasoft.abs.data.dto.dedupecheck.DedupeCheckRequest
import com.datasoft.abs.data.dto.dedupecheck.DedupeCheckResponse
import com.datasoft.abs.data.dto.login.LoginRequest
import com.datasoft.abs.data.dto.login.LoginResponse
import com.datasoft.abs.data.dto.sanctionscreening.SanctionScreeningRequest
import com.datasoft.abs.data.dto.sanctionscreening.SanctionScreeningResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import java.util.*

interface RestApiService {
    @POST("api/login")
    suspend fun performLogin(@Body loginRequest: LoginRequest): Response<LoginResponse>

    @POST("api/teller-dashboard")
    suspend fun getDashboardData(@Body dashboardRequest: DashboardRequest): Response<DashboardResponse>

    @GET("api/others-info")
    suspend fun getConfigData() : Response<ConfigResponse>

    @POST("api/customer-list")
    suspend fun getCustomerListData(@Body customerRequest: CustomerRequest): Response<CustomerResponse>

    @POST("api/sanction-screening")
    suspend fun getSanctionScreeningData(@Body sanctionScreeningRequest: SanctionScreeningRequest): Response<SanctionScreeningResponse>

    @POST("api/dedupe-check")
    suspend fun getDedupeCheckData(@Body dedupeCheckRequest: DedupeCheckRequest): Response<DedupeCheckResponse>

    @POST("api/create-customer")
    suspend fun createCustomerData(@Body createCustomerRequest: CreateCustomerRequest): Response<Objects>

    @POST("api/deposit-list")
    suspend fun getDepositData(@Body commonRequest: CommonRequest): Response<Objects>

    @POST("api/withdraw-list")
    suspend fun getWithdrawData(@Body commonRequest: CommonRequest): Response<Objects>

    @POST("api/transfer-list")
    suspend fun getTransferData(@Body commonRequest: CommonRequest): Response<Objects>
}