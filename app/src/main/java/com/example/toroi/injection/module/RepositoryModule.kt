package com.example.toroi.injection.module

import com.example.network_domain.network.api.LoginApi
import com.example.network_domain.repository.LoginRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {
    @Singleton
    @Provides
    fun providePaymentRepository(
        api: LoginApi
    ): LoginRepository {
        return LoginRepository(api)
    }

}