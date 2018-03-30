package com.mvvmexample.view;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.mvvmexample.R;
import com.mvvmexample.databinding.ActivityLoginBinding;
import com.mvvmexample.viewmodel.LoginViewModel;

/**
 * Created by admin on 19/03/2018.
 */

public class LoginActivity extends Activity {

    private Activity activity;
    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);

        activity = this;

        LoginViewModel loginViewModel = new LoginViewModel(activity);
        binding.setLoginData(loginViewModel);

    }
}