package com.example.tes


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient



class MainActivity : AppCompatActivity() {

    lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.wb_webView)
        webView.webViewClient = WebViewClient()
        webView.loadUrl("192.168.4.1")


        val webSettings = webView.settings

//        webSettings.javaScriptEnabled = true
//        webSettings.domStorageEnabled = true

    }

    override fun onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack()
        }else{
            super.onBackPressed()
        }

    }


}