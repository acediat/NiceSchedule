package ru.acediat.niceschedule.model.network

import retrofit2.Retrofit

@Target(allowedTargets = [AnnotationTarget.CLASS])
@Retention(value = AnnotationRetention.RUNTIME)
annotation class EndpointUrl(val value: String)

inline fun <reified T : Any> Retrofit.Builder.buildApi(): T =
    baseUrl(getServiceUrl(T::class.java))
        .build()
        .create(T::class.java)

fun getServiceUrl(serviceClass: Class<*>): String {
    val annotation = serviceClass.getAnnotation(EndpointUrl::class.java)
        ?: error("$serviceClass should have @EndpointUrl annotation")

    return annotation.value
}