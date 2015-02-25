package wollenwirlernen.mutiarchmh.app.wollenwirlernen;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class DasEssen extends ActionBarActivity implements View.OnClickListener{

    private MediaPlayer mediaPlayer;
    private ImageView btnPreis;
    private ImageView btnPfish;
    private ImageView btnPkar;
    private ImageView imgPkeju;
    private ImageView imgPbrot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_das_essen);

        {
            btnPreis = (ImageView) findViewById(R.id.btnPreis);
            btnPreis.setOnClickListener(this);
        }

        {
            btnPfish = (ImageView) findViewById(R.id.btnPfish);
            btnPfish.setOnClickListener(this);
        }
        {
            btnPkar = (ImageView) findViewById(R.id.btnPkar);
            btnPkar.setOnClickListener(this);
        }
        {
            imgPkeju = (ImageView) findViewById(R.id.imgPcase);
            imgPkeju.setOnClickListener(this);
        }
        {
            imgPbrot = (ImageView) findViewById(R.id.imgPbrot);
            imgPbrot.setOnClickListener(this);
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
            mediaPlayer = MediaPlayer.create(this, R.raw.reis);
        }
        else if (arg == 2){
            mediaPlayer = MediaPlayer.create(this, R.raw.fish);
        }
        else if (arg == 3){
            mediaPlayer = MediaPlayer.create(this, R.raw.kartofel);
        }
        else if (arg == 4){
            mediaPlayer = MediaPlayer.create(this, R.raw.kejuuu);
        }
        else if (arg == 5){
            mediaPlayer = MediaPlayer.create(this, R.raw.brot);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_das_essen, menu);
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
            case R.id.btnPreis:
                playSound(1);
                break;
            case R.id.btnPfish:
                playSound(2);
                break;
            case R.id.btnPkar:
                playSound(3);
                break;
            case R.id.imgPcase:
                playSound(4);
                break;
            case R.id.imgPbrot:
                playSound(5);
                break;
        }
    }
}
