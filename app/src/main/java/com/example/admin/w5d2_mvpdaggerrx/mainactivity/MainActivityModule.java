package com.example.admin.w5d2_mvpdaggerrx.mainactivity;
import com.example.admin.w5d2_mvpdaggerrx.view.mainactivity.*;
import dagger.Component;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Admin on 9/27/2017.
 */

@Module
public class MainActivityModule {
    @Provides
    MainActivityPresenter getMainActivityPresenter(){ return new MainActivityPresenter(); }
}
