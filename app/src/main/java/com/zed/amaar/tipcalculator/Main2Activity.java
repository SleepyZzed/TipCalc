package com.zed.amaar.tipcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    TextView textView;
    EditText editText;
    double Resultnum;
    double a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Spinner spinner = findViewById(R.id.spinner1);
        editText = findViewById(R.id.editText1);
        textView = findViewById(R.id.txtviewRes);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.numbers, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
        if (!editText.getText().toString().equals("")) {
            String result = editText.getText().toString();
            double num2 = Double.parseDouble(result);
            switch (position) {


                case 1:
                    a = 10;
                    Resultnum = num2 / a;
                    Toast.makeText(this, "You have a tip of:" + Resultnum, Toast.LENGTH_SHORT).show();
                    break;
                case 2:
                    a = 20;
                    Resultnum = num2 / a;
                    Toast.makeText(this, "You have a tip of:" + Resultnum, Toast.LENGTH_SHORT).show();
                    break;
                case 3:
                    a = 30;
                    Resultnum = num2 / a;
                    Toast.makeText(this, "You have a tip of:" + Resultnum, Toast.LENGTH_SHORT).show();
                    break;
            }

            textView.setText("Your Tip is:" + Resultnum);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
