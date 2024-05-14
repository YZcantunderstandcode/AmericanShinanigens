package com.sp.americanshinanigens;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class main extends AppCompatActivity {
    private EditText userinput;
    private RadioGroup conversion;
    private Button calc;
    private TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userinput = findViewById(R.id.input);
        conversion = findViewById(R.id.convert);
        calc = findViewById(R.id.Calculate);
        Result = findViewById(R.id.result);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = userinput.getText().toString();
                int RadioID = conversion.getCheckedRadioButtonId();
                double Userinput = Double.parseDouble(input);

                if (RadioID == R.id.km){
                    double res = (Userinput)/1.609;
                    String formatted = String.format("%.2f", res);
                    Result.setText(formatted);
                }else if (RadioID == R.id.miles){
                    double res = (Userinput)*1.609;
                    String formatted = String.format("%.2f", res);
                    Result.setText(formatted);
                }
            }
        });
    }
}