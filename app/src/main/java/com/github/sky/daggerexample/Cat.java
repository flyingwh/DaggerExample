package com.github.sky.daggerexample;

import com.google.auto.value.AutoValue;

/**
 * Created by fuyuxian on 2016/12/23.
 */

@AutoValue
public abstract class Cat {
    abstract String name();
    abstract int age();

//    public static Cat create(String name, int age) {
//        return new AutoValue_Cat(name, age);
//    }

    public static Builder builder() {
        return new AutoValue_Cat.Builder();
    }

    @AutoValue.Builder
    abstract static class Builder {
        abstract Builder name(String name);
        abstract Builder age(int age);
        abstract Cat build();
    }
}
