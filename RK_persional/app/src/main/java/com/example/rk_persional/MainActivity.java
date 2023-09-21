package com.example.rk_persional;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = (WebView) findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
//        webView.loadUrl("https://rkgupta7463.github.io/Rishu-gupta-persional/");
        webView.loadUrl("https://rkgupta7463.github.io/E-Book-Store-/");

        this.getSupportActionBar().hide();

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }
    @Override
    public void onBackPressed() {
//        if (webView.canGoBack()) {
//            webView.goBack();
//        } else {
//            super.onBackPressed();

            AlertDialog.Builder exit = new AlertDialog.Builder(MainActivity.this);

            exit.setTitle("Exit the App");
            exit.setIcon(R.drawable.ic_baseline_exit_to_app_24);
            exit.setMessage("Are You sure to exit?");

            exit.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    MainActivity.super.onBackPressed();
                    Toast.makeText(MainActivity.this, "you exited", Toast.LENGTH_SHORT).show();
                }
            });
            exit.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(MainActivity.this, "Welcome again!!", Toast.LENGTH_SHORT).show();
                }
            });
            exit.show();
    }
}