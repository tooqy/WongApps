package employee.leave;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.android.wongapps.R;

public class LeaveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leave);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Leave");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }


    public void makeLeaveRequest(View view) {
        Intent intent = new Intent(this, LeaveRequestActivity.class);
        startActivity(intent);
    }

    public void viewApprovalLeave(View view) {
        Intent intent = new Intent(this, LeaveApprovalActivity.class);
        startActivity(intent);
    }

    public void viewRejectedLeave(View view) {
        Intent intent = new Intent(this, LeaveApprovalRejectedActivity.class);
        startActivity(intent);
    }

    public void viewApprovedLeave(View view) {
        Intent intent = new Intent(this, LeaveApprovalApprovedActivity.class);
        startActivity(intent);
    }
}
