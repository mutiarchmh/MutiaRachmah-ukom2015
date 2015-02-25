package wollenwirlernen.mutiarchmh.app.wollenwirlernen;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class Ferbe extends ActionBarActivity implements View.OnClickListener{

    private MediaPlayer mediaPlayer;
    private ImageView btnProt;
    private ImageView btnPblau;
    private ImageView btnPgrun;
    private ImageView btnPviolett;
    private ImageView btnPgrau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ferbe);
        {
            btnProt = (ImageView) findViewById(R.id.btnProt);
            btnProt.setOnClickListener(this);
        }

        {
            btnPblau = (ImageView) findViewById(R.id.btnPblau);
            btnPblau.setOnClickListener(this);
        }
        {
            btnPgrun = (ImageView) findViewById(R.id.btnPgrun);
            btnPgrun.setOnClickListener(this);
        }
        {
            btnPviolett = (ImageView) findViewById(R.id.imgPvio);
            btnPviolett.setOnClickListener(this);
        }
        {
            btnPgrau = (ImageView) findViewById(R.id.imgPgrau);
            btnPgrau.setOnClickListener(this);
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
            mediaPlayer = MediaPlayer.create(this, R.raw.rot);
        }
        else if (arg == 2){
            mediaPlayer = MediaPlayer.create(this, R.raw.blau);
        }
        else if (arg == 3){
            mediaPlayer = MediaPlayer.create(this, R.raw.grun);
        }
        else if (arg == 4){
            mediaPlayer = MediaPlayer.create(this, R.raw.violet);
        }
        else if (arg == 5){
            mediaPlayer = MediaPlayer.create(this, R.raw.grau);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ferbe, menu);
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
            case R.id.btnProt:
                playSound(1);
                break;
            case R.id.btnPblau:
                playSound(2);
                break;
            case R.id.btnPgrun:
                playSound(3);
                break;
            case R.id.imgPvio:
                playSound(4);
                break;
            case R.id.imgPgrau:
                playSound(5);
                break;
        }
    }
}
