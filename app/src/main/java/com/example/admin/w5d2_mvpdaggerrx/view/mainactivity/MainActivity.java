package com.example.admin.w5d2_mvpdaggerrx.view.mainactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.admin.w5d2_mvpdaggerrx.R;
import com.example.admin.w5d2_mvpdaggerrx.mainactivity.DaggerMainActivityComponent;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {

    private static final String TAG = "MainActivityTag";

    @Inject
    MainActivityPresenter presenter;
    @BindView(R.id.btnFrom)
    Button btnFrom;
    @BindView(R.id.btnJust)
    Button btnJust;
    @BindView(R.id.btnRepeat)
    Button btnRepeat;
    @BindView(R.id.btnRange)
    Button btnRange;
    @BindView(R.id.btnTimer)
    Button btnTimer;
    @BindView(R.id.btnFirst)
    Button btnFirst;
    @BindView(R.id.btnSample)
    Button btnSample;
    @BindView(R.id.btnTake)
    Button btnTake;
    @BindView(R.id.btnMerge)
    Button btnMerge;
    @BindView(R.id.btnSkipUntil)
    Button btnSkipUntil;
    @BindView(R.id.btnAverage)
    Button btnAverage;
    @BindView(R.id.btnMax)
    Button btnMax;
    @BindView(R.id.btnMin)
    Button btnMin;
    @BindView(R.id.btnCount)
    Button btnCount;
    @BindView(R.id.btnSum)
    Button btnSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        setupDaggerComponent();

        presenter.attachView(this);
    }

    private void setupDaggerComponent() {
        DaggerMainActivityComponent.create().inject(this);
    }

    @Override
    public void showError(String s) {
        Log.d(TAG, "showError: " + s);
    }

    @Override
    public void onObserverClicked(String s) {
        //////////////////////////////////////////////////FILL
    }

    @OnClick({R.id.btnFrom, R.id.btnJust, R.id.btnRepeat, R.id.btnRange, R.id.btnTimer, R.id.btnFirst, R.id.btnSample, R.id.btnTake, R.id.btnMerge, R.id.btnSkipUntil, R.id.btnAverage, R.id.btnMax, R.id.btnMin, R.id.btnCount, R.id.btnSum})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnFrom:
                presenter.validateFrom();
                break;
            case R.id.btnJust:
                presenter.validateJust();
                break;
            case R.id.btnRepeat:
                presenter.validateRepeat();
                break;
            case R.id.btnRange:
                presenter.validateRange();
                break;
            case R.id.btnTimer:
                presenter.validateTimer();
                break;
            case R.id.btnFirst:
                presenter.validateFirst();
                break;
            case R.id.btnSample:
                presenter.validateSample();
                break;
            case R.id.btnTake:
                presenter.validateTake();
                break;
            case R.id.btnMerge:
                presenter.validateMerge();
                break;
            case R.id.btnSkipUntil:
                presenter.validateSkipUntil();
                break;
            case R.id.btnAverage:
                presenter.validateAverage();
                break;
            case R.id.btnMax:
                presenter.validateMax();
                break;
            case R.id.btnMin:
                presenter.validateMin();
                break;
            case R.id.btnCount:
                presenter.validateCount();
                break;
            case R.id.btnSum:
                presenter.validateSum();
                break;
        }
    }
}
