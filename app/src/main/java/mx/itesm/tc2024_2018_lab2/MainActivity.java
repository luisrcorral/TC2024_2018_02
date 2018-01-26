package mx.itesm.tc2024_2018_lab2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonCallc1;
    Button buttonCallc2;
    Button buttonTxt;
    TextView myTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCallc1 = (Button) findViewById(R.id.button_c1);
        buttonCallc2 =  (Button) findViewById(R.id.button_c2);
        buttonTxt =  (Button) findViewById(R.id.button_ct);
        myTextView = (TextView) findViewById(R.id.textView);

        buttonCallc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentC1 = new Intent(MainActivity.this, child1.class);
                startActivity(intentC1);
            }
        });

        buttonCallc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentC2 = new Intent(MainActivity.this, child2.class);
                startActivity(intentC2);
            }
        });

        buttonTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myTextView.setText("I have changed");

            }
        });



    }
}
