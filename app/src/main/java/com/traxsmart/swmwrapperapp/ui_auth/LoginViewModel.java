package com.traxsmart.swmwrapperapp.ui_auth;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.traxsmart.swmwrapperapp.utils.session.SessionManager;
import com.traxsmart.swmwrapperapp.repos.AuthRepository;

import javax.inject.Inject;

public class LoginViewModel extends ViewModel {

    private static final String TAG = "LoginViewModel";
    // @Singleton scoped dependency
    private SessionManager sessionManager;
    // @LoginScope scoped dependency
    private AuthRepository repository;

    @Inject
    public LoginViewModel(AuthRepository repository, SessionManager sessionManager) {
        this.sessionManager = sessionManager;
        //this.repository = repository;
        Log.d(TAG, "LoginViewModel: viewmodel is working...");
    }
}