package com.example.raghu_gowda.version_2.base;


import rx.Observable;
import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;
import rx.subscriptions.Subscriptions;

public abstract class BasePresenter implements Presenter {

    private CompositeSubscription compositeSubscription;

    @Override
    public void onCreate() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onResume() {

        configureSubscription();

    }

    private CompositeSubscription configureSubscription() {
        if(compositeSubscription==null || compositeSubscription.isUnsubscribed()){
            compositeSubscription=new CompositeSubscription();
        }
        return compositeSubscription;
    }

    @Override
    public void onDestroy() {
        unSubscribeAll();
    }

    protected void unSubscribeAll() {

        if(compositeSubscription!=null){
            compositeSubscription.unsubscribe();
            compositeSubscription.clear();
        }
    }

    protected <E> void subscribe(Observable<E> observable, Observer<E> observer) {

        Subscription subscription = observable
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .unsubscribeOn(Schedulers.computation())
                .subscribe(observer);

        configureSubscription().add(subscription);
    }

}
