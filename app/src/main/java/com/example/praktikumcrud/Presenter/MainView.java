package com.example.praktikumcrud.Presenter;

import com.example.praktikumcrud.Model.GetModel.GetResponse;

public interface MainView {
    void getSucces(GetResponse list);
    void setToast(String message);
    void onError(String errorMessage);
    void onFailure(String failureMessage);
}
