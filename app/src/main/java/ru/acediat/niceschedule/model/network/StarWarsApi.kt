package ru.acediat.niceschedule.model.network

import retrofit2.Response
import retrofit2.http.GET
import ru.acediat.niceschedule.BuildConfig
import ru.acediat.niceschedule.model.dto.PersonDto

@EndpointUrl(BuildConfig.API_URL)
interface StarWarsApi {

    @GET("people")
    suspend fun getPersons(): Response<List<PersonDto>>
}