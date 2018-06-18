package com.example.lucas.mvpdesignpatternloginvalidation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.lucas.mvpdesignpatternloginvalidation.Presenter.ILoginPresenter;
import com.example.lucas.mvpdesignpatternloginvalidation.Presenter.LoginPresenter;
import com.example.lucas.mvpdesignpatternloginvalidation.View.ILoginView;

public class MainActivity extends AppCompatActivity implements ILoginView{

    private EditText editTextEmail, editTextPassword;
    private Button buttonLogIn;

    private ILoginPresenter iLoginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Init view
        editTextEmail = findViewById(R.id.editText_email_id);
        editTextPassword = findViewById(R.id.editText_password_id);
        buttonLogIn = findViewById(R.id.button_login_id);

        //Init
        iLoginPresenter = new LoginPresenter(this);

        //Event
        buttonLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iLoginPresenter.onLogin(editTextEmail.getText().toString(), editTextPassword.getText().toString());
            }
        });


    }

    @Override
    public void onLoginResult(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
