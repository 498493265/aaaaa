package com.example.z.p1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.example.z.p1.R;
import com.example.z.p1.regist;
import com.example.z.p1.secondactivity;

public class MainActivity extends AppCompatActivity {

    //requestWindowFeature(Window.FEATURE_NO_TITLE);
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)this.findViewById(R.id.button1);
        Button button22 = (Button)this.findViewById(R.id.button2);
        button.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, user.class);
                startActivity(intent);
                MainActivity.this.finish();

            }
        });
        button22.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Intent intent2 = new Intent();
                intent2.setClass(MainActivity.this, regist.class);
                startActivity(intent2);
                MainActivity.this.finish();

            }
        });

    }

}