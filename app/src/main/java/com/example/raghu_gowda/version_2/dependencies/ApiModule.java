package com.example.raghu_gowda.version_2.dependencies;


import com.example.raghu_gowda.version_2.Service.EventsService;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

///Provides the decleration of the functions needed..!


@Module
public class ApiModule {


    //The Api Module has to only provide the api... Seperation of concern is important
    //For that we need to use another another component that provides the retrofit object
    @Provides
    @CustomScope
    EventsService provideEventService(Retrofit retrofit){

        return retrofit.create(EventsService.class);

    }
}
