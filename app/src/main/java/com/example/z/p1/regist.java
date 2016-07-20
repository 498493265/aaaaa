package com.example.z.p1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Z on 2016/7/19.
 */
public class regist extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regist);
        Button button = (Button)this.findViewById(R.id.button3);
        button.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(regist.this, secondactivity.class);
                startActivity(intent);
                regist.this.finish();

            }
        });

    }

}
