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


public class Salam2 extends ActionBarActivity implements View.OnClickListener{

    private MediaPlayer mediaPlayer;
    private ImageView imgPauf;
    private ImageView imgPcus;
    private ImageView imgPtag;
    private ImageView imgPnacht;
    private ImageView imgPgarn;
    Button button23;
    Button button24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salam2);
        {
            button23 = (Button) findViewById(R.id.button23);
            button23.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Intent button23 = new Intent(getApplicationContext(), Salam.class);
                    startActivity(button23);
                    finish();
                }
            });
        }
        {
            button24 = (Button) findViewById(R.id.button24);
            button24.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Intent button24 = new Intent(getApplicationContext(), Salam2.class);
                    startActivity(button24);
                    finish();
                }
            });
        }
        {
            imgPauf = (ImageView) findViewById(R.id.imgPauf);
            imgPauf.setOnClickListener(this);
        }

        {
            imgPcus = (ImageView) findViewById(R.id.imgPcus);
            imgPcus.setOnClickListener(this);
        }
        {
            imgPtag = (ImageView) findViewById(R.id.imgPtag);
            imgPtag.setOnClickListener(this);
        }
        {
            imgPnacht = (ImageView) findViewById(R.id.imgPnacht);
            imgPnacht.setOnClickListener(this);
        }
        {
            imgPgarn = (ImageView) findViewById(R.id. imgPgarn);
            imgPgarn.setOnClickListener(this);
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
            mediaPlayer = MediaPlayer.create(this, R.raw.aufwi);
        }
        else if (arg == 2){
            mediaPlayer = MediaPlayer.create(this, R.raw.tcuss);
        }
        else if (arg == 3){
            mediaPlayer = MediaPlayer.create(this, R.raw.guttag);
        }
        else if (arg == 4){
            mediaPlayer = MediaPlayer.create(this, R.raw.gutenac);
        }
        else if (arg == 5){
            mediaPlayer = MediaPlayer.create(this, R.raw.garn);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_salam2, menu);
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
            case R.id.imgPauf:
                playSound(1);
                break;
            case R.id.imgPcus:
                playSound(2);
                break;
            case R.id.imgPtag:
                playSound(3);
                break;
            case R.id.imgPnacht:
                playSound(4);
                break;
            case R.id.imgPgarn:
                playSound(5);
                break;
        }
    }
}
