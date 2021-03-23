package com.traxsmart.swmwrapperapp.ui_auth;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import com.traxsmart.swmwrapperapp.R;
import com.traxsmart.swmwrapperapp.utils.ViewModelProviderFactory;
import com.traxsmart.swmwrapperapp.base.BaseActivity;
import com.traxsmart.swmwrapperapp.databinding.ActivityLoginBinding;

import javax.inject.Inject;

public class LoginActivity extends BaseActivity implements LoginListener {

    private ActivityLoginBinding viewBinding;
    public LoginViewModel viewModel;

    @Inject
    ViewModelProviderFactory providerFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        viewBinding = DataBindingUtil.inflate(getLayoutInflater(), R.layout.activity_login, findViewById(R.id.activity_content), true);
        //viewModel = new ViewModelProvider(this, providerFactory).get(LoginViewModel.class);
        viewModel = ViewModelProviders.of(this, providerFactory).get(LoginViewModel.class);
        viewBinding.setViewModel(viewModel);
    }

    @Override
    public void onLoginClick() {

    }

    @Override
    public void onSignUpClick() {

    }

    @Override
    public void onForgotPasswordClick() {

    }

    @Override
    public void changeLanguage() {

    }
}