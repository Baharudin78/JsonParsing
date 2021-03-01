package com.baharudin.networkstate.api

import com.baharudin.networkstate.util.Constant.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstance {
    companion object {
        val retrofit by lazy {
            Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        val api : TodoApi by lazy {
            retrofit.create(TodoApi::class.java)
        }
    }


}