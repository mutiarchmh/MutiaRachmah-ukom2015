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


public class Spilen4 extends ActionBarActivity implements View.OnClickListener{

    private MediaPlayer mediaPlayer;
    private Button btnKrt;
    private Button btnReis;
    private Button btnbrot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spilen4_activity);
        {
            btnKrt = (Button) findViewById(R.id.btnKrt);
            btnKrt.setOnClickListener(this);
            {
                btnKrt = (Button) findViewById(R.id.btnKrt);

                btnKrt.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent btnKrt = new Intent(getApplicationContext(), Spilen5.class);
                        playSound(1);
                        startActivity(btnKrt);
                        finish();
                    }
                });
            }
        }

        {
            btnReis = (Button) findViewById(R.id.btnReis);
            btnReis.setOnClickListener(this);
            {
                btnReis = (Button) findViewById(R.id.btnReis);

                btnReis.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent btnReis = new Intent(getApplicationContext(), Salah.class);
                        playSound(2);
                        startActivity(btnReis);
                        finish();
                    }
                });
            }
        }

        {
            btnbrot = (Button) findViewById(R.id.btnbrot);
            btnbrot.setOnClickListener(this);
            {
                btnbrot = (Button) findViewById(R.id.btnbrot);

                btnbrot.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent btnbrot = new Intent(getApplicationContext(), Salah.class);
                        playSound(3);
                        startActivity(btnbrot);
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
            mediaPlayer = MediaPlayer.create(this, R.raw.ping);
        }
        if(arg == 2)
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        }
        if(arg == 3)
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_spilen4, menu);
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
            case R.id.btnKrt:
                playSound(1);
                break;
            case R.id.btnReis:
                playSound(2);
                break;
            case R.id.btnbrot:
                playSound(3);
                break;
        }
    }
}
