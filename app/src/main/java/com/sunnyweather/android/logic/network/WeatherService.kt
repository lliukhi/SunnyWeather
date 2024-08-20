package com.sunnyweather.android.logic.network

import com.sunnyweather.android.SunnyWeather
import com.sunnyweather.android.logic.model.DailyResponse
import com.sunnyweather.android.logic.model.RealtimeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface WeatherService {
    @GET("v2.6/${SunnyWeather.TOKEN}/{lng},{lat}/realtime")
    fun getRealtimeWeather(@Path("lng") lng: String, @Path("lat") lat: String):
            Call<RealtimeResponse>
    @GET("v2.6/${SunnyWeather.TOKEN}/{lng},{lat}/daily?dailysteps=3")
    fun getDailyWeather(@Path("lng") lng: String, @Path("lat") lat: String):
            Call<DailyResponse>
}