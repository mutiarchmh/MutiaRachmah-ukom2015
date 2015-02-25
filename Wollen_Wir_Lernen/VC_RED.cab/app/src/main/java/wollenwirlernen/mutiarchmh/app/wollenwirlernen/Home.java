package wollenwirlernen.mutiarchmh.app.wollenwirlernen;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Home extends ActionBarActivity {

    Button btnAnfanger;
    Button btnLr;
    Button btnSpilen;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        {
            btnAnfanger = (Button) findViewById(R.id.btnAnfanger);
            btnAnfanger.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent btnAnfanger = new Intent(getApplicationContext(), Anfanger.class);
                    startActivity(btnAnfanger);
                }
            });
        }
        {
            btnLr = (Button) findViewById(R.id.btnLr);

            btnLr.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Intent btnLr = new Intent(getApplicationContext(), Lernen.class);
                    startActivity(btnLr);
                }
            });
        }
        {
        btnSpilen = (Button) findViewById(R.id.btnSpilen);

        btnSpilen.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent btnSpilen = new Intent(getApplicationContext(), Spilen.class);
                startActivity(btnSpilen);
            }
        });
    }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
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
