package dev.foodie.challenge1.activities

import android.net.http.SslError
import android.os.Bundle
import android.view.MenuItem
import android.webkit.*
import androidx.appcompat.app.AppCompatActivity
import dev.foodie.challenge1.R
import kotlinx.android.synthetic.main.activity_about_alc.*
import kotlinx.android.synthetic.main.activity_about_alc.view.*

class AboutALCActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_alc)

        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        webView.settings.javaScriptEnabled = true
        webView.settings.allowFileAccess = true
        webView.webViewClient = MyWebViewClient()
        webView.loadUrl("https://andela.com/alc")
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item!!.itemId) {
            android.R.id.home -> {
                finish()
            }
        }
        return true
    }

    class MyWebViewClient : WebViewClient() {
        override fun onReceivedSslError(view: WebView?, handler: SslErrorHandler?, error: SslError?) {
            handler!!.proceed()
        }
    }

}