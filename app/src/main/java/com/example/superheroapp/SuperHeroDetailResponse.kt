package com.example.superheroapp

import com.google.gson.annotations.SerializedName

data class SuperHeroDetailResponse(@SerializedName("name") val name: String)