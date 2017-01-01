package com.example.administrator.my1231;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView iv_show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv_show= (ImageView) findViewById(R.id.iv_show);

        iv_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,PicActivity.class);
                intent.putExtra("msg","图片的地址");
                startActivity(intent);
                //更改2
                //更改3
            }
        });
    }
}
