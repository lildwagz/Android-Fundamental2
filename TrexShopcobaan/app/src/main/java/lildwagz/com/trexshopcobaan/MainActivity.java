package lildwagz.com.trexshopcobaan;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText NamaPembeli,JudulBuku,JumlahBeli,Harga,Bayar;

    Button Kirim;
    AlertDialog.Builder alertDialog;
    Bundle data;
    Intent KirimData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NamaPembeli = (EditText)findViewById(R.id.et_NamaPembeli);
        JudulBuku = (EditText)findViewById(R.id.et_JudulBuku);
        JumlahBeli = (EditText)findViewById(R.id.et_JumlahBeli);
        Harga = (EditText)findViewById(R.id.et_Harga);
        Bayar = (EditText)findViewById(R.id.et_Dibayar);
        Kirim = (Button)findViewById(R.id.bt_Kirim);


        Kirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog = new AlertDialog.Builder(MainActivity.this);

                final String NamaP = NamaPembeli.getText().toString().trim();
                final String JudulB = JudulBuku.getText().toString().trim();
                final String JumlahB = JumlahBeli.getText().toString().trim();
                final String Harg = Harga.getText().toString().trim();
                final String Bayr = Bayar.getText().toString().trim();


                alertDialog
                        .setMessage("Apakah Data Yang Anda Masukan Sudah Benar?")
                        .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                double jb = Double.parseDouble(JumlahB);
                                double h = Double.parseDouble(Harg);
                                double ub = Double.parseDouble(Bayr);
                                double total = (jb * h);


                                data = new Bundle();
                                data.putDouble("TOTALBELI",total);
                                data.putDouble("HARGA",h);
                                data.putDouble("UANGDIBAYAR",ub);



                                KirimData = new Intent(MainActivity.this,DataTampung.class);
                                KirimData.putExtras(data);
                                startActivity(KirimData);

                            }
                        })

                        .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                AlertDialog alert = alertDialog.create();
                alert.show();


            }
        });

    }
}
