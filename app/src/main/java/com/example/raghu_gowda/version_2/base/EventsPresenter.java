package com.example.raghu_gowda.version_2.base;


import com.example.raghu_gowda.version_2.Service.EventViewInterface;
import com.example.raghu_gowda.version_2.module.EventResponse;

import rx.Observer;

public class EventsPresenter extends BasePresenter implements Observer<EventResponse> {

    private EventViewInterface eventViewInterface;

    public EventsPresenter(EventViewInterface eventViewInterface) {
        this.eventViewInterface = eventViewInterface;
    }

    @Override
    public void onCompleted() {
        eventViewInterface.completed();
    }

    @Override
    public void onError(Throwable e) {
        eventViewInterface.onError(e.getMessage());
    }

    @Override
    public void onNext(EventResponse eventResponse) {
        eventViewInterface.onEvent(eventResponse);
    }

    public void fetchEvents() {
        unSubscribeAll();
        subscribe(eventViewInterface.getEvents(),EventsPresenter.this);
    }
}
