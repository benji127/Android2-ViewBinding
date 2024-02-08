package com.example.videobinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.videobinding.databinding.ActivityMainBinding;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
//        setContentView(R.layout.activity_main);
    }

    public void convertCurrency(View view) {
//        EditText dollarText = findViewById(R.id.dollarText);
//        TextView textView = findViewById(R.id.textView);

        if(!binding.dollarText.getText().toString().equals("")){
            float dollarValue = Float.parseFloat(binding.dollarText.getText().toString());
            float euroValue = dollarValue * .85F;
            binding.textView.setText(String.format(Locale.ENGLISH,"%.2f", euroValue));
        }else binding.textView.setText("No Value!");
    }
}