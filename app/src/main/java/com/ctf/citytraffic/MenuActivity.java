package com.ctf.citytraffic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void menuHitung(View view){
        Intent intent=new Intent(MenuActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void menuTentang(View view){
        Intent intent=new Intent(this,TentangActivity.class); //dari activity ini ke activity
        startActivity(intent);

    }
}


