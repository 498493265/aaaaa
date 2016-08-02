package com.example.z.p1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Z on 2016/7/16.
 */
public class secondactivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);
        Button button = (Button)this.findViewById(R.id.button4);
        button.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(secondactivity.this,MainActivity.class);
                startActivity(intent);
                secondactivity.this.finish();

            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        switch (item.getItemId()) {
            case R.id.menu_about:
                Toast.makeText(secondactivity.this, "" + "关于", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_settings:
                Toast.makeText(secondactivity.this, "" + "设置", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_quit:
                        Intent intent = new Intent();
                        intent.setClass(secondactivity.this, MainActivity.class);
                        startActivity(intent);
                        secondactivity.this.finish();
              //  Toast.makeText(secondactivity.this, "" + "退出", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}