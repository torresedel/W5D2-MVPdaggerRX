package com.example.admin.w5d2_mvpdaggerrx.mainactivity;
import com.example.admin.w5d2_mvpdaggerrx.view.mainactivity.*;
import dagger.Component;

/**
 * Created by Admin on 9/27/2017.
 */

@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {
    void inject(MainActivity mainActivity);
}
