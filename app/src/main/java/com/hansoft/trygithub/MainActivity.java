package com.hansoft.trygithub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show(View view)
    {
        Toast.makeText(MainActivity.this,"hello michael",Toast.LENGTH_LONG).show();
        Log.d("aaa", "show: aaabbb");
    }

    public void hide()
    {
        Log.d("aaa", "hide: aaabbb");
    }

    public void hello()
    {
        
    }

    public void hi()
    {
        
    }
}