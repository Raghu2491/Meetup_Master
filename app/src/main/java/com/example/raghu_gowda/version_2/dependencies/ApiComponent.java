package com.example.raghu_gowda.version_2.dependencies;

import com.example.raghu_gowda.version_2.ui.MainActivity;

import dagger.Component;

//dependencies = NetworkComponent.class is used because if I need to use another service other than EventService
//I could do so by using the retrofit provided by the network component
@CustomScope
@Component(modules = ApiModule.class, dependencies = NetworkComponent.class)
public interface ApiComponent {

    //where ever I use @inject annotation I will be injecting Mainactivity
    void inject(MainActivity mainActivity);
}
