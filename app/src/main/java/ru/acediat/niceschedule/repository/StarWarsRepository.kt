package ru.acediat.niceschedule.repository

import ru.acediat.niceschedule.model.entities.Person
import ru.acediat.niceschedule.model.network.ApiResponse
import ru.acediat.niceschedule.model.network.ResponseMapper
import ru.acediat.niceschedule.model.network.StarWarsApi
import javax.inject.Inject

interface StarWarsRepository {

    suspend fun getPersons(): List<Person>
}

class StarWarsRepositoryImpl @Inject constructor(
    private val api: StarWarsApi,
    private val responseMapper: ResponseMapper,
) : StarWarsRepository {

    override suspend fun getPersons(): List<Person> {
        val response = responseMapper.map(api.getPersons())
        if (response is ApiResponse.Success) {
            
        } else if (response is ApiResponse.Error) {

        }
    }
}