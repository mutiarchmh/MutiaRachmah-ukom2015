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


public class Jahreszeit extends ActionBarActivity implements View.OnClickListener{

    private MediaPlayer mediaPlayer;
    private ImageView imageView;
    private ImageView imageView6;
    private ImageView imageView7;
    private ImageView imageView8;
    private ImageView imageView9;
    Button button15;
    Button button16;
    Button button17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jahreszeit);
        {
           button15 = (Button) findViewById(R.id.button15);
           button15.setOnClickListener(new View.OnClickListener()
           {
                @Override
                public void onClick(View v)
                {
                Intent button15 = new Intent(getApplicationContext(), Jahreszeit.class);
                startActivity(button15);
                    finish();
                }
           });
        }
        {
            button16 = (Button) findViewById(R.id.button16);
            button16.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Intent button16 = new Intent(getApplicationContext(), Jahreszeit2.class);
                    startActivity(button16);
                    finish();
                }
            });
        }
        {
            button17 = (Button) findViewById(R.id.button17);
            button17.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Intent button17 = new Intent(getApplicationContext(), Jahreszeit3.class);
                    startActivity(button17);
                    finish();
                }
            });
        }

        {
            imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setOnClickListener(this);
        }
        {
            imageView6 = (ImageView) findViewById(R.id.imageView6);
            imageView6.setOnClickListener(this);
        }
        {
            imageView7 = (ImageView) findViewById(R.id.imageView7);
            imageView7.setOnClickListener(this);
        }
        {
            imageView8 = (ImageView) findViewById(R.id.imageView8);
            imageView8.setOnClickListener(this);
        }
        {
            imageView9 = (ImageView) findViewById(R.id.imageView9);
            imageView9.setOnClickListener(this);
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
            mediaPlayer = MediaPlayer.create(this, R.raw.januar);
        }
        else if (arg == 2){
            mediaPlayer = MediaPlayer.create(this, R.raw.februar);
        }
        else if (arg == 3){
            mediaPlayer = MediaPlayer.create(this, R.raw.marz);
        }
        else if (arg == 4){
            mediaPlayer = MediaPlayer.create(this, R.raw.april);
        }
        else if (arg == 5){
            mediaPlayer = MediaPlayer.create(this, R.raw.mei);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_jahreszeit, menu);
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
        switch (v.getId()) {
            case R.id.imageView:
                playSound(1);
                break;
            case R.id.imageView6:
                playSound(2);
                break;
            case R.id.imageView7:
                playSound(3);
                break;
            case R.id.imageView8:
                playSound(4);
                break;
            case R.id.imageView9:
                playSound(5);
                break;
        }
    }
}
