package com.app.foodies.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.foodies.R;
import com.app.foodies.model.AllCategoryClass;

import java.util.List;

/**
 * Created by toukir on 1/14/18.
 */

public class AdapterAllCategory extends RecyclerView.Adapter<AdapterAllCategory.MyViewHolder> {

    private List<AllCategoryClass> allCategoryClassList;
    private Context mCOntext;

    public AdapterAllCategory(Context context, List<AllCategoryClass> list){
        this.mCOntext = context;
        this.allCategoryClassList = list;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mCOntext).inflate(R.layout.row_all_category, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        AllCategoryClass allCategoryClass = allCategoryClassList.get(position);

        holder.txtTitle.setText(allCategoryClass.getContent_title());

    }

    @Override
    public int getItemCount() {
        return allCategoryClassList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView txtTitle;

        public MyViewHolder(View itemView) {
            super(itemView);

            txtTitle = itemView.findViewById(R.id.txtTitle);
        }
    }
}
