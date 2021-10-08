package com.widsons.restapiapp.ui.activity;

import android.widget.Toast;

import com.widsons.restapiapp.data.conf.NetworkConf;
import com.widsons.restapiapp.data.model.Todo;
import com.widsons.restapiapp.data.service.ApiService;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created on : October/01/2021
 * Author     : Muhammad Fahmi Hidayah
 * Company    : PiXilApps
 * Project    : RestApiApp
 */
class MainPresenter {
    private ApiService apiService = NetworkConf.getApiService();

    public void requestTodo(MainView mainView) {
        apiService.requestListTodo("title,description").enqueue(new Callback<ArrayList<Todo>>() {
            @Override
            public void onResponse(Call<ArrayList<Todo>> call, Response<ArrayList<Todo>> response) {
                ArrayList<Todo> todos = response.body();
                mainView.showMessage("berhasil tampil data");
                mainView.showData(todos);
//                Toast.makeText(MainActivity.this, "data dari server " + todos.size(), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<ArrayList<Todo>> call, Throwable t) {
                mainView.showMessage("Terjadi kesalahan");
//                Toast.makeText(MainActivity.this,"terjadi kesalahan", Toast.LENGTH_SHORT).show();

            }
        });
    }

    public void postTodo(String title,
                         String description,
                         MainView mainView) {
        apiService.postTodo(title, description).enqueue(new Callback<ArrayList<Todo>>() {
            @Override
            public void onResponse(Call<ArrayList<Todo>> call, Response<ArrayList<Todo>> response) {
                mainView.showMessage("Berhasil menyimpan data");
            }

            @Override
            public void onFailure(Call<ArrayList<Todo>> call, Throwable t) {
                mainView.showMessage("terjadi kesalahan");
            }
        });
    }

}
