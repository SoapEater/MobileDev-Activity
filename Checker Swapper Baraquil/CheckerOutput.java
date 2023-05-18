package com.example.checkerswapperbaraquil;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CheckerOutput extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checker_layout);
        /*----------------------------------------------------------------------------------------*/
        //Textview
        TextView outputTV = findViewById(R.id.textViewOutput);
        //Get intent output
        String outputIntent = getIntent().getStringExtra("Output");
        /*----------------------------------------------------------------------------------------*/
        //Display Output
        outputTV.setText(outputIntent);
        /*----------------------------------------------------------------------------------------*/
    }
}
