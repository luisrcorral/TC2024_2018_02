package mx.itesm.tc2024_2018_lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class child1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child1);

        Button buttonBack;

        buttonBack = (Button) findViewById(R.id.button);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentC1 = new Intent(child1.this, MainActivity.class);
                startActivity(intentC1);
            }
        });
    }
}
