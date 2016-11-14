package in.co.viditkothari.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Information extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Formatted text for legible text
        String tempStr = "<p>1<sup>st</sup> version (v1.0) of my Music Player Android Application will be a minimalistic moody local music player which will play music with related mood / characteristic and then in next release I’ll implement Spotify streaming of music combined with mood-based sorting.</p><p>For 1<sup>st</sup> version I’ll use Android’s MediaPlayer class to create an object with static <em><strong>create()</strong></em> constructor which takes name of the song as the second parameter like for. E.g.: <em><strong>MediaPlayer mp = new MediaPlayer.create(this,R.mediaFiles.song)</strong></em>. To use the MediaPlayer class, I’ll <em><strong>import android.media.MediaPlayer;</strong></em> Here <em><strong>mediaFiles</strong></em> is the name of a new folder under res directory/folder which will store the song with the name 'song'. Object <em><strong>‘mp’</strong></em> can then be used with <em><strong>start()</strong></em> or <em><strong>stop()</strong></em> to do the corresponding actions. Other methods like <em><strong>isPlaying()</strong></em> can be used to check status whether a song is being played, <em><strong>seekTo()</strong></em> takes ‘position’ as an input to move the cursor to that time/moment in the song.</p><p>For 2<sup>nd</sup> release, I’ll add Spotify library using Spotify SDK for Android and Web API: Info URL: <em>https://developer.spotify.com/technologies/spotify-android-sdk/ & https://developer.spotify.com/technologies/spotify-android-sdk/tutorial/</em> . Must use two Spotify Libraries: Authentication Library and Player Library (seemingly Web API).</p><p>For authentication I must create <em><strong>AuthenticationRequest.Builder</strong></em> object, then request a <em><strong>build()</strong></em> and <em><strong>openLoginActivity()</strong></em>. During Authentication, we extract the OAuth access token provided to us by the callback, and pass it to a Config object that will be used to create the player. After all the authentication, we get <em><strong>onActivityResult</strong></em> callback using which, I should configure the player and few other check methods like <em><strong>onPlayError()</strong></em> to play. Also, apart from this code, I’ll have to add two lines of activity definition code to <em><strong>AndroidManifest.xml</strong></em></p><p>The flow of activities implemented here is the expected flow</p>";
        setContentView(R.layout.activity_information);

        Toast.makeText(this, "Please scroll and click \"Next\" to continue", Toast.LENGTH_SHORT).show();
        ((TextView) findViewById(R.id.infoTextView)).setText(Html.fromHtml(tempStr, 0));

        // Intent code: On clicking 'BtnNext' on Information screen the user will be lead to HomeActivity
        findViewById(R.id.BtnNext).setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity} & start the new activity
                startActivity(new Intent(Information.this, HomeActivity.class));
            }
        });
    }
}

