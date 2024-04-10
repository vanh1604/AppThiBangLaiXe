package com.hktstudio.thibanglaixe.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import ca.barrenechea.widget.recyclerview.decoration.StickyHeaderAdapter;

public class AdapterRecyclerViewDangNhap extends RecyclerView.Adapter<AdapterRecyclerViewBienBao.RecyclerViewHolder> implements StickyHeaderAdapter<AdapterRecyclerViewBienBao.HeaderHolder> {

    @Override
    public AdapterRecyclerViewBienBao.RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(AdapterRecyclerViewBienBao.RecyclerViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public long getHeaderId(int position) {
        return 0;
    }

    @Override
    public AdapterRecyclerViewBienBao.HeaderHolder onCreateHeaderViewHolder(ViewGroup parent) {
        return null;
    }

    @Override
    public void onBindHeaderViewHolder(AdapterRecyclerViewBienBao.HeaderHolder viewholder, int position) {

    }
}
