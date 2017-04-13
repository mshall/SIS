package com.sis.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gaurav.cdsrecyclerview.CdsRecyclerViewAdapter;
import com.sis.R;
import com.sis.pojo.FullPlan;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Mohamed S. El-Shall on 4/8/2017.
 */

public class FullPlanAdapter extends CdsRecyclerViewAdapter<FullPlan.DataBean, FullPlanAdapter.ViewHolder> {

    private Context mContext;

    public FullPlanAdapter(Context context, List<FullPlan.DataBean> list) {
        super(context, list);
        mContext = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_list_full_plan, parent, false));
    }

    //Cast the viewholder to your custom view holder and then use it
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        holder = (ViewHolder) holder;
        FullPlan.DataBean data = getList().get(position);
        ((ViewHolder) holder).tvCourseName.setText(data.getCourse().getName());
        ((ViewHolder) holder).tvCourseHours.setText(data.getCourse().getHours());
        ((ViewHolder) holder).tvCoursePoints.setText(data.getCourse().getPoints());
        ((ViewHolder) holder).tvCourseDesc.setText(data.getCourse().getDescription());
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tvCourseHours)
        TextView tvCourseHours;
        @BindView(R.id.tvCourseName)
        TextView tvCourseName;
        @BindView(R.id.tvCoursePoints)
        TextView tvCoursePoints;
        @BindView(R.id.tvCourseDesc)
        TextView tvCourseDesc;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
