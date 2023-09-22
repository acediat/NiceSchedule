package ru.acediat.niceschedule.model.network

sealed class ApiResponse<T> {
    data class Success<T>(val data: T): ApiResponse<T>()
    data class Error<T>(val code: Int, val message: String?, val data: T?): ApiResponse<T>()
}
