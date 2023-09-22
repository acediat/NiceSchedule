package ru.acediat.niceschedule.model.network

import ru.acediat.niceschedule.BuildConfig

@EndpointUrl(BuildConfig.API_URL)
interface ScheduleApi {

    fun getSchedule(date: String)
}