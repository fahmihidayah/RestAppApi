package com.widsons.restapiapp.data.service;

import com.widsons.restapiapp.data.model.Todo;

import java.util.ArrayList;

import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
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



    @Headers({
            "Cache-Control: max-age=640000",
            "apikey: eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJyb2xlIjoic2VydmljZV9yb2xlIiwiaWF0IjoxNjMxNTA5NjYxLCJleHAiOjE5NDcwODU2NjF9.1pbpy3BsYs_zLqd-LGbXdIH9MI2EwMzQ2b0fAFizwUA",
            "Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJyb2xlIjoic2VydmljZV9yb2xlIiwiaWF0IjoxNjMxNTA5NjYxLCJleHAiOjE5NDcwODU2NjF9.1pbpy3BsYs_zLqd-LGbXdIH9MI2EwMzQ2b0fAFizwUA"
            ,"Prefer: return=representation"
    })
    @POST("v1/todo")
    @FormUrlEncoded
    Call<ArrayList<Todo>> postTodo(
           @Field("title") String title,
           @Field("description") String description
    );

    @Headers({
            "Cache-Control: max-age=640000",
            "apikey: eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJyb2xlIjoic2VydmljZV9yb2xlIiwiaWF0IjoxNjMxNTA5NjYxLCJleHAiOjE5NDcwODU2NjF9.1pbpy3BsYs_zLqd-LGbXdIH9MI2EwMzQ2b0fAFizwUA",
            "Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJyb2xlIjoic2VydmljZV9yb2xlIiwiaWF0IjoxNjMxNTA5NjYxLCJleHAiOjE5NDcwODU2NjF9.1pbpy3BsYs_zLqd-LGbXdIH9MI2EwMzQ2b0fAFizwUA"
            ,"Prefer: return=representation"
    })
    @DELETE("v1/todo")
    Call<ArrayList<Todo>> deleteTodo(
           @Field("id") String id
    );

    @Headers({
            "Cache-Control: max-age=640000",
            "apikey: eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJyb2xlIjoic2VydmljZV9yb2xlIiwiaWF0IjoxNjMxNTA5NjYxLCJleHAiOjE5NDcwODU2NjF9.1pbpy3BsYs_zLqd-LGbXdIH9MI2EwMzQ2b0fAFizwUA",
            "Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJyb2xlIjoic2VydmljZV9yb2xlIiwiaWF0IjoxNjMxNTA5NjYxLCJleHAiOjE5NDcwODU2NjF9.1pbpy3BsYs_zLqd-LGbXdIH9MI2EwMzQ2b0fAFizwUA"
            ,"Prefer: return=representation"
    })
    @PATCH("v1/todo")
    Call<ArrayList<Todo>> updateTodo(
            @Field("title") String title,
            @Field("description") String description
    );

}
