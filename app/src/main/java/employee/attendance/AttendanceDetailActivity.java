package employee.attendance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.android.wongapps.R;

public class AttendanceDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Attendance Detail");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    public void sendRequestCorrection(View view) {
        String msg = "Your request has been sent!";
        Toast toastLogin = Toast.makeText(this, msg, Toast.LENGTH_SHORT);
        toastLogin.setGravity(Gravity.CENTER, 0, 0);
        toastLogin.show();

        Intent intent = new Intent(this, AttendanceActivity.class);
        startActivity(intent);
    }
}
