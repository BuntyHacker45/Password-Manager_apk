package com.example.passwordmanager;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView myWeb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        myWeb = findViewById(R.id.myWeb);
        myWeb.getSettings().setJavaScriptEnabled(true);
        myWeb.getSettings().setJavaScriptEnabled(true);
        myWeb.getSettings().setDomStorageEnabled(true);
        myWeb.getSettings().setDatabaseEnabled(true);
//        myWeb.getSettings().setDatabasePath(dbpath); //check the documentation for info about dbpath
        myWeb.getSettings().setMinimumFontSize(1);
        myWeb.getSettings().setMinimumLogicalFontSize(1);
        myWeb.setWebViewClient(new WebViewClient());
        myWeb.loadUrl("https://passwordmanagerteamdauoo.freewebhostmost.com/");

    }
}