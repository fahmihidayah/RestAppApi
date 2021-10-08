package com.widsons.restapiapp.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.widsons.restapiapp.R;
import com.widsons.restapiapp.data.conf.NetworkConf;
import com.widsons.restapiapp.data.model.Todo;
import com.widsons.restapiapp.data.service.ApiService;

import java.util.ArrayList;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements MainView {

    MainPresenter presenter = new MainPresenter();


//        // step 6
//        ApiService apiService = NetworkConf.getApiService();
//        // step 7 panggil ke server
//        apiService.requestListTodo("title,description").enqueue(new Callback<ArrayList<Todo>>() {
//            @Override
//            public void onResponse(Call<ArrayList<Todo>> call, Response<ArrayList<Todo>> response) {
//                ArrayList<Todo> todos = response.body();
//                Toast.makeText(MainActivity.this, "data dari server " + todos.size(), Toast.LENGTH_SHORT).show();
//
//            }
//
//            @Override
//            public void onFailure(Call<ArrayList<Todo>> call, Throwable t) {
//
//
//            }
//        });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter.requestTodo(this);

        findViewById(R.id.button).setOnClickListener(view ->
                presenter.postTodo("hello", "databaru", this)
        );
    }


    @Override
    public void showMessage(String text) {
        Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showData(ArrayList<Todo> todos) {
        Toast.makeText(MainActivity.this, "jumlah data " + todos.size(), Toast.LENGTH_SHORT).show();
    }
}