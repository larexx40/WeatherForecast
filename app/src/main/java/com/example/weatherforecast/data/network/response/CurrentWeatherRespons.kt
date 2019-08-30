package com.example.weatherforecast.data.network.response


import com.example.weatherforecast.data.db.entity.CurrentWeatherEntry
import com.example.weatherforecast.data.db.entity.Location
import com.google.gson.annotations.SerializedName

data class CurrentWeatherRespons(
    val location: Location,
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry

)