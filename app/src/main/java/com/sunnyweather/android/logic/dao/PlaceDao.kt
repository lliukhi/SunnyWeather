package com.sunnyweather.android.logic.dao

import android.content.Context
import android.provider.Settings.Secure.putString
import androidx.core.content.edit
import com.google.gson.Gson
import com.sunnyweather.android.SunnyWeather
import com.sunnyweather.android.logic.model.Place

object PlaceDao {
    fun savePlace(place: Place) {
        sharedPreferences().edit {
            putString("place", Gson().toJson(place))
        }
    }
    fun getSavedPlace(): Place {
        val placeJson = sharedPreferences().getString("place", "")
        return Gson().fromJson(placeJson, Place::class.java)
    }
    fun isPlaceSaved() = sharedPreferences().contains("place")
    private fun sharedPreferences() = SunnyWeather.context.
    getSharedPreferences("sunny_weather", Context.MODE_PRIVATE)
}