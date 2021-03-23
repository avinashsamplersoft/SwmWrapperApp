package com.traxsmart.swmwrapperapp.di.activitiesModule.login;

import androidx.lifecycle.ViewModel;

import com.traxsmart.swmwrapperapp.di.appModule.ViewModelKey;
import com.traxsmart.swmwrapperapp.ui_auth.LoginViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class LoginViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel.class)
    public abstract ViewModel bindAuthViewModel(LoginViewModel viewModel);
}
