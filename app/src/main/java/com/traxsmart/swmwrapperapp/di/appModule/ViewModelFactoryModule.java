package com.traxsmart.swmwrapperapp.di.appModule;

import androidx.lifecycle.ViewModelProvider;

import com.traxsmart.swmwrapperapp.utils.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory viewModelFactory);
}
