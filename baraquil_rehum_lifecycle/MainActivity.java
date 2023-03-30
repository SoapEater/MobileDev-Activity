package com.example.baraquil_rehum_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    //--------------------------------------------------------------------------------------------//
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Beep Boop It is CREATED!!", Toast.LENGTH_SHORT).show();
    }
    //--------------------------------------------------------------------------------------------//
    @Override
    protected void onStart()
    {
        super.onStart();
        Toast.makeText(this, "Beep Boop It is STARTED!!", Toast.LENGTH_SHORT).show();
    }
    //--------------------------------------------------------------------------------------------//
    @Override
    protected void onResume()
    {
        super.onResume();
        Toast.makeText(this, "Beep Boop It is RESUMED!!", Toast.LENGTH_SHORT).show();
    }
    //--------------------------------------------------------------------------------------------//
    @Override
    protected void onPause()
    {
        super.onPause();
        Toast.makeText(this, "Beep Boop It is PAUSED!!", Toast.LENGTH_SHORT).show();
    }
    //--------------------------------------------------------------------------------------------//
    @Override
    protected void onStop()
    {
        super.onStop();
        Toast.makeText(this, "Beep Boop It is STOPPED!!", Toast.LENGTH_SHORT).show();
    }
    //--------------------------------------------------------------------------------------------//
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(this, "Beep Boop It is DESTROYED!!", Toast.LENGTH_SHORT).show();
    }
    //--------------------------------------------------------------------------------------------//
    @Override
    protected void onRestart()
    {
        super.onRestart();
        Toast.makeText(this, "Beep Boop It is RESTARTED!!", Toast.LENGTH_SHORT).show();
    }
    //--------------------------------------------------------------------------------------------//
}
