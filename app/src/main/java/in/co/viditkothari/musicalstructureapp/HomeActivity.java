/*************************
 * Copyright (c) 2016. This creation of Vidit Kothari (c) cannot be reproduced or modified or resell without prior written consent
 ************************/

package in.co.viditkothari.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toast.makeText(this, "Click on any button reflecting your mood/feeling", Toast.LENGTH_SHORT).show();
        findViewById(R.id.btnHappy).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, Player.class));
            }
        });

        findViewById(R.id.btnLoving).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, Player.class));
            }
        });

        findViewById(R.id.btnSad).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, Player.class));
            }
        });

        findViewById(R.id.btnAngry).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, Player.class));
            }
        });
    }
}
