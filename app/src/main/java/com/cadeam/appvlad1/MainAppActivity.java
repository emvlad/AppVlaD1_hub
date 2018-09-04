package com.cadeam.appvlad1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

//To build and set activities
public class MainAppActivity extends AppCompatActivity {

    //instance for the control on appXML_object
    private ImageView play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_app);

        //my code:
        // to attribute a value to the instance:
        this.play = findViewById(R.id.imgPlay);

        // to set a listener to the instance:
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // to release the new second page activity
                Intent otherAct = new Intent(getApplicationContext(),pumaActivity.class);
                startActivity(otherAct);
                // and to end the first old one page:
                finish();

            }
        });
    }
}
