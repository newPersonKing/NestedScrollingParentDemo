package com.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mynestscrollingdemo.R;

import java.util.List;

/**
 * Created by emcc-pc on 2018/4/19.
 */

public class CommonAdapter extends RecyclerView.Adapter<CommonAdapter.MyViewHolder> {

    private Context mContext;
    private List<String> datas;

    public CommonAdapter(Context context, List<String> datas){
        this.mContext=context;
        this.datas=datas;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //这个不好使
//        View view=View.inflate(mContext, R.layout.item,null);
        View view=LayoutInflater.from(mContext).inflate(R.layout.item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
         holder.textView.setText(datas.get(position));
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
       TextView textView;
        public MyViewHolder(View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.id_info);
        }
    }
}
