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


public class SpilenIII extends ActionBarActivity implements View.OnClickListener{

    private MediaPlayer mediaPlayer;
    private ImageView imageView11;
    private Button button55;
    private Button button66;
    private Button button77;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spileniii_activity);
        {
            imageView11 = (ImageView) findViewById(R.id.imageView11);
            imageView11.setOnClickListener(this);
        }

        {
            button55 = (Button) findViewById(R.id.button55);
            button55.setOnClickListener(this);
            {
                button55 = (Button) findViewById(R.id.button55);

                button55.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent button55 = new Intent(getApplicationContext(), Spilen4.class);
                        playSound(2);
                        startActivity(button55);
                        finish();
                    }
                });
            }
        }

        {
            button66 = (Button) findViewById(R.id.button66);
            button66.setOnClickListener(this);
            {
                button66 = (Button) findViewById(R.id.button66);

                button66.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent button66 = new Intent(getApplicationContext(), Salah.class);
                        playSound(3);
                        startActivity(button66);
                        finish();
                    }
                });
            }
        }

        {
            button77 = (Button) findViewById(R.id.button77);
            button77.setOnClickListener(this);
            {
                button77 = (Button) findViewById(R.id.button77);

                button77.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent button77 = new Intent(getApplicationContext(), Salah.class);
                        playSound(4);
                        startActivity(button77);
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
            mediaPlayer = MediaPlayer.create(this, R.raw.rok);
        }
        if(arg == 2)
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.ping);
        }
        if(arg == 3)
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
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
        getMenuInflater().inflate(R.menu.menu_spilen_iii, menu);
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
            case R.id.imageView11:
                playSound(1);
                break;
            case R.id.button55:
                playSound(2);
                break;
            case R.id.button66:
                playSound(3);
                break;
            case R.id.button77:
                playSound(4);
                break;
        }
    }
}
