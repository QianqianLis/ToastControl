package com.hrgk.toastcontrol;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    private android.widget.Button btn1;
    private android.widget.Button btn2;
    private android.widget.Button btn3;
    private android.widget.Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.btn4 = (Button) findViewById(R.id.btn_4);
        this.btn3 = (Button) findViewById(R.id.btn_3);
        this.btn2 = (Button) findViewById(R.id.btn_2);
        this.btn1 = (Button) findViewById(R.id.btn_1);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_1:
                ToastImpl.showShort(MainActivity.this, "1");
                break;
            case R.id.btn_2:
                ToastImpl.showShort(MainActivity.this, "2");
                break;
            case R.id.btn_3:
                ToastImpl.showShort(MainActivity.this, "3");
                break;
            case R.id.btn_4:
                ToastImpl.showShort(MainActivity.this, "4");
                break;
        }

    }
}
