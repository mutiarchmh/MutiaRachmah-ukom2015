package wollenwirlernen.mutiarchmh.app.wollenwirlernen;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class das_Alphabeth extends ActionBarActivity implements View.OnClickListener{

    private MediaPlayer mediaPlayer;
    private ImageView imgA;
    private ImageView imgAa;
    private ImageView imgB;
    private ImageView imgCh;
    private ImageView imgD;
    private ImageView imgE;
    private ImageView imgG;
    private ImageView imgH;
    private ImageView imgI;
    private ImageView imgK;
    private ImageView imgL;
    private ImageView imgM;
    private ImageView imgO;
    private ImageView imgOo;
    private ImageView imgP;
    private ImageView imgR;
    private ImageView imgS;
    private ImageView imgSch;
    private ImageView imgU;
    private ImageView imgUu;
    private ImageView imgV;
    private ImageView imgX;
    private ImageView imgY;
    private ImageView imgZ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.das_alphabeth_activity);
        {
            imgA = (ImageView) findViewById(R.id.imgA);
            imgA.setOnClickListener(this);
        }
        {
            imgAa = (ImageView) findViewById(R.id.imgAa);
            imgAa.setOnClickListener(this);
        }
        {
            imgB = (ImageView) findViewById(R.id.imgB);
            imgB.setOnClickListener(this);
        }
        {
            imgCh = (ImageView) findViewById(R.id.imgCh);
            imgCh.setOnClickListener(this);
        }
        {
            imgD = (ImageView) findViewById(R.id.imgD);
            imgD.setOnClickListener(this);
        }
        {
            imgE = (ImageView) findViewById(R.id.imgE);
            imgE.setOnClickListener(this);
        }
        {
            imgG = (ImageView) findViewById(R.id.imgG);
            imgG.setOnClickListener(this);
        }
        {
            imgH = (ImageView) findViewById(R.id.imgH);
            imgH.setOnClickListener(this);
        }
        {
            imgI = (ImageView) findViewById(R.id.imgI);
            imgI.setOnClickListener(this);
        }
        {
            imgK = (ImageView) findViewById(R.id.imgK);
            imgK.setOnClickListener(this);
        }
        {
            imgL = (ImageView) findViewById(R.id.imgL);
            imgL.setOnClickListener(this);
        }
        {
            imgM = (ImageView) findViewById(R.id.imgM);
            imgM.setOnClickListener(this);
        }
        {
            imgO = (ImageView) findViewById(R.id.imgO);
            imgO.setOnClickListener(this);
        }
        {
            imgOo = (ImageView) findViewById(R.id.imgOo);
            imgOo.setOnClickListener(this);
        }
        {
            imgP = (ImageView) findViewById(R.id.imgP);
            imgP.setOnClickListener(this);
        }
        {
            imgR = (ImageView) findViewById(R.id.imgR);
            imgR.setOnClickListener(this);
        }
        {
            imgS = (ImageView) findViewById(R.id.imgS);
            imgS.setOnClickListener(this);
        }
        {
            imgSch = (ImageView) findViewById(R.id.imgSch);
            imgSch.setOnClickListener(this);
        }
        {
            imgU = (ImageView) findViewById(R.id.imgU);
            imgU.setOnClickListener(this);
        }
        {
            imgUu = (ImageView) findViewById(R.id.imgUu);
            imgUu.setOnClickListener(this);
        }
        {
            imgV = (ImageView) findViewById(R.id.imgV);
            imgV.setOnClickListener(this);
        }
        {
            imgX = (ImageView) findViewById(R.id.imgX);
            imgX.setOnClickListener(this);
        }
        {
            imgY = (ImageView) findViewById(R.id.imgY);
            imgY.setOnClickListener(this);
        }
        {
            imgZ = (ImageView) findViewById(R.id.imgZ);
            imgZ.setOnClickListener(this);
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
            mediaPlayer = MediaPlayer.create(this, R.raw.a);
        }
        else if (arg == 2){
            mediaPlayer = MediaPlayer.create(this, R.raw.a);
        }
        else if (arg == 3){
            mediaPlayer = MediaPlayer.create(this, R.raw.be);
        }
        else if (arg == 4){
            mediaPlayer = MediaPlayer.create(this, R.raw.sch);
        }
        else if (arg == 5){
            mediaPlayer = MediaPlayer.create(this, R.raw.d);
        }
        else if (arg == 6){
            mediaPlayer = MediaPlayer.create(this, R.raw.e);
        }
        else if (arg == 7){
            mediaPlayer = MediaPlayer.create(this, R.raw.g);
        }
        else if (arg == 8){
            mediaPlayer = MediaPlayer.create(this, R.raw.ha);
        }
        else if (arg == 9){
            mediaPlayer = MediaPlayer.create(this, R.raw.i);
        }
        else if (arg == 10){
            mediaPlayer = MediaPlayer.create(this, R.raw.k);
        }
        else if (arg == 11){
            mediaPlayer = MediaPlayer.create(this, R.raw.l);
        }
        else if (arg == 12){
            mediaPlayer = MediaPlayer.create(this, R.raw.em);
        }
        else if (arg == 13){
            mediaPlayer = MediaPlayer.create(this, R.raw.o);
        }
        else if (arg == 14){
            mediaPlayer = MediaPlayer.create(this, R.raw.o);
        }
        else if (arg == 15){
            mediaPlayer = MediaPlayer.create(this, R.raw.p);
        }
        else if (arg == 16){
            mediaPlayer = MediaPlayer.create(this, R.raw.er);
        }
        else if (arg == 17){
            mediaPlayer = MediaPlayer.create(this, R.raw.es);
        }
        else if (arg == 18){
            mediaPlayer = MediaPlayer.create(this, R.raw.sch);
        }
        else if (arg == 19){
            mediaPlayer = MediaPlayer.create(this, R.raw.u);
        }
        else if (arg == 20){
            mediaPlayer = MediaPlayer.create(this, R.raw.u);
        }
        else if (arg == 21){
            mediaPlayer = MediaPlayer.create(this, R.raw.fau);
        }
        else if (arg == 22){
            mediaPlayer = MediaPlayer.create(this, R.raw.iks);
        }
        else if (arg == 23){
            mediaPlayer = MediaPlayer.create(this, R.raw.ypsilon);
        }
        else if (arg == 24){
            mediaPlayer = MediaPlayer.create(this, R.raw.zet);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.das_alphabeth, menu);
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
            case R.id.imgA:
                playSound(1);
                break;
            case R.id.imgAa:
                playSound(2);
                break;
            case R.id.imgB:
                playSound(3);
                break;
            case R.id.imgCh:
                playSound(4);
                break;
            case R.id.imgD:
                playSound(5);
                break;
            case R.id.imgE:
                playSound(6);
                break;
            case R.id.imgG:
                playSound(7);
                break;
            case R.id.imgH:
                playSound(8);
                break;
            case R.id.imgI:
                playSound(9);
                break;
            case R.id.imgK:
                playSound(10);
                break;
            case R.id.imgL:
                playSound(11);
                break;
            case R.id.imgM:
                playSound(12);
                break;
            case R.id.imgO:
                playSound(13);
                break;
            case R.id.imgOo:
                playSound(14);
                break;
            case R.id.imgP:
                playSound(15);
                break;
            case R.id.imgR:
                playSound(16);
                break;
            case R.id.imgS:
                playSound(17);
                break;
            case R.id.imgSch:
                playSound(18);
                break;
            case R.id.imgU:
                playSound(19);
                break;
            case R.id.imgUu:
                playSound(20);
                break;
            case R.id.imgV:
                playSound(21);
                break;
            case R.id.imgX:
                playSound(22);
                break;
            case R.id.imgY:
                playSound(23);
                break;
            case R.id.imgZ:
                playSound(24);
                break;
        }
    }
}
