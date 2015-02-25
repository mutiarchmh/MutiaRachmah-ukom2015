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


public class Salam extends ActionBarActivity implements View.OnClickListener{

    private MediaPlayer mediaPlayer;
    private ImageView imgPhai;
    private ImageView imgPgumor;
    private ImageView imgPgunach;
    private ImageView imgPguaben;
    private ImageView imgPvidanke;
    Button button21;
    Button button22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grub_activity);
        {
            button21 = (Button) findViewById(R.id.button21);
            button21.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Intent button21 = new Intent(getApplicationContext(), Salam.class);
                    startActivity(button21);
                    finish();
                }
            });
        }
        {
            button22 = (Button) findViewById(R.id.button22);
            button22.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Intent button22 = new Intent(getApplicationContext(), Salam2.class);
                    startActivity(button22);
                    finish();
                }
            });
        }

        {
            imgPhai = (ImageView) findViewById(R.id.imgPhai);
            imgPhai.setOnClickListener(this);
        }

        {
            imgPgumor = (ImageView) findViewById(R.id.imgPgumor);
            imgPgumor.setOnClickListener(this);
        }
        {
            imgPgunach = (ImageView) findViewById(R.id.imgPgunach);
            imgPgunach.setOnClickListener(this);
        }
        {
            imgPguaben = (ImageView) findViewById(R.id.imgPguaben);
            imgPguaben.setOnClickListener(this);
        }
        {
            imgPvidanke = (ImageView) findViewById(R.id. imgPvidanke);
            imgPvidanke.setOnClickListener(this);
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
            mediaPlayer = MediaPlayer.create(this, R.raw.halo);
        }
        else if (arg == 2){
            mediaPlayer = MediaPlayer.create(this, R.raw.gutmor);
        }
        else if (arg == 3){
            mediaPlayer = MediaPlayer.create(this, R.raw.gutnac);
        }
        else if (arg == 4){
            mediaPlayer = MediaPlayer.create(this, R.raw.gutaben);
        }
        else if (arg == 5){
            mediaPlayer = MediaPlayer.create(this, R.raw.vilentdanke);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_salam, menu);
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
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.imgPhai:
                playSound(1);
                break;
            case R.id.imgPgumor:
                playSound(2);
                break;
            case R.id.imgPgunach:
                playSound(3);
                break;
            case R.id.imgPguaben:
                playSound(4);
                break;
            case R.id.imgPvidanke:
                playSound(5);
                break;
        }
    }
}
