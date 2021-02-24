package edu.temple.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static class Utility  {
        public static void showErrorMessage(Context context, String text) {
            Toast.makeText(context, text, Toast.LENGTH_LONG).show();
        }
    }

    public void btnRegister(View v) {
       TextView email = (TextView)findViewById(R.id.editTextTextEmailAddress);
       TextView pw = (TextView)findViewById(R.id.editTextTextPassword);
       TextView pwConf = (TextView)findViewById(R.id.editTextTextPasswordConf);

        String inputEmail = ""+ email.getText();
        String inputPw = ""+ pw.getText();
        String inputPwConf = ""+ pwConf.getText();
        if(!inputPw.equals(inputPwConf)) {
            Utility.showErrorMessage(getApplicationContext(), "Passwords do not match");
        } else {
            Utility.showErrorMessage(getApplicationContext(), "Registration successful");
        }


    }
}