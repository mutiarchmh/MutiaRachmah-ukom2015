package wollenwirlernen.mutiarchmh.app.wollenwirlernen;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class Lernen extends ActionBarActivity {

    ImageView imgGruB;
    ImageView imgFam;
    ImageView imgKle;
    ImageView imgDas;
    ImageView imgFer;
    ImageView imgJah;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lernen_activity_);
        {
            imgGruB = (ImageView) findViewById(R.id.imgGrub);

            imgGruB.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Intent imgGruB = new Intent(getApplicationContext(), Salam.class);
                    startActivity(imgGruB);
                }
            });
        }
        {
            imgFam = (ImageView) findViewById(R.id.imgFam);

            imgFam.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Intent imgFam = new Intent(getApplicationContext(), Familie.class);
                    startActivity(imgFam);
                }
            });
        }
        {
            imgKle = (ImageView) findViewById(R.id.imgKle);

            imgKle.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Intent imgKle = new Intent(getApplicationContext(), Kleidung.class);
                    startActivity(imgKle);
                }
            });
        }
        {
            imgDas = (ImageView) findViewById(R.id.imgDas);

            imgDas.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Intent imgDas = new Intent(getApplicationContext(), DasEssen.class);
                    startActivity(imgDas);
                }
            });
        }
        {
            imgFer = (ImageView) findViewById(R.id.imgFer);

            imgFer.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Intent imgFer = new Intent(getApplicationContext(), Ferbe.class);
                    startActivity(imgFer);
                }
            });
        }
        {
            imgJah = (ImageView) findViewById(R.id.imgJah);

            imgJah.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Intent imgJah = new Intent(getApplicationContext(), Jahreszeit.class);
                    startActivity(imgJah);
                }
            });
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lernen, menu);
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
}
