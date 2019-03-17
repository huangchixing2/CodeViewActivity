package com.example.administrator.codeviewactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * 在代码中控制ui界面
 *
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        super.setContentView(layout);
        layout.setOrientation(LinearLayout.VERTICAL);
        //创建一个TextView
        final TextView show = new TextView(this);
        Button bt = new Button(this);
        bt.setText(R.string.ok);
        bt.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
//        setContentView(R.layout.activity_main);
        //向layout容器中添加TextView
        layout.addView(show);
        //向layout 容器中添加按钮
        layout.addView(bt);
        //为按钮绑定一个事件监听器
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show.setText("hello android, " + new java.util.Date());
            }
        });
    }
}
