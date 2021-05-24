package sg.edu.rp.c346.id16014507.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView tvModule;
    Button btnModule;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        Intent intentReceived = getIntent();
        String modSelected = intentReceived.getStringExtra("module");

        tvModule = findViewById(R.id.textView);
        if(modSelected.equalsIgnoreCase("C346")) {
            tvModule.setText("\nModule Code: C346" +
                    "\nModule Name: Android Programming" +
                    "\nAcademic Year: 2020" +
                    "\nModule Credit: 4" +
                    "\nVenue: W66M");
        }
        else if(modSelected.equalsIgnoreCase("C349")) {
            tvModule.setText("\nModule Code: C349" +
                    "\nModule Name: iPad Programming" +
                    "\nAcademic Year: 2020" +
                    "\nModule Credit: 4" +
                    "\nVenue: W66M");
        }

        btnModule = findViewById(R.id.button);
        btnModule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}