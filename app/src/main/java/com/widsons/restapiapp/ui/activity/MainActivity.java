package com.widsons.restapiapp.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.widsons.restapiapp.R;
import com.widsons.restapiapp.data.conf.NetworkConf;
import com.widsons.restapiapp.data.model.Todo;
import com.widsons.restapiapp.data.service.ApiService;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // step 6
        ApiService apiService = NetworkConf.getApiService();
        // step 7 panggil ke server
        apiService.requestListTodo().enqueue(new Callback<ArrayList<Todo>>() {
            @Override
            public void onResponse(Call<ArrayList<Todo>> call, Response<ArrayList<Todo>> response) {
                ArrayList<Todo> todos = response.body();
                System.out.println("data dari server " + todos.size());
            }

            @Override
            public void onFailure(Call<ArrayList<Todo>> call, Throwable t) {

            }
        });
    }
}