package com.baharudin.networkstate.api

import com.baharudin.networkstate.model.Todo
import retrofit2.Response
import retrofit2.http.GET

interface TodoApi {

    @GET("/todos")
    suspend fun getTodos() : Response<List<Todo>>
}