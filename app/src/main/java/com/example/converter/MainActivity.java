package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText editText;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView2);
        editText=findViewById(R.id.editTextNumber);

        button.setOnClickListener(new View.OnClickListener(){
    @Override
            public void onClick(View view){
        Toast.makeText(MainActivity.this, "Great!Value Converted Check it Out!", Toast.LENGTH_LONG).show();
        String s=editText.getText().toString();
        int lit=Integer.parseInt(s);
        double formula=(lit/0.7);
        double value=Math.round(formula);
        textView.setText("Your converted value from " +s+" is " + value +" Liters");


    }

        });



    }
}