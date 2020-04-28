package com.example.backendapps;

import android.app.Application;
import android.os.Bundle;

import com.backendless.Backendless;

public class ApplicationClass  extends Application {
    public static final String APPLICATION_ID = "EA6A3825-9D85-DC6C-FF60-7466E136FF00";
    public static final String API_KEY = "21A7B635-D01D-4937-B699-8B89CD4F75C7";
    public static final String SERVER_URL = "https://api.backendless.com";


    @Override
    public void onCreate() {
        super.onCreate();


    Backendless.setUrl( SERVER_URL );
        Backendless.initApp( getApplicationContext(),
                APPLICATION_ID,
                API_KEY );





    }
}
