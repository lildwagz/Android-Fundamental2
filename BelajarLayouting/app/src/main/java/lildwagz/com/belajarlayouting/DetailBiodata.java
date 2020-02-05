package lildwagz.com.belajarlayouting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailBiodata extends AppCompatActivity {

    TextView txNamaLengkap , txTanggal , txBulan,txTahun,txkelas,txJurusan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_biodata);


        txNamaLengkap = (TextView)findViewById(R.id.tmp_NamaLengkap);
        txTanggal = (TextView)findViewById(R.id.tmp_Tanggal);
        txBulan = (TextView)findViewById(R.id.tmp_Bulan);
        txTahun = (TextView)findViewById(R.id.tmp_Tahun);
        txkelas = (TextView)findViewById(R.id.tmp_Kelas);
        txJurusan = (TextView)findViewById(R.id.tmp_Jurusan);


        Bundle getBiodata = getIntent().getExtras();
        txNamaLengkap.setText(getBiodata.getString("Nama_LENGKAP"));
        txTanggal.setText(getBiodata.getString("TANGAl"));
        txBulan.setText(getBiodata.getString("BULAN"));
        txTahun.setText(getBiodata.getString("TAHUN"));
        txkelas.setText(getBiodata.getString("KELAS"));
        txJurusan.setText(getBiodata.getString("JURUSAN"));



    }
}
