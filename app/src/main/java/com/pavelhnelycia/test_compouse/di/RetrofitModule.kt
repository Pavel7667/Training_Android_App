package com.pavelhnelycia.test_compouse.di

import com.pavelhnelycia.test_compouse.data.remote.GameApi
import com.pavelhnelycia.test_compouse.util.Constants.Companion.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * RetrofitModule is Dagger Hilt module that provides
 * a singleton instance of Retrofit and a GameApi interface.
 */
@Module
@InstallIn(SingletonComponent::class)
object RetrofitModule {

    /**
     * The provideRetrofit() method returns
     * a Retrofit object with a base URL and a Gson converter factory.
     */
    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    /**
     * The provideGameApi() method takes a Retrofit object as a parameter and returns an instance
     * of the GameApi interface, which is generated
     * by Retrofit and used to make HTTP requests.
     */
    @Singleton
    @Provides
    fun provideGameApi(retrofit: Retrofit): GameApi {
        return retrofit.create(GameApi::class.java)
    }
}