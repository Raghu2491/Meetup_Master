package com.example.raghu_gowda.version_2.Service;


import com.example.raghu_gowda.version_2.module.EventResponse;

import rx.Observable;

public interface EventViewInterface {
    void completed();

    void onError(String message);

    void onEvent(EventResponse eventResponse);

    Observable<EventResponse> getEvents();
}
