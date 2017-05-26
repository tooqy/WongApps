package com.example.android.wongapps;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import employee.attendance.AttendanceActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;

    private Toast toastLogin;
    private boolean doubleBackToExitPressedOnce = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void checkLogin(View view) {
        username = (EditText) findViewById(R.id.txtUsername);
        password = (EditText) findViewById(R.id.txtPassword);

        if (username.getText().toString().equals("") || username.getText().toString().equals("")) {
            toastLogin = Toast.makeText(this, "Please fill username and password!", Toast.LENGTH_LONG);
            toastLogin.setGravity(Gravity.CENTER, 0, 0);
            toastLogin.show();
            return;
        }

        if (username.getText().toString().equals("admin") && password.getText().toString().equals("12345")) {
            toastLogin = Toast.makeText(this, "Welcome back, " + username.getText() + "!", Toast.LENGTH_SHORT);
            toastLogin.setGravity(Gravity.CENTER, 0, 0);
            toastLogin.show();

            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("username", username.getText().toString());
            startActivity(intent);
            finish();
        } else {
            toastLogin = Toast.makeText(this, "Please see [Login Hint] for login!", Toast.LENGTH_LONG);
            toastLogin.setGravity(Gravity.CENTER, 0, 0);
            toastLogin.show();

            username.setText("");
            password.setText("");
        }
    }

    public void onBackPressed() {
        //checking for fragment count on backstack

        if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
            getSupportFragmentManager().popBackStack();
        } else if (!doubleBackToExitPressedOnce) {
            this.doubleBackToExitPressedOnce = true;

            Toast.makeText(this, "Please click Back again to exit apps!", Toast.LENGTH_SHORT).show();

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    doubleBackToExitPressedOnce = false;
                }
            }, 2500);
        } else {
            super.onBackPressed();
            return;
        }
    }

    public void viewHint(View view) {
        String msg = "      Login Hint\nUsername: admin\nPassword:12345";
        Toast toastLogin = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toastLogin.setGravity(Gravity.CENTER, 0, 0);
        toastLogin.show();

    }
}
