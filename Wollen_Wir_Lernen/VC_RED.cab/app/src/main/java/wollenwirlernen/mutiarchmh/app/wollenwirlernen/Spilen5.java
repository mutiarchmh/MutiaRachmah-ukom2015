package wollenwirlernen.mutiarchmh.app.wollenwirlernen;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class Spilen5 extends ActionBarActivity implements View.OnClickListener{

    private MediaPlayer mediaPlayer;
    private ImageView btnPlay;
    private Button btn54;
    private Button btn53;
    private Button btn52;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spilen5_activity);
        {
            btnPlay = (ImageView) findViewById(R.id.btnPlay);
            btnPlay.setOnClickListener(this);
        }

        {
            btn54 = (Button) findViewById(R.id.button25);
            btn54.setOnClickListener(this);
            {
                btn54 = (Button) findViewById(R.id.button25);

                btn54.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent btn54 = new Intent(getApplicationContext(), Salah.class);
                        playSound(2);
                        startActivity(btn54);
                        finish();
                    }
                });
            }
        }

        {
            btn53 = (Button) findViewById(R.id.button26);
            btn53.setOnClickListener(this);
            {
                btn53 = (Button) findViewById(R.id.button26);

                btn53.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent btn53 = new Intent(getApplicationContext(), Finish.class);
                        playSound(3);
                        startActivity(btn53);
                        finish();
                    }
                });
            }
        }

        {
            btn52 = (Button) findViewById(R.id.button27);
            btn52.setOnClickListener(this);
            {
                btn52 = (Button) findViewById(R.id.button27);

                btn52.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent btn52 = new Intent(getApplicationContext(), Salah.class);
                        playSound(4);
                        startActivity(btn52);
                        finish();
                    }
                });
            }
        }
    }


    public void OnPause(){
        try{
            super.onPause();
            mediaPlayer.pause();
        }catch(Exception e){

        }
    }

    private void playSound(int arg){
        try{
            if(mediaPlayer.isPlaying()){
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        }catch (Exception e){
            Log.e("erro", "blablabla");
        }

        if(arg == 1)
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.sepatu);
        }
        if(arg == 2)
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        }
        if(arg == 3)
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.yey);
        }
        if(arg == 4)
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_spilen5, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btnPlay:
                playSound(1);
                break;
            case R.id.button25:
                playSound(2);
                break;
            case R.id.button26:
                playSound(3);
                break;
            case R.id.button27:
                playSound(4);
                break;
        }
    }
}
