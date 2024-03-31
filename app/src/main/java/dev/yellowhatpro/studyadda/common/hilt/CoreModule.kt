package dev.yellowhatpro.studyadda.common.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.yellowhatpro.studyadda.data.remote.NetworkService
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CoreModule {
    @Provides
    @Singleton
    fun providesAPIService() = Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com/")
        .build()
        .create(NetworkService::class.java)
}