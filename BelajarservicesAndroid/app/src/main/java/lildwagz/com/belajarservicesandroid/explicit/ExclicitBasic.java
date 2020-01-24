package lildwagz.com.belajarservicesandroid.explicit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import lildwagz.com.belajarservicesandroid.MainActivity;
import lildwagz.com.belajarservicesandroid.R;

public class ExclicitBasic extends AppCompatActivity {
    Button btn_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exclicit_basic);

        btn_home = (Button)findViewById(R.id.mainhome);

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_home = new Intent(ExclicitBasic.this, MainActivity.class);
                startActivity(btn_home);
            }
        });


    }
}
