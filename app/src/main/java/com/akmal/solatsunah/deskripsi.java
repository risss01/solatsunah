package com.akmal.solatsunah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class deskripsi extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        //inialisasi

        webView = findViewById(R.id.webview);

        Intent deskripsi = getIntent();

        String link = deskripsi.getStringExtra("sunnah");


        webView.getSettings().setJavaScriptEnabled(true);

        webView.getSettings().setLoadsImagesAutomatically(true);

        webView.loadUrl(link);
    }
}









