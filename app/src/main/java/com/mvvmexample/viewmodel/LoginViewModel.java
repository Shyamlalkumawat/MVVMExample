package com.mvvmexample.viewmodel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.mvvmexample.BR;
import com.mvvmexample.model.LoginModel;

/**
 * Created by admin on 19/03/2018.
 */

public class LoginViewModel extends BaseObservable {

    private LoginModel loginModel;
    private Context context;


    public LoginViewModel(Context context) {
        this.loginModel = new LoginModel();
        this.context = context;
    }


    @Bindable
    public String getDataEmail() {
        return loginModel.getEmail();
    }

    @Bindable
    public String getDataPassword() {
        return loginModel.getPassword();
    }

    public void setDataEmail(String email) {
        loginModel.setEmail(email);
        notifyPropertyChanged(BR.dataEmail);   // This is used to have instant change in the text view with respect to edittext value
    }


    public View.OnClickListener onLoginButtonClicked() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("Login ", getDataEmail() + getDataPassword());
                Toast.makeText(view.getContext(), "Login username" + getDataEmail() + getDataPassword(), Toast.LENGTH_SHORT).show();
            }
        };
    }


}
