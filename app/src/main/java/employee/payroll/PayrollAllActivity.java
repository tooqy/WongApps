package employee.payroll;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.example.android.wongapps.R;

public class PayrollAllActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payroll_all);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Payroll");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    public void viewListPayroll(View view) {
        EditText payrollPeriod = (EditText) findViewById(R.id.txtPayrollPeriodAll);

        Intent intent;
        if (payrollPeriod.getText().toString().equals("")) {
            intent = new Intent(this, PayrollAllActivity.class);
            startActivity(intent);
        } else {
            intent = new Intent(this, PayrollActivity.class);
            startActivity(intent);
        }
    }

    public void viewDetailPayroll(View view) {
        Intent intent = new Intent(this, PayrollDetailActivity.class);
        startActivity(intent);
    }
}
