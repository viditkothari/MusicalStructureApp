/*************************
 * Copyright (c) 2016. This creation of Vidit Kothari (c) cannot be reproduced or modified or resell without prior written consent
 ************************/

package in.co.viditkothari.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Configuration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuration);
        Toast.makeText(this, "Here you can configure your Player Settings like Shuffle On/Off, Sleep Timer, etc", Toast.LENGTH_SHORT).show();
    }
}
