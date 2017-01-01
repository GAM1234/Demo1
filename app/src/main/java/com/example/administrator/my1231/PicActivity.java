package com.example.administrator.my1231;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class PicActivity extends AppCompatActivity {

    private ImageView iv_pic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic);
        iv_pic= (ImageView) findViewById(R.id.iv_pic);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        String picPath=bundle.getString("msg");
        iv_pic.setImageResource(R.mipmap.ic_launcher);
        Toast.makeText(PicActivity.this,picPath,Toast.LENGTH_SHORT).show();
    }
}
