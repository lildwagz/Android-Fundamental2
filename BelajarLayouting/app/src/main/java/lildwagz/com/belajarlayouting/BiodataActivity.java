package lildwagz.com.belajarlayouting;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class BiodataActivity extends AppCompatActivity {


    EditText etNamaLengkap, etTanggal,etBulan,etTahun,etKelas,etJurusan;
    Button btTampilkan, btHapus;

    AlertDialog.Builder builderAlert;

    String NamaLengkap , Tanggal , Bulan , Tahun , Kelas , Jurusan;

    Intent KirimData;
    Bundle PackageBiodata;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        etNamaLengkap = (EditText)findViewById(R.id.edt_NamaLengkap);
        etTanggal = (EditText)findViewById(R.id.edt_Tanggal);
        etBulan = (EditText)findViewById(R.id.edt_Bulan);
        etTahun = (EditText)findViewById(R.id.edt_Tahun);
        etKelas = (EditText)findViewById(R.id.edt_Kelas);
        etJurusan = (EditText)findViewById(R.id.edt_Jurusan);

        btTampilkan = (Button)findViewById(R.id.btn_TampilkanInputan);
        btHapus = (Button)findViewById(R.id.btn_Hapus);


        btTampilkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builderAlert = new AlertDialog.Builder(BiodataActivity.this);
                NamaLengkap = etNamaLengkap.getText().toString();
                Tanggal = etTanggal.getText().toString();
                Bulan = etBulan.getText().toString();
                Tahun = etTahun.getText().toString();
                Kelas = etKelas.getText().toString();
                Jurusan = etJurusan.getText().toString();



                builderAlert
                        .setTitle("\tInformasi")
                        .setMessage("Data yang anda input\nNama Lengkap : "+NamaLengkap+"\nTanggal : "+Tanggal+"Bulan : "+Bulan+
                                "Tahun : "+Tahun+"\nKelas : "+Kelas+"\nJurusan : "+Jurusan)
                        .setPositiveButton("kirim", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                PackageBiodata = new Bundle();
                                PackageBiodata.putString("Nama_LENGKAP", NamaLengkap);
                                PackageBiodata.putString("TANGAl", Tanggal);
                                PackageBiodata.putString("BULAN", Bulan);
                                PackageBiodata.putString("TAHUN", Tahun);
                                PackageBiodata.putString("KELAS", Kelas);
                                PackageBiodata.putString("JURUSAN", Jurusan);

                                KirimData = new Intent(BiodataActivity.this, DetailBiodata.class);
                                KirimData.putExtras(PackageBiodata);
                                startActivity(KirimData);



                            }
                        })
                        .setNegativeButton("Batalkan", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                AlertDialog alertDialog = builderAlert.create();
                alertDialog.show();
            }
        });

        btHapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builderAlert = new AlertDialog.Builder(BiodataActivity.this);
                etNamaLengkap.setText("");
                etTanggal.setText("");
                etBulan.setText("");
                etTahun.setText("");
                etJurusan.setText("");
                etKelas.setText((""));

            }
        });

    }


}
