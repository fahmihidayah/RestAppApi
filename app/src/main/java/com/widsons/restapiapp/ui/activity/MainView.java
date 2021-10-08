package com.widsons.restapiapp.ui.activity;

import com.widsons.restapiapp.data.model.Todo;

import java.util.ArrayList;

/**
 * Created on : October/08/2021
 * Author     : Muhammad Fahmi Hidayah
 * Company    : PiXilApps
 * Project    : RestApiApp
 */
interface MainView {
    public void showMessage(String text);
    public void showData(ArrayList<Todo> todos);
}
