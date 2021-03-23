package com.traxsmart.swmwrapperapp.base;

import com.traxsmart.swmwrapperapp.di.appModule.DaggerAppComponent;
import com.traxsmart.swmwrapperapp.utils.ServiceHolder;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class BaseApplication extends DaggerApplication {

    public static BaseApplication instance;
    public static ServiceHolder mServiceHolder;

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        //return null;
        return DaggerAppComponent.builder()
                .application(this)
                .build();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mServiceHolder = ServiceHolder.getInstance(getApplicationContext());
        instance = this;
    }

    public static BaseApplication getBaseApplicationInstance(){
        return instance;
    }
}
