package wollenwirlernen.mutiarchmh.app.wollenwirlernen;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;


public class Zahlen extends ActionBarActivity implements View.OnClickListener{

    private MediaPlayer mediaPlayer;
    private ImageView imgEnol;
    private ImageView imgEins;
    private ImageView imgZwei;
    private ImageView imgDrei;
    private ImageView imgVier;
    private ImageView imgFunf;
    private ImageView imgSechs;
    private ImageView imgSieben;
    private ImageView imgAcht;
    private ImageView imgNeun;
    private ImageView imgZahn;
    private ImageView imgElf;
    private ImageView imgZwolf;
    private ImageView imgDZ;
    private ImageView imgVZ;
    private ImageView imgFZ;
    private ImageView imgSZ;
    private ImageView imgSB;
    private ImageView imgAZ;
    private ImageView imgneunz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zahlen_activity);
        {
            imgEnol = (ImageView) findViewById(R.id.imgEnol);
            imgEnol.setOnClickListener(this);
        }

        {
            imgEins = (ImageView) findViewById(R.id.imgEins);
            imgEins.setOnClickListener(this);
        }
        {
            imgZwei = (ImageView) findViewById(R.id.imgZwei);
            imgZwei.setOnClickListener(this);
        }
        {
            imgDrei = (ImageView) findViewById(R.id.imgDrei);
            imgDrei.setOnClickListener(this);
        }
        {
            imgVier = (ImageView) findViewById(R.id.imgVier);
            imgVier.setOnClickListener(this);
        }
        {
            imgFunf = (ImageView) findViewById(R.id.imgFunf);
            imgFunf.setOnClickListener(this);
        }
        {
            imgSechs = (ImageView) findViewById(R.id.imgSechs);
            imgSechs.setOnClickListener(this);
        }
        {
            imgSieben = (ImageView) findViewById(R.id.imgSieben);
            imgSieben.setOnClickListener(this);
        }
        {
            imgAcht = (ImageView) findViewById(R.id.imgAcht);
            imgAcht.setOnClickListener(this);
        }
        {
            imgNeun = (ImageView) findViewById(R.id.imgNeun);
            imgNeun.setOnClickListener(this);
        }
        {
            imgZahn = (ImageView) findViewById(R.id.imgZahn);
            imgZahn.setOnClickListener(this);
        }
        {
            imgElf = (ImageView) findViewById(R.id.imgElf);
            imgElf.setOnClickListener(this);
        }
        {
            imgZwolf = (ImageView) findViewById(R.id.imgZwolf);
            imgZwolf.setOnClickListener(this);
        }
        {
            imgDZ = (ImageView) findViewById(R.id.imgDZ);
            imgDZ.setOnClickListener(this);
        }
        {
            imgVZ = (ImageView) findViewById(R.id.imgVZ);
            imgVZ.setOnClickListener(this);
        }
        {
            imgFZ = (ImageView) findViewById(R.id.imgFZ);
            imgFZ.setOnClickListener(this);
        }
        {
            imgSZ = (ImageView) findViewById(R.id.imgSZ);
            imgSZ.setOnClickListener(this);
        }
        {
            imgSB = (ImageView) findViewById(R.id.imgSB);
            imgSB.setOnClickListener(this);
        }
        {
            imgAZ = (ImageView) findViewById(R.id.imgAZ);
            imgAZ.setOnClickListener(this);
        }
        {
            imgneunz = (ImageView) findViewById(R.id.imgneunz);
            imgneunz.setOnClickListener(this);
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
            mediaPlayer = MediaPlayer.create(this, R.raw.enol);
        }
        else if (arg == 2){
            mediaPlayer = MediaPlayer.create(this, R.raw.eins);
        }
        else if (arg == 3){
            mediaPlayer = MediaPlayer.create(this, R.raw.zwei);
        }
        else if (arg == 4){
            mediaPlayer = MediaPlayer.create(this, R.raw.drei);
        }
        else if (arg == 5){
            mediaPlayer = MediaPlayer.create(this, R.raw.vier);
        }
        else if (arg == 6){
            mediaPlayer = MediaPlayer.create(this, R.raw.funf);
        }
        else if (arg == 7){
            mediaPlayer = MediaPlayer.create(this, R.raw.sechs);
        }
        else if (arg == 8){
            mediaPlayer = MediaPlayer.create(this, R.raw.sieben);
        }
        else if (arg == 9){
            mediaPlayer = MediaPlayer.create(this, R.raw.acht);
        }
        else if (arg == 10){
            mediaPlayer = MediaPlayer.create(this, R.raw.neun);
        }
        else if (arg == 11){
            mediaPlayer = MediaPlayer.create(this, R.raw.zhen);
        }
        else if (arg == 12){
            mediaPlayer = MediaPlayer.create(this, R.raw.elf);
        }
        else if (arg == 13){
            mediaPlayer = MediaPlayer.create(this, R.raw.dreizhen);
        }
        else if (arg == 14){
            mediaPlayer = MediaPlayer.create(this, R.raw.zwolf);
        }
        else if (arg == 15){
            mediaPlayer = MediaPlayer.create(this, R.raw.vierzhen);
        }
        else if (arg == 16){
            mediaPlayer = MediaPlayer.create(this, R.raw.funfzhen);
        }
        else if (arg == 17){
            mediaPlayer = MediaPlayer.create(this, R.raw.sechzhen);
        }
        else if (arg == 18){
            mediaPlayer = MediaPlayer.create(this, R.raw.siebenzhen);
        }
        else if (arg == 19){
            mediaPlayer = MediaPlayer.create(this, R.raw.achzhen);
        }
        else if (arg == 20){
            mediaPlayer = MediaPlayer.create(this, R.raw.neunzhen);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_zahlen, menu);
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
            case R.id.imgEnol:
                playSound(1);
                break;
            case R.id.imgEins:
                playSound(2);
                break;
            case R.id.imgZwei:
                playSound(3);
                break;
            case R.id.imgDrei:
                playSound(4);
                break;
            case R.id.imgVier:
                playSound(5);
                break;
            case R.id.imgFunf:
                playSound(6);
                break;
            case R.id.imgSechs:
                playSound(7);
                break;
            case R.id.imgSieben:
                playSound(8);
                break;
            case R.id.imgAcht:
                playSound(9);
                break;
            case R.id.imgNeun:
                playSound(10);
                break;
            case R.id.imgZahn:
                playSound(11);
                break;
            case R.id.imgElf:
                playSound(12);
                break;
            case R.id.imgZwolf:
                playSound(13);
                break;
            case R.id.imgDZ:
                playSound(14);
                break;
            case R.id.imgVZ:
                playSound(15);
                break;
            case R.id.imgFZ:
                playSound(16);
                break;
            case R.id.imgSZ:
                playSound(17);
                break;
            case R.id.imgSB:
                playSound(18);
                break;
            case R.id.imgAZ:
                playSound(19);
                break;
            case R.id.imgneunz:
                playSound(20);
                break;
        }
    }
}
