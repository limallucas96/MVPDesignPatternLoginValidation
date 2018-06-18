package com.example.lucas.mvpdesignpatternloginvalidation.Model;

import android.text.TextUtils;
import android.util.Patterns;

import java.util.regex.Pattern;

/**
 * Created by Lucas on 18/06/2018.
 */

public class User implements  IUser{

    //Atributos e metodos da classe User
    private String email, password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    //Metodos de contrato da classe IUser
    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isValidDate() {
        //1. Check email is empty
        //2. Check email is matches pattern
        //3. Check password lenght > 6

        return !TextUtils.isEmpty(getEmail()) &&
                Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches() &&
                getPassword().length() > 6;
    }

}
