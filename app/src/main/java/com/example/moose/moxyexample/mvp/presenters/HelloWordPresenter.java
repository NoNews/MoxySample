package com.example.moose.moxyexample.mvp.presenters;


import com.example.moose.moxyexample.mvp.views.HelloWordView;
import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

@InjectViewState
public class HelloWordPresenter extends MvpPresenter<HelloWordView> {

    public  HelloWordPresenter(){
        //base set ui here
    }

    public void setHelloText(){
        //logic here
        if (10>9) getViewState().setHelloWord("Hello world");
        else getViewState().setHelloWord("Goodbye world");
    }
}
