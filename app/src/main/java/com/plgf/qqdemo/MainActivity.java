package com.plgf.qqdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {


    private QQinfo viewById;
    private PayPsdInputView viewById1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewById1 = (PayPsdInputView) findViewById(R.id.paypadinputview);


    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
    //   viewById.setIsCanDrag(event);

        return super.onTouchEvent(event);

    }
}
