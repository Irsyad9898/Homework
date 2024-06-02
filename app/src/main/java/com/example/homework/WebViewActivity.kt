package com.example.homework

import android.graphics.Color
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.homework.databinding.ActivityWebViewBinding

class WebViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWebViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityWebViewBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val myBrowser: WebView = binding.webView
        myBrowser.webViewClient = WebViewClient()

        // Shows the URL
        myBrowser.loadUrl("https://upnm.edu.my")

        // Set the Web View to have a transparent background
        myBrowser.setBackgroundColor(Color.TRANSPARENT)

        // To enable JavaScript for the web browser
        myBrowser.settings.javaScriptEnabled = true

        // To load images automatically
        myBrowser.settings.loadsImagesAutomatically = true

        // Enable Scrolling
        myBrowser.scrollBarStyle = View.SCROLLBARS_INSIDE_OVERLAY
    }
}