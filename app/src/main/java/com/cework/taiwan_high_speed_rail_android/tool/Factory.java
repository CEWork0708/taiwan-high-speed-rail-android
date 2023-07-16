package com.cework.taiwan_high_speed_rail_android.tool;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.webkit.WebView;

import com.cework.taiwan_high_speed_rail_android.MainActivity;
import com.cework.taiwan_high_speed_rail_android.tool.JavaScriptInterface;

/**
 * Created by Chris.Wu on 2016/10/20.
 */
public class Factory {

    // change Factory to singleton

    private static final Factory ourInstance = new Factory();

    public static Factory getInstance() {
        return ourInstance;
    }

    private Factory() {
    }

    public JavaScriptInterface createJavaScriptInterface(MainActivity activity, WebView webView, Model model) {
        return new JavaScriptInterface(activity, webView,model);
    }

    public Model createModel(MainActivity activity) {
        return new Model(activity);
    }


}
