package com.example.raghu_gowda.version_2.module;


import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.raghu_gowda.version_2.R;

import java.util.ArrayList;
import java.util.List;

public class EventCategoryAdapter extends RecyclerView.Adapter<EventCategoryAdapter.Holder>{


    private final LayoutInflater minflater;
    private List<EventResponse.ResultsBean> mresult;
    public static Integer count=0;

    public EventCategoryAdapter(LayoutInflater inflater) {
        minflater=inflater;
        mresult=new ArrayList<>();
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new Holder(minflater.inflate(R.layout.events_category,parent,false));
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {

        holder.textView.setText(mresult.get(position).getName());


    }

    @Override
    public int getItemCount() {
        return mresult.size();
    }

    public void category(EventResponse eventResponse) {
        mresult=eventResponse.getResults();
        notifyDataSetChanged();
    }

    public class Holder extends RecyclerView.ViewHolder{

        private TextView textView;
        public Holder(View itemView) {
            super(itemView);
            textView=(TextView)itemView.findViewById(R.id.cardviewtext);
        }
    }
}
