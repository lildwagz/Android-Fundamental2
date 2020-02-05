package lildwagz.com.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

import lildwagz.com.webview.herohelper.HeroHelper;

public class MainActivity extends HeroHelper {

    WebView wView;
    WebSettings setWeb;

    HeroHelper herohelper = new HeroHelper();

    EditText edURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edURL = (EditText)findViewById(R.id.edtURL);
        wView = (WebView)findViewById(R.id.wvBrowser);

        edURL.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)){
                    String URL_GET = "https://"+ edURL.getText().toString().trim();
                    setWeb = wView.getSettings();
                    setWeb.setJavaScriptEnabled(true);
                    wView.setWebViewClient(new WebViewClient());
                    wView.loadUrl(URL_GET);
                }
                return false;
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK ) && wView.canGoBack()){
            wView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

}
