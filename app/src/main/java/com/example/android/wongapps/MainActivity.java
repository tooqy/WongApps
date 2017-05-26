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
import android.widget.Toast;

import employee.attendance.AttendanceActivity;
import employee.information.EmployeeInformationActivity;
import employee.leave.LeaveActivity;
import employee.payroll.PayrollActivity;

public class MainActivity extends AppCompatActivity {

    public String sessionUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Wong Apps");

//        Bundle bundle = getIntent().getExtras();
//        if (bundle != null) {
//            sessionUser = bundle.getString("username");
//        }

        Intent intent = this.getIntent();
        sessionUser = intent.getStringExtra("username");

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = null;

        switch (item.getItemId()) {
            case R.id.home:
                onBackPressed();
                break;
            case R.id.about:
                intent = new Intent(this, AboutActivity.class);
                startActivity(intent);
                break;
            case R.id.help:
                intent = new Intent(this, HelpActivity.class);
                startActivity(intent);
                break;

            case R.id.exit:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Are you sure want to exit?");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast toastLogin = Toast.makeText(MainActivity.this, "    Thank you " + sessionUser + ", Have a good day!", Toast.LENGTH_SHORT);
                        toastLogin.setGravity(Gravity.CENTER, 0, 0);
                        toastLogin.show();

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                finish(); // Untuk dispose dan hilang dari display selamanya
                            }
                        }, 3000);

                        finish();
                    }
                });

                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });

                AlertDialog quit = builder.create();
                quit.show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    public void setSessionUser(String username) {
        this.sessionUser = username;
    }

    public void openEmpInfo(View view) {
        Intent intent = new Intent(this, EmployeeInformationActivity.class);
        startActivity(intent);
    }

    public void openAttendance(View view) {
        Intent intent = new Intent(this, AttendanceActivity.class);
        startActivity(intent);
    }

    public void openLeave(View view) {
        Intent intent = new Intent(this, LeaveActivity.class);
        startActivity(intent);
    }

    public void openPayroll(View view) {
        Intent intent = new Intent(this, PayrollActivity.class);
        startActivity(intent);
    }
}
