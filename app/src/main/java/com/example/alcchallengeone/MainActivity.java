package com.example.alcchallengeone;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ReplaceFont.changeDefaultFont(getApplication(), "DEFAULT", "fonts/am.ttf");
    }
    public void OpenAlc(View view) {
        startActivity(new Intent(MainActivity.this, ActivityB.class));
    }
    public void OpenProfile(View view) {
        startActivity(new Intent(MainActivity.this, ActivityC.class));
    }

}
