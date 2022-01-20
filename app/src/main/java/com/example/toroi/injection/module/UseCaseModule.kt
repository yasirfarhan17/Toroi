package com.example.toroi.injection.module

import com.example.network_domain.repository.LoginRepository
import com.example.network_domain.usecase.login.LoginUseCase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UseCaseModule {

    @Singleton
    @Provides
    fun provideBeforePaymentUseCase(
        repo: LoginRepository
    ): LoginUseCase {
        return LoginUseCase(repo)
    }


}