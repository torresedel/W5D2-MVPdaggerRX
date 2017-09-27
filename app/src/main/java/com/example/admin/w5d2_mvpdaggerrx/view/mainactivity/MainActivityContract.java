package com.example.admin.w5d2_mvpdaggerrx.view.mainactivity;

import com.example.admin.w5d2_mvpdaggerrx.*;

/**
 * Created by Admin on 9/27/2017.
 */

public interface MainActivityContract {
    interface View extends BaseView {
        void onObserverClicked(String s);
    }

    interface Presenter extends BasePresenter<View> {
        void validateFrom();

        void validateJust();

        void validateRepeat();

        void validateRange();

        void validateTimer();

        void validateFirst();

        void validateSample();

        void validateTake();

        void validateMerge();

        void validateSkipUntil();

        void validateAverage();

        void validateMax();

        void validateMin();

        void validateCount();

        void validateSum();
    }
}
