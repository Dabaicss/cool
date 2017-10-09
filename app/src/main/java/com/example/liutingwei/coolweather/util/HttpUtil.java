package com.example.liutingwei.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by liutingwei on 17/10/7.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
