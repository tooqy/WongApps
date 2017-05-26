package employee.attendance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

import com.example.android.wongapps.R;

public class AttendanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Attendance");

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    public void viewDetailNormal(View view) {
        Intent intent = new Intent(this, AttendanceDetailActivity.class);
        startActivity(intent);
    }
    public void viewDetailLate(View view) {
        Intent intent = new Intent(this, AttendanceDetailActivity.class);
        startActivity(intent);
    }
    public void viewDetailLeave(View view) {
        Intent intent = new Intent(this, AttendanceDetailActivity.class);
        startActivity(intent);
    }
}
