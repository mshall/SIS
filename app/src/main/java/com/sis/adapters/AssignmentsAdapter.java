package com.sis.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gaurav.cdsrecyclerview.CdsRecyclerViewAdapter;
import com.sis.R;
import com.sis.pojo.StudentAssignment;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Mohamed S. El-Shall on 4/8/2017.
 */

public class AssignmentsAdapter extends CdsRecyclerViewAdapter<StudentAssignment.DataBean, AssignmentsAdapter.ViewHolder> {

    private Context mContext;

    public AssignmentsAdapter(Context context, List<StudentAssignment.DataBean> list) {
        super(context, list);
        mContext = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_list_assignments, parent, false));
    }

    //Cast the viewholder to your custom view holder and then use it
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        holder = (ViewHolder) holder;
        StudentAssignment.DataBean data = getList().get(position);
        ((ViewHolder) holder).tvCourseName.setText(data.getCourse_name().getName());
        ((ViewHolder) holder).tvAssignmentName.setText(data.getName());
        ((ViewHolder) holder).tvStartDate.setText(data.getStart_date());
        ((ViewHolder) holder).tvReceiveDate.setText(data.getRecive_date());
        ((ViewHolder) holder).tvNote.setText(data.getNotes());
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tvAssignmentName)
        TextView tvAssignmentName;
        @BindView(R.id.tvCourseName)
        TextView tvCourseName;
        @BindView(R.id.tvStartDate)
        TextView tvStartDate;
        @BindView(R.id.tvReceiveDate)
        TextView tvReceiveDate;
        @BindView(R.id.tvNote)
        TextView tvNote;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
