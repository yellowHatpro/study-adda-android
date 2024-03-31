package dev.yellowhatpro.studyadda.common.hilt

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import dev.yellowhatpro.studyadda.data.source.remote.StudyAddaDataSource
import dev.yellowhatpro.studyadda.internet.ConnectivityObserver
import dev.yellowhatpro.studyadda.internet.NetworkConnectivityObserver
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Provides
    @Singleton
    fun providesAPIService() = Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com/")
        .build()
        .create(StudyAddaDataSource::class.java)

    @Provides
    @Singleton
    fun providesConnectivityObserver(
        @ApplicationContext context : Context
    ) : ConnectivityObserver = NetworkConnectivityObserver(context)

}