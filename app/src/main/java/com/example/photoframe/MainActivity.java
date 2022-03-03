package com.example.photoframe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView pic;
    TextView text;
    int currimage=0;
    String[] names = {"King","Virat","Rohit","Dhoni","Yash"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.names);
        text.setText(names[currimage]);
    }
    public void previous(View view)
    {
        text = findViewById(R.id.names);
        String idX = "pic"+currimage;
        int x = this.getResources().getIdentifier(idX,"id",getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);
        currimage= (5+currimage-1)%5;
        String idY = "pic"+currimage;
        int y = this.getResources().getIdentifier(idY,"id",getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);
        text.setText(names[currimage]);
    }
    public void next(View view)
    {
        text = findViewById(R.id.names);
        String idX = "pic"+currimage;
        int x = this.getResources().getIdentifier(idX,"id",getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);
        currimage= (currimage+1)%5;
        String idY = "pic"+currimage;
        int y = this.getResources().getIdentifier(idY,"id",getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);
        text.setText(names[currimage]);
    }
}