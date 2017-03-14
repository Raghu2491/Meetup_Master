package com.example.raghu_gowda.version_2.Service;


import com.example.raghu_gowda.version_2.module.EventResponse;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface EventsService {
    @GET("/2/categories?&sign=true")
        Observable<EventResponse> getCategory(@Query("key") String api_key, @Query("group_urlname") String url_name);
}
