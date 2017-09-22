package com.example.chai.tooradviser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        int id = intent.getIntExtra("Button", 0);

        ImageView myImageView = (ImageView) findViewById(R.id.imageView);
        switch (id) {
            case R.id.button:
                myImageView.setImageResource(R.drawable.img_sightseeingmap_02);
                break;
            case R.id.button3:
                myImageView.setImageResource(R.drawable.map_f);
                break;
            case R.id.button4:
                myImageView.setImageResource(R.drawable.route);
                break;

        }
    }
}
