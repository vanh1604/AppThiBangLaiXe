package com.hktstudio.thibanglaixe.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.hktstudio.thibanglaixe.Object.CauHoi;
import com.hktstudio.thibanglaixe.R;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    List<CauHoi> listCauHoi;
    Context context;
    LayoutInflater mInflater;

    public MyAdapter(Context context, List<CauHoi> listCauHoi) {
        this.listCauHoi = listCauHoi;
        this.context = context;
        mInflater = LayoutInflater.from(context);
    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.layout_recyclerview_lythuyet, parent,false);
        return new RecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        CauHoi data = listCauHoi.get(position);
        holder.A.setText(data.getCauHoi());
        holder.B.setText(data.getCauHoi());
        holder.C.setText(data.getCauHoi());
        holder.D.setText(data.getCauHoi());
    }

    @Override
    public int getItemCount() {
        return listCauHoi.size();
    }
}


class RecyclerViewHolder extends RecyclerView.ViewHolder{
    TextView tv_cauHoi,tv_dapAn, tv_stt;
    ImageView anhCauHoi;
    TextView A,B,C,D;
    View view_A, view_B, view_C, view_D, view_B_, view_C_;
    public RecyclerViewHolder(View itemView) {
        super(itemView);
        tv_stt = itemView.findViewById(R.id.tv_stt);
        tv_cauHoi = itemView.findViewById(R.id.tv_cauHoi);
        tv_dapAn = itemView.findViewById(R.id.tv_dapAn);
        anhCauHoi = itemView.findViewById(R.id.anhCauHoi);
        A = itemView.findViewById(R.id.A);
        B = itemView.findViewById(R.id.B);
        C = itemView.findViewById(R.id.C);
        D = itemView.findViewById(R.id.D);
        view_A = itemView.findViewById(R.id.view_A);
        view_B = itemView.findViewById(R.id.view_B);
        view_C = itemView.findViewById(R.id.view_C);
        view_D = itemView.findViewById(R.id.view_D);
        view_B_ = itemView.findViewById(R.id.view_B_);
        view_C_ = itemView.findViewById(R.id.view_C_);
    }
}