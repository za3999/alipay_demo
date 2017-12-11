package com.alipay.sdk.pay.demo.http;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

/**
 * Created by zhengcf on 2017/11/24.
 */

public class OkHttpUtil {

    private static final OkHttpClient client = new OkHttpClient();

    public static void getOrderInfo(Callback callback) {
        FormBody.Builder builder = new FormBody.Builder();
        RequestBody formBody = builder.build();
        Request request = new Request.Builder().url("http://1759it5030.51mypc.cn:26099/alipay/pay/0.1/1").post(formBody).build();
        Call call = client.newCall(request);
        call.enqueue(callback);
    }
}


