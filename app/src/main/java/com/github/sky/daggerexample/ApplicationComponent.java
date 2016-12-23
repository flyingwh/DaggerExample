package com.github.sky.daggerexample;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by fuyuxian on 2016/12/23.
 */

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
    void inject(MainActivity __);
}
