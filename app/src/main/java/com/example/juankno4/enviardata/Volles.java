package com.example.juankno4.enviardata;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class Volles {


    private static Volles e = null;
    private RequestQueue requestQueue;

    private Volles(Context context) {
        requestQueue = Volley.newRequestQueue(context);
    }

    public static Volles getE(Context context) {
        if (e == null)
        {
            e= new Volles(context);
        }
        return e;

    }
    public RequestQueue getRequestQueue() {
        return requestQueue;
    }
}
