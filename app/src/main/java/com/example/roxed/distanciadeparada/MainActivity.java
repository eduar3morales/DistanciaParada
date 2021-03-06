package com.example.roxed.distanciadeparada;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    private Intent intSesion;
    private Button seleccionar;
    private Button ingresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seleccionar = (Button) findViewById(R.id.btnseleccionar);
        ingresar = (Button) findViewById(R.id.btningresar);

    }

    public void onClicSeleccionar(View v) {
        intSesion = new Intent(this, Seleccionar.class);
        startActivity(intSesion);

    }

    public void onClicIngresar(View v) {
        intSesion = new Intent(this, Ingresar.class);
        startActivity(intSesion);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
