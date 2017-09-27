package com.example.admin.w5d2_mvpdaggerrx.view.mainactivity;

import com.example.admin.w5d2_mvpdaggerrx.model.*;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

/**
 * Created by Admin on 9/27/2017.
 */

public class MainActivityPresenter implements MainActivityContract.Presenter {
    MainActivityContract.View view;

    //EYE
    private Observer<Integer> integerObserver = new Observer<Integer>() {
        @Override
        public void onSubscribe(@NonNull Disposable d) {
            System.out.println("onSubscribe: ");
        }

        @Override
        public void onNext(@NonNull Integer integer) {
            view.onObserverClicked(String.valueOf(integer));
        }

        @Override
        public void onError(@NonNull Throwable e) {
            System.out.println("onError: ");
        }

        @Override
        public void onComplete() {
            System.out.println("onComplete: ");
        }
    };
    //EYE!!

    RxFunctions rxFunctions = new RxFunctions(integerObserver);

    @Override
    public void attachView(MainActivityContract.View view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        this.view = null;
    }

    @Override
    public void validateFrom() {
        rxFunctions.from();
    }

    @Override
    public void validateJust() {
        rxFunctions.just();
    }

    @Override
    public void validateRepeat() {
        rxFunctions.repeat();
    }

    @Override
    public void validateRange() {
        rxFunctions.range();
    }

    @Override
    public void validateTimer() {
        rxFunctions.timer();
    }

    @Override
    public void validateFirst() {
        rxFunctions.first();
    }

    @Override
    public void validateSample() {
        rxFunctions.sample();
    }

    @Override
    public void validateTake() {
        rxFunctions.take();
    }

    @Override
    public void validateMerge() {
        rxFunctions.merge();
    }

    @Override
    public void validateSkipUntil() {
        rxFunctions.skipUntil();
    }

    @Override
    public void validateAverage() {
        rxFunctions.average();
    }

    @Override
    public void validateMax() {
        rxFunctions.max();
    }

    @Override
    public void validateMin() {
        rxFunctions.min();
    }

    @Override
    public void validateCount() {
        rxFunctions.count();
    }

    @Override
    public void validateSum() {
        rxFunctions.sum();
    }
}
