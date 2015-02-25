package wollenwirlernen.mutiarchmh.app.wollenwirlernen;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class Anfanger extends ActionBarActivity {

    ImageView btnZah;
    ImageView btnDas;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anfanger_activity);

        btnZah = (ImageView) findViewById(R.id.btnZah);

        btnZah.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Intent btnZah = new Intent(getApplicationContext(), Zahlen.class);
                    startActivity(btnZah);
                }
            });

        {
            btnDas = (ImageView) findViewById(R.id.btnDas);

            btnDas.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Intent btnDas = new Intent(getApplicationContext(), das_Alphabeth.class);
                    startActivity(btnDas);
                }
            });
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_anfanger, menu);
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