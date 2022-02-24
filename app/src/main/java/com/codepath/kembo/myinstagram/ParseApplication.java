package com.codepath.kembo.myinstagram;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("LTBKUoVF0gpi383Hnw6dIewNrYBtdkcb4MCLm4vR")
                .clientKey("wen2scoKxosqnCmDl2nitBhGcx2cNRmjFjAABbfR")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
