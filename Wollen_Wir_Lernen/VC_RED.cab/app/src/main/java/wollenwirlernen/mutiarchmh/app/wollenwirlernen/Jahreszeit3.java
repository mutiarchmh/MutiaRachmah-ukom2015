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


public class Jahreszeit3 extends ActionBarActivity implements View.OnClickListener{

    private MediaPlayer mediaPlayer;
    private ImageView imgPnov;
    private ImageView imgPdes;
    private ImageView imgPsom;
    private ImageView imgPher;
    private ImageView imgPfur;
    Button button18;
    Button button19;
    Button button20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jahreszeit3);
        {
            button18 = (Button) findViewById(R.id.button18);
            button18.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Intent button18 = new Intent(getApplicationContext(), Jahreszeit.class);
                    startActivity(button18);
                    finish();
                }
            });
        }
        {
            button19 = (Button) findViewById(R.id.button19);
            button19.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Intent button19 = new Intent(getApplicationContext(), Jahreszeit2.class);
                    startActivity(button19);
                    finish();
                }
            });
        }
        {
            button20 = (Button) findViewById(R.id.button20);
            button20.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Intent button20 = new Intent(getApplicationContext(), Jahreszeit3.class);
                    startActivity(button20);
                    finish();
                }
            });
        }

        {
            imgPnov = (ImageView) findViewById(R.id.imgPnov);
            imgPnov.setOnClickListener(this);
        }
        {
            imgPdes = (ImageView) findViewById(R.id.imgPdes);
            imgPdes.setOnClickListener(this);
        }
        {
            imgPsom = (ImageView) findViewById(R.id.imgPsom);
            imgPsom.setOnClickListener(this);
        }
        {
            imgPher = (ImageView) findViewById(R.id.imgPher);
            imgPher.setOnClickListener(this);
        }
        {
            imgPfur = (ImageView) findViewById(R.id.imgPfur);
            imgPfur.setOnClickListener(this);
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
            mediaPlayer = MediaPlayer.create(this, R.raw.november);
        }
        else if (arg == 2){
            mediaPlayer = MediaPlayer.create(this, R.raw.desember);
        }
        else if (arg == 3){
            mediaPlayer = MediaPlayer.create(this, R.raw.summer);
        }
        else if (arg == 4){
            mediaPlayer = MediaPlayer.create(this, R.raw.hearbst);
        }
        else if (arg == 5){
            mediaPlayer = MediaPlayer.create(this, R.raw.furling);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_jahreszeit3, menu);
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
            case R.id.imgPnov:
                playSound(1);
                break;
            case R.id.imgPdes:
                playSound(2);
                break;
            case R.id.imgPsom:
                playSound(3);
                break;
            case R.id.imgPher:
                playSound(4);
                break;
            case R.id.imgPfur:
                playSound(5);
                break;
        }
    }
}
