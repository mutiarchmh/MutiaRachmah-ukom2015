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


public class SpilenII extends ActionBarActivity implements View.OnClickListener{


    private MediaPlayer mediaPlayer;
    private Button button5;
    private Button button6;
    private Button button7;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spilen2_activity);
        {
            button5 = (Button) findViewById(R.id.button5);
            button5.setOnClickListener(this);
            {
                button5 = (Button) findViewById(R.id.button5);

                button5.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent button5 = new Intent(getApplicationContext(), Salah.class);
                        playSound(1);
                        startActivity(button5);
                        finish();
                    }
                });
            }
        }

        {
            button6 = (Button) findViewById(R.id.button6);
            button6.setOnClickListener(this);
            {
                button6 = (Button) findViewById(R.id.button6);

                button6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent button6 = new Intent(getApplicationContext(), Salah.class);
                        playSound(2);
                        startActivity(button6);
                        finish();
                    }
                });
            }
        }

        {
            button7 = (Button) findViewById(R.id.button7);
            button7.setOnClickListener(this);
            {
                button7 = (Button) findViewById(R.id.button7);

                button7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent button7 = new Intent(getApplicationContext(), SpilenIII.class);
                        playSound(3);
                        startActivity(button7);
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
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        }
        if(arg == 2)
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        }
        if(arg == 3)
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.ping);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_spilen_ii, menu);
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
            case R.id.button5:
                playSound(1);
                break;
            case R.id.button6:
                playSound(2);
                break;
            case R.id.button7:
                playSound(3);
                break;
        }
    }
}
