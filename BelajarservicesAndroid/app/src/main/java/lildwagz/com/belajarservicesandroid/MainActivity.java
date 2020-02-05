package lildwagz.com.belajarservicesandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import lildwagz.com.belajarservicesandroid.explicit.ExclicitBasic;

public class MainActivity extends AppCompatActivity {

    // TODO 1: Deklarasikan View Terlebih dahulu
    Button btn_explicit;
    Button btn_implicit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO 2: Inisialisasikan View Yang sudah di deklarasikan
        btn_explicit = (Button)findViewById(R.id.btn_intentexplicit);
        btn_implicit =(Button)findViewById(R.id.btn_intentimplicit);


        // TODO 3 : implementasi View yang sudah di inisialisasikan
        btn_explicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Menambahkan Intent Explocot = Memindahkan Dari Main Activity Yang Lain
                Intent toActivityExplicit = new Intent(MainActivity.this, ExclicitBasic.class);
                startActivity(toActivityExplicit);
            }
        });




        btn_implicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }

}
