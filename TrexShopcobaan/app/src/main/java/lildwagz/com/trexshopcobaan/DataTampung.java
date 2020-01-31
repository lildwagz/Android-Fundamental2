package lildwagz.com.trexshopcobaan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class DataTampung extends AppCompatActivity {

    TextView TotalBelanja, UangKembali , Bonus ,Keterangan;

    double tmTotal,tmHarga,tmBayar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_tampung);

        TotalBelanja = (TextView)findViewById(R.id.tv_TotalBelanja);
        UangKembali = (TextView)findViewById(R.id.tv_UangKembali);
        Bonus = (TextView)findViewById(R.id.tv_Bonus);
        Keterangan = (TextView)findViewById(R.id.tv_keterangan);

        Bundle getBiodata = getIntent().getExtras();
        tmTotal = getBiodata.getDouble("TOTALBELI");
        tmHarga = getBiodata.getDouble("HARGA");
        tmBayar = getBiodata.getDouble("UANGDIBAYAR");

        TotalBelanja.setText(String.valueOf(tmTotal));

        if (tmTotal >=200000){
            Bonus.setText(" Mouse");
        } else if (tmTotal >=50000){
            Bonus.setText("Keyboard");
        } else  if (tmTotal >=40000){
            Bonus.setText("Harddisk");
        } else {
            Bonus.setText("Tidak Ada Bonus");
        }
        double uangkembalian = (tmBayar - tmTotal);

        if (tmBayar < tmTotal){
            Keterangan.setText(" uang bayar kurang Rp " + (-uangkembalian));
            UangKembali.setText("0" );
        }else{
            Keterangan.setText("Tunggu Kembalian");
            UangKembali.setText("" + uangkembalian);
        }




    }
}
