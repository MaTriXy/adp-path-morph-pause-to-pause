package com.alexjlockwood.example.morph;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class UploadingActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_uploading);
    ((Animatable) ((ImageView) findViewById(R.id.icon)).getDrawable()).start();
  }
}
