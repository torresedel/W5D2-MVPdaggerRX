package com.example.admin.w5d2_mvpdaggerrx;

/**
 * Created by Admin on 9/27/2017.
 */

public interface BasePresenter<V extends BaseView> {
    void attachView(V view);
    void detachView();
}
