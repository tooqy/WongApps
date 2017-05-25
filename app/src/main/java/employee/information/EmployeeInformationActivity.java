package employee.information;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.android.wongapps.R;

public class EmployeeInformationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_information);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Employee Information");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    public void seeDetailPersonalData(View view) {
        Intent intent = new Intent(this, DetailPersonalActivity.class);
        startActivity(intent);
    }

    public void seeDetailEmploymentHistory(View view) {
        Intent intent = new Intent(this, DetailEmploymentActivity.class);
        startActivity(intent);
    }

    public void seeDetailTraining(View view) {
        Intent intent = new Intent(this, DetailTrainingActivity.class);
        startActivity(intent);
    }
}
