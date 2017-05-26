package employee.leave;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.android.wongapps.R;

public class LeaveRequestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leave_request);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Leave Request");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    public void submitRequestLeave(View view){
        String msg = "Your request has been sent!";
        Toast toastLogin = Toast.makeText(this, msg, Toast.LENGTH_SHORT);
        toastLogin.setGravity(Gravity.CENTER, 0, 0);
        toastLogin.show();

        Intent intent = new Intent(this, LeaveActivity.class);
        startActivity(intent);
        finish();
    }
}
