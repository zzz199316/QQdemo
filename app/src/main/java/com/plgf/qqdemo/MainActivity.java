package com.plgf.qqdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private QQinfo viewById;
    private PwdEditText viewById1;
    private TextView viewById2;
    private EasyPickerView epvH;
    private int hour;


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
        viewById2 = (TextView) findViewById(R.id.btn);
        viewById2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "2222", Toast.LENGTH_SHORT).show();
            }
        });

        initHours();

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

    private void initHours() {
        epvH = (EasyPickerView) findViewById(R.id.epv_h);
        final ArrayList<String> hDataList = new ArrayList<>();
        for (int i = 0; i < 24; i++)
            hDataList.add("" + i);

        epvH.setDataList(hDataList);
        epvH.setOnScrollChangedListener(new EasyPickerView.OnScrollChangedListener() {
            @Override
            public void onScrollChanged(int curIndex) {
                hour = Integer.parseInt(hDataList.get(curIndex));
                //tv.setText(hour + "h" + minute + "m");
            }

            @Override
            public void onScrollFinished(int curIndex) {
                hour = Integer.parseInt(hDataList.get(curIndex));
                //tv.setText(hour + "h" + minute + "m");
                Toast.makeText(MainActivity.this, ""+hour, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
