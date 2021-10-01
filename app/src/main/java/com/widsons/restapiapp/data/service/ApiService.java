package com.widsons.restapiapp.data.service;

import com.widsons.restapiapp.data.model.Todo;

import java.util.ArrayList;

import okhttp3.Response;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created on : September/30/2021
 * Author     : Muhammad Fahmi Hidayah
 * Company    : PiXilApps
 * Project    : RestApiApp
 */
// step ke 4 bikin interface API service
public interface ApiService {

    @GET("v1/todo")
    Call<ArrayList<Todo>> requestListTodo();
}
