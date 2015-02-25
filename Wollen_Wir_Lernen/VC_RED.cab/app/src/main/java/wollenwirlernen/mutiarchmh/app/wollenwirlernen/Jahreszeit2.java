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


public class Jahreszeit2 extends ActionBarActivity implements View.OnClickListener{

    private MediaPlayer mediaPlayer;
    private ImageView btnPjun;
    private ImageView btnPjul;
    private ImageView btnPaug;
    private ImageView btnPsep;
    private ImageView btnPoc;
    Button button2;
    Button button3;
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jahreszeit2);
        {
            button2 = (Button) findViewById(R.id.button2);
            button2.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Intent button2 = new Intent(getApplicationContext(), Jahreszeit.class);
                    startActivity(button2);
                    finish();
                }
            });
        }
        {
            button3 = (Button) findViewById(R.id.button3);
            button3.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Intent button3 = new Intent(getApplicationContext(), Jahreszeit2.class);
                    startActivity(button3);
                    finish();
                }
            });
        }
        {
            button4 = (Button) findViewById(R.id.button4);
            button4.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Intent button4 = new Intent(getApplicationContext(), Jahreszeit3.class);
                    startActivity(button4);
                    finish();
                }
            });
        }

        {
            btnPjun = (ImageView) findViewById(R.id.btnPjun);
            btnPjun.setOnClickListener(this);
        }
        {
            btnPjul = (ImageView) findViewById(R.id.btnPjul);
            btnPjul.setOnClickListener(this);
        }
        {
            btnPaug = (ImageView) findViewById(R.id.btnPaug);
            btnPaug.setOnClickListener(this);
        }
        {
            btnPsep = (ImageView) findViewById(R.id.btnPsep);
            btnPsep.setOnClickListener(this);
        }
        {
            btnPoc = (ImageView) findViewById(R.id.btnPoc);
            btnPoc.setOnClickListener(this);
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
            mediaPlayer = MediaPlayer.create(this, R.raw.juni);
        }
        else if (arg == 2){
            mediaPlayer = MediaPlayer.create(this, R.raw.juli);
        }
        else if (arg == 3){
            mediaPlayer = MediaPlayer.create(this, R.raw.agustus);
        }
        else if (arg == 4){
            mediaPlayer = MediaPlayer.create(this, R.raw.september);
        }
        else if (arg == 5){
            mediaPlayer = MediaPlayer.create(this, R.raw.october);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_jahreszeit2, menu);
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
            case R.id.btnPjun:
                playSound(1);
                break;
            case R.id.btnPjul:
                playSound(2);
                break;
            case R.id.btnPaug:
                playSound(3);
                break;
            case R.id.btnPsep:
                playSound(4);
                break;
            case R.id.btnPoc:
                playSound(5);
                break;
        }
    }
}
