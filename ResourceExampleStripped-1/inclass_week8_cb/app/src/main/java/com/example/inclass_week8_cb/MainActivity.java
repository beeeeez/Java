package com.example.inclass_week8_cb;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnTouchListener;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.SpinnerAdapter;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.widget.Spinner;
import android.widget.*;
import java.util.*;


public class MainActivity extends AppCompatActivity {

    private Switch switchy;
    private ToggleButton toggley;
    private TextView texty, texter;
    private Spinner spinny, spinner;
    private Button buttony;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texty = findViewById(R.id.textView);
        switchy = findViewById(R.id.switch1);
        toggley = findViewById(R.id.toggleButton);
        switchy.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    texty.setText(switchy.getTextOn());
                }
            else{texty.setText(switchy.getTextOff());
            }
        }});
        toggley.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    texty.setText(toggley.getTextOn());
                }
                else{texty.setText(toggley.getTextOff());
                }
            }
        });
        ArrayList<CharSequence> jimmy = new ArrayList<CharSequence>();
        jimmy.add("Toenails");
        jimmy.add("Jubjub");
        jimmy.add("hubbub");
        jimmy.add("nubbab");
        jimmy.add("koolaid");
        jimmy.add("baseballs");
        jimmy.add("jimmy");
        ArrayAdapter<CharSequence> bimmy = ArrayAdapter.createFromResource(this, R.array.spinneer2, android.R.layout.simple_spinner_item);
       // ArrayAdapter<CharSequence> bimmy = ArrayAdapter.createFromResource(this,jimmy.size(),R.layout.support_simple_spinner_dropdown_item);

        spinny = findViewById(R.id.spinner2);
        spinny.setAdapter(bimmy);
        spinner = findViewById(R.id.spinner);
       // spinny.setAdapter(bimmy);
        buttony = findViewById(R.id.button);
        texter=findViewById(R.id.textView2);
        buttony.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texter.setText(spinner.getSelectedItem().toString());
            }
        });

        };


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
