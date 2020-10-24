package com.example.healthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    private String userStr;
    private String pwdStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }


    public void onSignUp(View view){
        EditText user = (EditText) findViewById(R.id.newUserName);
        EditText pwd = (EditText) findViewById(R.id.newPwd);

        userStr = user.toString();
        pwdStr = pwd.toString();

    }
}
