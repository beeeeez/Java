package com.example.inclass_week7;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText countT, itemCostT, minT, percentT, buyNT;
    private TextView bulkAns, buyNAns;
    private Button button;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countT = (EditText)findViewById(R.id.countT);
        itemCostT = (EditText)findViewById(R.id.itemCostT);
        minT = (EditText)findViewById(R.id.minT);
        percentT = (EditText)findViewById(R.id.percentT);
        buyNT = (EditText)findViewById(R.id.buyNT);
        button = (Button)findViewById(R.id.calBut);
        bulkAns = (TextView)findViewById(R.id.bulkAns);
        buyNAns = (TextView)findViewById(R.id.buyNAns);


        button.setOnClickListener(new View.OnClickListener() {
                                      public void onClick(View v) {
                                          int count = Integer.parseInt(countT.getText().toString()), buyN =Integer.parseInt(buyNT.getText().toString());
                                          float itemCost = Float.parseFloat(itemCostT.getText().toString());
                                          int min = Integer.parseInt(minT.getText().toString());
                                          float percent = Float.parseFloat(percentT.getText().toString());
                                       BulkDiscount bulky = new BulkDiscount(min, percent);
                                       BuyNItemsGetOneFree jimmyjams = new BuyNItemsGetOneFree(buyN);
                                       float ans1 = bulky.computeDiscount(count, itemCost);
                                       float ans2 = jimmyjams.computeDiscount(count, itemCost);
                                       bulkAns.setText(String.valueOf(ans1));
                                       buyNAns.setText(String.valueOf(ans2));


                                      }

                                  });

    }
}

        /*
       Toolbar toolbar = findViewById(R.id.toolbar);
       setSupportActionBar(toolbar);

       FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
         answer = (TextView)findViewById(R.id.answer);
         number1 = (EditText)findViewById(R.id.num1);
         number2 = (EditText)findViewById(R.id.num2);
         button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int jimmy = Integer.parseInt(number1.getText().toString()) + Integer.parseInt(number2.getText().toString()) ;
                answer.setText(String.valueOf(jimmy));
            }
        });
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
    }*/

