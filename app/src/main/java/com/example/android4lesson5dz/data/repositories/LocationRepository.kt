package com.example.android4lesson5dz.data.repositories

import com.example.android4lesson5dz.base.BaseRepository
import com.example.android4lesson5dz.data.remote.apiserveces.LocationApiService
import javax.inject.Inject


class LocationRepository  @Inject constructor(
    private val locationApiService: LocationApiService
) : BaseRepository() {

    fun fetchLocation() = doRequest {
            locationApiService.fetchLocation()
        }
    }