package com.example.raghu_gowda.version_2.ui;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.raghu_gowda.version_2.R;
import com.example.raghu_gowda.version_2.Service.EventViewInterface;
import com.example.raghu_gowda.version_2.Service.EventsService;
import com.example.raghu_gowda.version_2.application.EventsApplication;
import com.example.raghu_gowda.version_2.base.EventsPresenter;
import com.example.raghu_gowda.version_2.module.EventCategoryAdapter;
import com.example.raghu_gowda.version_2.module.EventResponse;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import rx.Observable;

public class MainActivity extends AppCompatActivity implements EventViewInterface {


    @Inject
    EventsService eventsService;
    private EventsPresenter eventsPresenter;

    public static final String API_KEY="2f43365b380316d3a234157ae5e31";
    public String group_urlname="ny-tech";

    @Bind(R.id.recyclerview)
    RecyclerView recyclerView;
    private EventCategoryAdapter mAdapter;
    private ProgressDialog mDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resolveDependency();

        ButterKnife.bind(MainActivity.this);
        eventsPresenter=new EventsPresenter(MainActivity.this);
        eventsPresenter.onCreate();

        configviews();

    }

    private void resolveDependency() {
        ((EventsApplication) getApplication())
            .getApicomponent()
            .inject(MainActivity.this);
    }

    private void configviews() {
        recyclerView.setRecycledViewPool(new RecyclerView.RecycledViewPool());
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        mAdapter=new EventCategoryAdapter(getLayoutInflater());
        recyclerView.setAdapter(mAdapter);
    }


    @Override
    public void onResume(){
            super.onResume();
        eventsPresenter.onResume();
        eventsPresenter.fetchEvents();
        mDialog=new ProgressDialog(MainActivity.this);
        mDialog.setIndeterminate(true);
        mDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        mDialog.setTitle("Downloding Data");
        mDialog.setMessage("Please Wait...");
        mDialog.show();


    }

    @Override
    public void completed() {
        mDialog.dismiss();
    }

    @Override
    public void onError(String message) {
        mDialog.dismiss();
        Toast.makeText(this,"Error Occured",Toast.LENGTH_LONG).show();

    }

    @Override
    public void onEvent(EventResponse eventResponse) {
        mAdapter.category(eventResponse);

    }

    @Override
    public Observable<EventResponse> getEvents() {
        return eventsService.getCategory(API_KEY,group_urlname);
    }
}
