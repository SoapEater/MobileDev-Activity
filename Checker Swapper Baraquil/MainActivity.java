package com.example.checkerswapperbaraquil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*----------------------------------------------------------------------------------------*/
        //Buttons
        Button checkerBtn = findViewById(R.id.btnCheck);
        Button swapperBtn = findViewById(R.id.btnSwap);
        //TextField
        EditText firstValueET = findViewById(R.id.editTextFirstValue);
        EditText secondValueET = findViewById(R.id.editTextSecondValue);
        /*----------------------------------------------------------------------------------------*/
        //Button Swapper Functions
        swapperBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String getFirstValue = firstValueET.getText().toString();
                String getSecondValue = secondValueET.getText().toString();

                firstValueET.setText(getSecondValue);
                secondValueET.setText(getFirstValue);

                Toast.makeText(MainActivity.this, "ROOM...SHAMBLES!!", Toast.LENGTH_LONG).show();
            }
        });
        /*----------------------------------------------------------------------------------------*/
        //Button Check Function
        checkerBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //Intent na pumatay XD
                Intent intent = new Intent(MainActivity.this, CheckerOutput.class);

                String getFirstValue = firstValueET.getText().toString();
                String getSecondValue = secondValueET.getText().toString();

                Toast.makeText(MainActivity.this, "CHECKING...", Toast.LENGTH_SHORT).show();
                if (getFirstValue.equals(getSecondValue))
                {
                    intent.putExtra("Output", "They are exactly the same word/value");
                }
                else if(getFirstValue.equalsIgnoreCase(getSecondValue))
                {
                    intent.putExtra("Output", "Same word but not exactly");
                }
                else
                {
                    intent.putExtra("Output", "They are not the same word/value");
                }
                startActivity(intent);
            }
        });
        /*----------------------------------------------------------------------------------------*/
    }
}