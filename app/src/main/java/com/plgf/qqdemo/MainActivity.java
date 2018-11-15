package com.plgf.qqdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private QQinfo viewById;
    private PwdEditText viewById1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewById1 = (PwdEditText) findViewById(R.id.paypadinputview);

        viewById1.setOnTextChangeListener(new PwdEditText.OnTextChangeListener() {
            @Override
            public void onTextChange(String pwd) {
                if (pwd.length() == viewById1.getTextLength()){
                    //输入监听
                    Toast.makeText(MainActivity.this,pwd, Toast.LENGTH_SHORT).show();
                }
            }
        });


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
