package com.cework.taiwan_high_speed_rail_android.tool;

import android.app.Activity;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

import com.cework.taiwan_high_speed_rail_android.MainActivity;
import com.cework.taiwan_high_speed_rail_android.define.Constants;

public class JavaScriptInterface {
    private final String TAG = "JavaScriptInterface";
    private WebView controlWebView;
    private Model controlModel;
    private MainActivity controlActivity;

    public JavaScriptInterface(MainActivity activity ,WebView webView, Model model
    ){
        controlWebView = webView;
        controlModel = model;
        controlActivity = activity;
    }

    @JavascriptInterface
    public void backPage() {
        Log.d(TAG, "  backPage   " );
        controlActivity.runOnUiThread(new Runnable() {
            //  @Override
            public void run() {
                controlWebView.goBack();
            }
        });
    }

    @JavascriptInterface
    public void showRewardedAd() {
        Log.d(TAG, "showRewardedAd");
        controlActivity.runOnUiThread(new Runnable() {
            //  @Override
            public void run() {
                controlActivity.showRewardedAd();
            }
        });
    }

    @JavascriptInterface
    public void showInterstitialAd() {
        Log.d(TAG, "showInterstitialAd");
        controlActivity.runOnUiThread(new Runnable() {
            //  @Override
            public void run() {
                controlActivity.showInterstitialAd();
            }
        });
    }

    @JavascriptInterface
    public void setMainLayoutBackgroundColor(int R,int G, int B) {
        Log.d(TAG, "setMainLayoutBackgroundColor");
        controlActivity.runOnUiThread(new Runnable() {
            //  @Override
            public void run() {
                controlActivity.setMainLayoutBackgroundColor(R,G,B);
            }
        });
    }

}
