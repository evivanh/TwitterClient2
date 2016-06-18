package com.example.ap.twitterclient.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.ap.twitterclient.R;

public class Webview extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        webView = (WebView) findViewById(R.id.webview);
        String URL = "http://www.nu.nl";
        if (webView != null) {
            webView.loadUrl(URL);
        }
    }
}
