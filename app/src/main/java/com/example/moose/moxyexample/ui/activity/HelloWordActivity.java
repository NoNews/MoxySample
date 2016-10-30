package com.example.moose.moxyexample.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;


import com.example.moose.moxyexample.R;
import com.example.moose.moxyexample.mvp.views.HelloWordView;
import com.example.moose.moxyexample.mvp.presenters.HelloWordPresenter;


import com.arellomobile.mvp.presenter.InjectPresenter;

public class HelloWordActivity extends BaseActivity implements HelloWordView {
    private static final int LAYOUT = R.layout.activity_hello_word;


    @InjectPresenter
    HelloWordPresenter helloWordPresenter;

    Toolbar toolbar;
    TextView tvHello;

    public static Intent getIntent(final Context context) {
        Intent intent = new Intent(context, HelloWordActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(LAYOUT);
        findElements();
        setToolbar();
        setupUI();
    }


    private void findElements() {
        tvHello = (TextView) findViewById(R.id.tvHello);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
    }


    private void setToolbar() {
        toolbar.setTitle("Hello with moxy");
    }

    private void setupUI() {
        helloWordPresenter.setHelloText();
    }

    @Override
    public void setHelloWord(String text) {
        tvHello.setText(text);
    }
}
