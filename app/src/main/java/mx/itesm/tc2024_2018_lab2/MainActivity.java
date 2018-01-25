package mx.itesm.tc2024_2018_lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button buttonCallc1;
        Button buttonCallc2;

        buttonCallc1 = (Button) findViewById(R.id.button_c1);
        buttonCallc2 =  (Button) findViewById(R.id.button_c2);

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




    }
}
