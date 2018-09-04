package com.cadeam.appvlad1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class pumaActivity extends AppCompatActivity {

    private TextView count;
    private ImageView clkPuma2;
    private int clickCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puma);

        //to attribute value to the instances:
        this.count = findViewById(R.id.txtCount);
        this.clkPuma2 = findViewById(R.id.imgPuma2);

        //to associate event or listener:
        clkPuma2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickCounter++;
                count.setText("Points: " + clickCounter);            }
        });




    }
}
