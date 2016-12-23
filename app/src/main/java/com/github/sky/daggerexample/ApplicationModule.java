package com.github.sky.daggerexample;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by fuyuxian on 2016/12/23.
 */

@Module
public class ApplicationModule {

    private Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    App provideApplication() {
        return (App) mApplication;
    }

    @Provides
    @Singleton
    Cat provideCat(App application) {
        return Cat.builder().age(3).name("qwq").build();
    }
}
