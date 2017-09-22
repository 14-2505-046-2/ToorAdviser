package com.example.chai.tooradviser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("Button", view.getId());
        startActivity(intent);
    }
    public void onSearchButtonClicked(View view) {
        Intent intent = new Intent(this, SearchTourActivity.class);
        startActivity(intent);
    }
}
