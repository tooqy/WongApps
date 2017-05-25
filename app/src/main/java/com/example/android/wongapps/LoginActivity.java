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

        toastLogin = Toast.makeText(this, "Welcome back, " + username.getText() + "!", Toast.LENGTH_SHORT);
        toastLogin.setGravity(Gravity.CENTER, 0, 0);
        toastLogin.show();

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("username", username.getText().toString());
        startActivity(intent);

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
}
