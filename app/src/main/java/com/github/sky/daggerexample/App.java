package com.github.sky.daggerexample;

import android.app.Application;

/**
 * Created by fuyuxian on 2016/12/23.
 */

public class App extends Application {

    private ApplicationComponent mComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent component() {
        return mComponent;
    }
}
