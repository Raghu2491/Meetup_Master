package com.example.raghu_gowda.version_2.application;


import android.app.Application;

import com.example.raghu_gowda.version_2.module.Constant;
import com.example.raghu_gowda.version_2.dependencies.ApiComponent;
import com.example.raghu_gowda.version_2.dependencies.DaggerApiComponent;
import com.example.raghu_gowda.version_2.dependencies.DaggerNetworkComponent;
import com.example.raghu_gowda.version_2.dependencies.NetworkComponent;
import com.example.raghu_gowda.version_2.dependencies.NetworkModule;

public class EventsApplication extends Application {

    private ApiComponent mApicomponent;

    @Override
    public void onCreate(){
        resolveDependency();
        super.onCreate();

    }

    private void resolveDependency() {

        mApicomponent= DaggerApiComponent.builder()
                .networkComponent(getNetworkcomponent())
                .build();
    }

    public NetworkComponent getNetworkcomponent() {
        return DaggerNetworkComponent.builder()
                .networkModule(new NetworkModule(Constant.BASE_URL))
                .build();
    }

    //Use this to inject out main activity
    public ApiComponent getApicomponent() {
        return mApicomponent;
    }
}
