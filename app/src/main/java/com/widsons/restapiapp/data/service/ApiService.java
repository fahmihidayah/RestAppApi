package com.widsons.restapiapp.data.service;

import com.widsons.restapiapp.data.model.Todo;

import java.util.ArrayList;

import okhttp3.Response;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created on : September/30/2021
 * Author     : Muhammad Fahmi Hidayah
 * Company    : PiXilApps
 * Project    : RestApiApp
 */
// step ke 4 bikin interface API service
public interface ApiService {
    @Headers({
            "Cache-Control: max-age=640000",
            "apikey: eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJyb2xlIjoic2VydmljZV9yb2xlIiwiaWF0IjoxNjMxNTA5NjYxLCJleHAiOjE5NDcwODU2NjF9.1pbpy3BsYs_zLqd-LGbXdIH9MI2EwMzQ2b0fAFizwUA",
            "Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJyb2xlIjoic2VydmljZV9yb2xlIiwiaWF0IjoxNjMxNTA5NjYxLCJleHAiOjE5NDcwODU2NjF9.1pbpy3BsYs_zLqd-LGbXdIH9MI2EwMzQ2b0fAFizwUA"
    })
    @GET("v1/todo")
    Call<ArrayList<Todo>> requestListTodo(
            @Query("select") String value
    );
}
