package mx.itesm.tc2024_2018_lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class child2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child2);

        Button buttonnBack;

        buttonnBack = (Button) findViewById(R.id.button);

        buttonnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentC1 = new Intent(child2.this, MainActivity.class);
                startActivity(intentC1);
            }
        });
    }
}
