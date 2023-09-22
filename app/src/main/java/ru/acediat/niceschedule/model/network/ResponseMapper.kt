package ru.acediat.niceschedule.model.network

import retrofit2.Response

interface ResponseMapper {

    fun <T> map(response: Response<T>): ApiResponse<T>
}

class ResponseMapperImpl : ResponseMapper {
    override fun <T> map(response: Response<T>): ApiResponse<T> {
        if (!response.isSuccessful) {
            return ApiResponse.Error(response.code(), null, null)
        }
        return if (response.body() != null) {
            ApiResponse.Success(response.body()!!)
        } else {
            ApiResponse.Error(0, null, response.body())
        }
    }
}
