package com.zed.amaar.tipcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;
    EditText editText;
    double Resultnum;
    double a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radiogroup);
        textView = findViewById(R.id.txtTip);
        editText = findViewById(R.id.Pricetxt);


    }
    public void Act2Send(View v){
        Intent  intent = new Intent(this, Main2Activity.class);
        startActivity(intent);    }
    public void checkbutton(View v)
    {
        int radioid = radioGroup.getCheckedRadioButtonId();
        String tiptotal = "";
        String txtString = editText.getText().toString();
        double num1 = Double.parseDouble(txtString);
       // Toast.makeText(this, "Selected Radio Button:" + radioButton.getText(), Toast.LENGTH_SHORT ).show();


        switch (radioid){
          case R.id.rdntm10:
                a = 10;
                Resultnum = num1/a;
                break;
            case R.id.rdntm20:
                a = 20;
                Resultnum = num1/a;
                break;
            case R.id.rdntm30:
                a = 30;
                Resultnum = num1/a;
                break;
        }
        Toast.makeText(this, "You have a tip of:" + Resultnum, Toast.LENGTH_SHORT ).show();
        textView.setText("Your Tip is:" + Resultnum);
    }
}
