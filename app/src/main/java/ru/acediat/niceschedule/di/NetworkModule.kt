package ru.acediat.niceschedule.di

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Binds
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import ru.acediat.niceschedule.BuildConfig
import ru.acediat.niceschedule.model.network.ResponseMapper
import ru.acediat.niceschedule.model.network.ResponseMapperImpl
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
class NetworkModule {

    @Provides
    @Singleton
    fun provideGson() : Gson = GsonBuilder()
        .setLenient()
        .create()

    @Provides
    @Singleton
    fun provideHttpClient() : OkHttpClient = OkHttpClient.Builder().apply {
        if (BuildConfig.DEBUG) {
            addNetworkInterceptor(HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            })
        }
        readTimeout(35, TimeUnit.SECONDS)
        writeTimeout(35, TimeUnit.SECONDS)
        connectTimeout(35, TimeUnit.SECONDS)
    }.build()

    @Provides
    @Singleton
    fun provideRetrofitBuilder(
        client : OkHttpClient,
        gson : Gson
    ) : Retrofit.Builder = Retrofit.Builder()
        .client(client)
        .addConverterFactory(GsonConverterFactory.create(gson))

    @Provides
    fun provideResponseMapper(): ResponseMapper {
        return ResponseMapperImpl()
    }
}