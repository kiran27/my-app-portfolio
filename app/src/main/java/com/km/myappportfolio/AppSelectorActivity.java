package com.km.myappportfolio;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AppSelectorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_selector);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_app_selector, menu);

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


    /** Called when the user touches the button */
    public void sendMessage(View view) {


        if(     view.getId() == R.id.button1 ||
                view.getId() == R.id.button2 ||
                view.getId() == R.id.button3 ||
                view.getId() == R.id.button4 ||
                view.getId() == R.id.button5 ||
                view.getId() == R.id.button6) {

            Button button = (Button) view;
            String buttonText = button.getText().toString();

            Toast.makeText(AppSelectorActivity.this, "This button will launch my : " + buttonText + " app", Toast.LENGTH_SHORT).show();
        }
    }

}
