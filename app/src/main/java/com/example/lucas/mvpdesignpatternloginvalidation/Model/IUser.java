package com.example.lucas.mvpdesignpatternloginvalidation.Model;

/**
 * Created by Lucas on 18/06/2018.
 */

public interface IUser {

    String getEmail();
    String getPassword();
    boolean isValidDate();

}
