package net.androidbootcamp.jazzmusic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PlayMusic extends AppCompatActivity {
    int playing;
    private Button button1, button2, button3, button4;
    private MediaPlayer mpArtist1, mpArtist2, mpArtist3, mpArtist4;
    //play song buttons. If the play button is clicked, the assigned audio clip will play and if
    // there is currently playing audioclip, it will pause.
    Button.OnClickListener bArtist1 = new Button.OnClickListener() {

        @Override
        public void onClick(View v) {
            if (mpArtist2.isPlaying() || mpArtist3.isPlaying() || mpArtist4.isPlaying()) {
                stopPlayers();
            }
            switch (playing) {
                case 0:
                    mpArtist1.start();
                    Toast.makeText(PlayMusic.this, "NOW PLAYING: Caution Blues (Blues in thirds) " +
                            "by Earl \"Fatha\" Hines", Toast.LENGTH_LONG).show();
                    playing = 1;
                    button1.setText("Pause Song");
                    //button2.setVisibility(View.INVISIBLE);
                    //button3.setVisibility(View.INVISIBLE);
                    //button4.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mpArtist1.pause();
                    playing = 0;
                    button1.setText("Play Song");
                    //button2.setVisibility(View.VISIBLE);
                    //button3.setVisibility(View.VISIBLE);
                    //button4.setVisibility(View.VISIBLE);
                    break;

            }
            //method that will reset the track and play button after song is finished playing.
            mpArtist1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                @Override
                public void onCompletion(MediaPlayer mpArtist1) {
                    mpArtist1.pause();
                    playing = 0;
                    button1.setText("Play Song");
                    //button2.setVisibility(View.VISIBLE);
                    //button3.setVisibility(View.VISIBLE);
                    //button4.setVisibility(View.VISIBLE);
                }
            });

        }
    };
    Button.OnClickListener bArtist2 = new Button.OnClickListener() {

        @Override
        public void onClick(View v) {
            if (mpArtist1.isPlaying() || mpArtist3.isPlaying() || mpArtist4.isPlaying()) {
                stopPlayers();
            }
            switch (playing) {
                case 0:
                    mpArtist2.start();
                    Toast.makeText(PlayMusic.this, "NOW PLAYING: On The Sunny Side Of The Street" +
                            " by Sonny Stitt", Toast.LENGTH_LONG).show();
                    playing = 1;
                    button2.setText("Pause Song");
                    //button1.setVisibility(View.INVISIBLE);
                    //button3.setVisibility(View.INVISIBLE);
                    //button4.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mpArtist2.pause();
                    playing = 0;
                    button2.setText("Play Song");
                    //button1.setVisibility(View.VISIBLE);
                    //button3.setVisibility(View.VISIBLE);
                    //button4.setVisibility(View.VISIBLE);
                    break;
            }
            //method that will reset the track and play button after song is finished playing.
            mpArtist2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                @Override
                public void onCompletion(MediaPlayer mpArtist1) {
                    mpArtist1.pause();
                    playing = 0;
                    button1.setText("Play Song");
                    //button2.setVisibility(View.VISIBLE);
                    //button3.setVisibility(View.VISIBLE);
                    //button4.setVisibility(View.VISIBLE);
                }
            });
        }
    };
    Button.OnClickListener bArtist3 = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (mpArtist1.isPlaying() || mpArtist2.isPlaying() || mpArtist4.isPlaying()) {
                stopPlayers();
            }
            switch (playing) {
                case 0:
                    Toast.makeText(PlayMusic.this, "NOW PLAYING: Watch What Happens by Art " +
                            "Farmer", Toast.LENGTH_LONG).show();
                    mpArtist3.start();
                    playing = 1;
                    button3.setText("Pause Song");
                    //button1.setVisibility(View.INVISIBLE);
                    //button2.setVisibility(View.INVISIBLE);
                    //button4.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mpArtist3.pause();
                    playing = 0;
                    button3.setText("Play Song");
                    //button1.setVisibility(View.VISIBLE);
                    //button2.setVisibility(View.VISIBLE);
                    //button4.setVisibility(View.VISIBLE);
                    break;
            }
            //method that will reset the track and play button after song is finished playing.
            mpArtist3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                @Override
                public void onCompletion(MediaPlayer mpArtist1) {
                    mpArtist1.pause();
                    playing = 0;
                    button1.setText("Play Song");
                    //button2.setVisibility(View.VISIBLE);
                    //button3.setVisibility(View.VISIBLE);
                    //button4.setVisibility(View.VISIBLE);
                }
            });
        }
    };
    Button.OnClickListener bArtist4 = new Button.OnClickListener() {

        @Override
        public void onClick(View v) {
            if (mpArtist1.isPlaying() || mpArtist2.isPlaying() || mpArtist3.isPlaying()) {
                stopPlayers();
            }
            switch (playing) {
                case 0:
                    mpArtist4.start();
                    Toast.makeText(PlayMusic.this, "NOW PLAYING: A Song For My Father by " +
                            "Horace Silver", Toast.LENGTH_LONG).show();
                    playing = 1;
                    button4.setText("Pause Song");
                    //button1.setVisibility(View.INVISIBLE);
                    //button2.setVisibility(View.INVISIBLE);
                    //button3.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mpArtist4.pause();
                    playing = 0;
                    button4.setText("Play Song");
                    //button1.setVisibility(View.VISIBLE);
                    //button2.setVisibility(View.VISIBLE);
                    //button3.setVisibility(View.VISIBLE);
                    break;
            }
            //method that will reset the track and play button after song is finished playing.
            mpArtist4.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                @Override
                public void onCompletion(MediaPlayer mpArtist1) {
                    mpArtist1.pause();
                    playing = 0;
                    button1.setText("Play Song");
                    //button2.setVisibility(View.VISIBLE);
                    //button3.setVisibility(View.VISIBLE);
                    //button4.setVisibility(View.VISIBLE);
                }
            });
        }
    };

    //codes declaration and assignment for the buttons "view bio" and "see the archives"
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_music);

       //View artists bio buttons
        Button btnBio1 = (Button) findViewById(R.id.btnBio1);
        Button btnBio2 = (Button) findViewById(R.id.btnBio2);
        Button btnBio3 = (Button) findViewById(R.id.btnBio3);
        Button btnBio4 = (Button) findViewById(R.id.btnBio4);

        //Visit artists archives at udc felix grant buttons
        Button btnVisitArchive1 = (Button) findViewById(R.id.btnVisitArchive1);
        Button btnVisitArchive2 = (Button) findViewById(R.id.btnVisitArchive2);
        Button btnVisitArchive3 = (Button) findViewById(R.id.btnVisitArchive3);
        Button btnVisitArchive4 = (Button) findViewById(R.id.btnVisitArchive4);

        //media player buttons play and pause
        button1 = (Button) findViewById(R.id.btnPlaySong1);
        button2 = (Button) findViewById(R.id.btnPlaySong2);
        button3 = (Button) findViewById(R.id.btnPlaySong3);
        button4 = (Button) findViewById(R.id.btnPlaySong4);

        button1.setOnClickListener(bArtist1);
        button2.setOnClickListener(bArtist2);
        button3.setOnClickListener(bArtist3);
        button4.setOnClickListener(bArtist4);

        //mediaplayer class that will play audio clips
        mpArtist1 = new MediaPlayer();
        mpArtist1 = MediaPlayer.create(this, R.raw.earlhines_cautionblues);

        mpArtist2 = new MediaPlayer();
        mpArtist2 = MediaPlayer.create(this, R.raw.sonnystitt_onthesunnyside);

        mpArtist3 = new MediaPlayer();
        mpArtist3 = MediaPlayer.create(this, R.raw.artfarmer_watchwhathappens);

        mpArtist4 = new MediaPlayer();
        mpArtist4 = MediaPlayer.create(this, R.raw.horacesilver_songformyfather);

        playing = 0;

        //artists bio buttons
        btnBio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PlayMusic.this, EarlHines.class));
            }
        });
        btnBio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PlayMusic.this, SonnyStitt.class));
            }
        });
        btnBio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PlayMusic.this, ArtFarmer.class));
            }
        });
        btnBio4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PlayMusic.this, HoraceSilver.class));
            }
        });

        //onclick buttons to open browser and go to the jazz archives link
        btnVisitArchive1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://catalog.wrlc.org/" +
                        "cgi-bin/Pwebrecon.cgi?BBID=3909758")));
            }
        });

        btnVisitArchive2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://catalog.wrlc.org" +
                        "/cgi-bin/Pwebrecon.cgi?BBID=3704139")));
            }
        });

        btnVisitArchive3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://catalog.wrlc.org" +
                        "/cgi-bin/Pwebrecon.cgi?BBID=3711846")));
            }
        });

        btnVisitArchive4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://catalog.wrlc.org" +
                        "/cgi-bin/Pwebrecon.cgi?BBID=3726500")));
            }
        });

    }

    // a method that will pause currently playing audio (if there is) and play the audio
    // where the button belongs.
    public void stopPlayers() {

        if (mpArtist1.isPlaying()) {
            mpArtist1.pause();
            button1.setText("Play Song");
            playing = 0;
        }
        if (mpArtist2.isPlaying()) {
            mpArtist2.pause();
            button2.setText("Play Song");
            playing = 0;
        }
        if (mpArtist3.isPlaying()) {
            mpArtist3.pause();
            button3.setText("Play Song");
            playing = 0;
        }
        if (mpArtist4.isPlaying()) {
            mpArtist4.pause();
            button4.setText("Play Song");
            playing = 0;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (mpArtist1.isPlaying()) {
            mpArtist1.stop();
            Toast.makeText(PlayMusic.this, "Caution Blues (Blues in thirds) " +
                    "by Earl \"Fatha\" Hines PLAYBACK STOPPED", Toast.LENGTH_LONG).show();
        }
        if (mpArtist2.isPlaying()) {
            mpArtist2.stop();
            Toast.makeText(PlayMusic.this, "On The Sunny Side Of The Street " +
                    "by Sonny Stitt PLAYBACK STOPPED", Toast.LENGTH_LONG).show();
        }
        if (mpArtist3.isPlaying()) {
            mpArtist3.stop();
            Toast.makeText(PlayMusic.this, "Watch What Happens by Art " +
                    "Farmer PLAYBACK STOPPED", Toast.LENGTH_LONG).show();
        }
        if (mpArtist4.isPlaying()) {
            mpArtist4.stop();
            Toast.makeText(PlayMusic.this, "A Song For My Father by " +
                    "Horace Silver PLAYBACK STOPPED", Toast.LENGTH_LONG).show();
        }

        mpArtist1.stop();
        mpArtist2.stop();
        mpArtist3.stop();
        mpArtist4.stop();
    }
}