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


public class Spilen extends ActionBarActivity implements View.OnClickListener{

    private MediaPlayer mediaPlayer;
    private Button btnK;
    private Button btnG;
    private Button btnS;
    private Button btnB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spilen_activity);
        {
            btnK = (Button) findViewById(R.id.btnK);
            btnK.setOnClickListener(this);
            {
                    btnK = (Button) findViewById(R.id.btnK);

                    btnK.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View v)
                        {
                            Intent btnK = new Intent(getApplicationContext(), Salah.class);
                            playSound(1);
                            startActivity(btnK);
                            finish();
                        }
                    });
            }
        }

        {
            btnG = (Button) findViewById(R.id.btnG);
            btnG.setOnClickListener(this);
            {
                btnG = (Button) findViewById(R.id.btnG);

                btnG.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent btnG = new Intent(getApplicationContext(), SpilenII.class);
                        playSound(2);
                        startActivity(btnG);
                        finish();
                    }
                });
            }
        }

        {
            btnS = (Button) findViewById(R.id.btnS);
            btnS.setOnClickListener(this);
            {
                btnS = (Button) findViewById(R.id.btnS);

                btnS.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent btnS = new Intent(getApplicationContext(), Salah.class);
                        playSound(3);
                        startActivity(btnS);
                        finish();
                    }
                });
            }
        }

        {
            btnB = (Button) findViewById(R.id.btnB);
            btnB.setOnClickListener(this);
            {
                btnB = (Button) findViewById(R.id.btnB);

                btnB.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent btnB = new Intent(getApplicationContext(), Salah.class);
                        playSound(4);
                        startActivity(btnB);
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
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        }
        if(arg == 2)
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.ping);
        }
        if(arg == 3)
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        }
        if(arg == 4)
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_spilen, menu);
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
            case R.id.btnK:
                playSound(1);
                break;
            case R.id.btnG:
                playSound(2);
                break;
            case R.id.btnS:
                playSound(3);
                break;
            case R.id.btnB:
                playSound(4);
                break;
        }
    }
}
