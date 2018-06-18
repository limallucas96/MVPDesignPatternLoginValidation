package com.example.lucas.mvpdesignpatternloginvalidation.Presenter;

import com.example.lucas.mvpdesignpatternloginvalidation.Model.User;
import com.example.lucas.mvpdesignpatternloginvalidation.View.ILoginView;

/**
 * Created by Lucas on 18/06/2018.
 */

public class LoginPresenter implements ILoginPresenter {

    ILoginView iLoginView;

    public LoginPresenter(ILoginView iLoginView) {
        this.iLoginView = iLoginView;
    }

    @Override
    public void onLogin(String email, String password) {
        User user = new User(email, password);
        boolean isLoginSucess = user.isValidDate();

        if(isLoginSucess){
            iLoginView.onLoginResult("Login Sucess");
        }
        else{
            iLoginView.onLoginResult("Login Error");
        }
    }
}
