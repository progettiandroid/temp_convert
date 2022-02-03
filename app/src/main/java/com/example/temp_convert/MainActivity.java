package com.example.temp_convert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    
    EditText edtCelsius;
    TextView tvtempf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        edtCelsius = findViewById(R.id.edtCelsius);
        tvtempf = findViewById(R.id.tvtempf);
    }
    public void convertitemperatura(View view){

        Log.d("converti temperatura","click converti");
        String temperaturaCelsius = edtCelsius.getText().toString();
        Log.d("converti temperatura","temperatura celsius =" +temperaturaCelsius);
        double tempC = Double.parseDouble(temperaturaCelsius);
        double tempF = tempC * 1.8 + 32;
        tvtempf.setText(Double.toString(tempF));
        
        
    }
}