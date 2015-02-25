package wollenwirlernen.mutiarchmh.app.wollenwirlernen;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class Familie extends ActionBarActivity implements View.OnClickListener{

    private MediaPlayer mediaPlayer;
    private ImageView imgPmutter;
    private ImageView imgPvatter;
    private ImageView imgPgrobM;
    private ImageView imgPgrobV;
    private ImageView imgPtante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.familie_activity);
        {
            imgPmutter = (ImageView) findViewById(R.id.imgPmutter);
            imgPmutter.setOnClickListener(this);
        }

        {
            imgPvatter = (ImageView) findViewById(R.id.imgPvatter);
            imgPvatter.setOnClickListener(this);
        }
        {
            imgPgrobM = (ImageView) findViewById(R.id.imgPgrobM);
            imgPgrobM.setOnClickListener(this);
        }
        {
            imgPgrobV = (ImageView) findViewById(R.id.imgPgrobV);
            imgPgrobV.setOnClickListener(this);
        }
        {

            imgPtante = (ImageView) findViewById(R.id.imgPtante);
            imgPtante.setOnClickListener(this);
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
            mediaPlayer = MediaPlayer.create(this, R.raw.mutter);
        }
        else if (arg == 2){
            mediaPlayer = MediaPlayer.create(this, R.raw.vatter);
        }
        else if (arg == 3){
            mediaPlayer = MediaPlayer.create(this, R.raw.grobmutter);
        }
        else if (arg == 4)
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.grobvatter);
        }
        else if (arg == 5){
            mediaPlayer = MediaPlayer.create(this, R.raw.tante);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_familie, menu);
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
            case R.id.imgPmutter:
                playSound(1);
                break;
            case R.id.imgPvatter:
                playSound(2);
                break;
            case R.id.imgPgrobM:
                playSound(3);
                break;
            case R.id.imgPgrobV:
                playSound(4);
                break;
            case R.id.imgPtante:
                playSound(5);
                break;
        }
    }
}
