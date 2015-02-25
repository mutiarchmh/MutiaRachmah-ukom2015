package wollenwirlernen.mutiarchmh.app.wollenwirlernen;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class Kleidung extends ActionBarActivity implements View.OnClickListener{

    private MediaPlayer mediaPlayer;
    private ImageView imgProck;
    private ImageView imgPhemd;
    private ImageView imgPpull;
    private ImageView imgPkleid;
    private ImageView imgPschuhe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kleidung_activity);
        {
            imgProck = (ImageView) findViewById(R.id.imgProck);
            imgProck.setOnClickListener(this);
        }
        {
            imgPhemd = (ImageView) findViewById(R.id.imgPhemd);
            imgPhemd.setOnClickListener(this);
        }
        {
            imgPpull = (ImageView) findViewById(R.id.imgPpull);
            imgPpull.setOnClickListener(this);
        }
        {
            imgPkleid = (ImageView) findViewById(R.id.imgPkleid);
            imgPkleid.setOnClickListener(this);
        }
        {
            imgPschuhe = (ImageView) findViewById(R.id.imgPschuhe);
            imgPschuhe.setOnClickListener(this);
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
        else if (arg == 2){
            mediaPlayer = MediaPlayer.create(this, R.raw.hemd);
        }
        else if (arg == 3){
            mediaPlayer = MediaPlayer.create(this, R.raw.peluver);
        }
        else if (arg == 4){
            mediaPlayer = MediaPlayer.create(this, R.raw.gaun);
        }
        else if (arg == 5){
            mediaPlayer = MediaPlayer.create(this, R.raw.schuhe);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_kleidung, menu);
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
            case R.id.imgProck:
                playSound(1);
                break;
            case R.id.imgPhemd:
                playSound(2);
                break;
            case R.id.imgPpull:
                playSound(3);
                break;
            case R.id.imgPkleid:
                playSound(4);
                break;
            case R.id.imgPschuhe:
                playSound(5);
                break;
        }
    }
}