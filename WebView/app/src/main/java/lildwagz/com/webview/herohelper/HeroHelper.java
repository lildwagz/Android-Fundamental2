package lildwagz.com.webview.herohelper;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

public class HeroHelper extends AppCompatActivity {

    public void intentPindah(Activity activity_awal,Class activity_tujuan){

        Intent pindah = new Intent(activity_awal,activity_tujuan);

        activity_awal.startActivity(pindah);
    }

}
