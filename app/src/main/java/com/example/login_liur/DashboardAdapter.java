package com.example.login_liur;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DashboardAdapter extends RecyclerView.Adapter<DashboardAdapter.DashBoardHolder> {

    private ArrayList<SetterGetter> listdata;

    public DashboardAdapter(ArrayList<SetterGetter> listdata){
        this.listdata       =   listdata;
    }
    @NonNull
    @Override
    public DashBoardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view               = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dashboard,parent,false);
        DashBoardHolder holder  =  new DashBoardHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull DashBoardHolder holder, int position) {

        final SetterGetter getData       =  listdata.get(position);
        String titlemenu       =  getData.getTitle();
        String logomenu         = getData.getImg();

        holder.titleMenu.setText(titlemenu);

    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class DashBoardHolder extends RecyclerView.ViewHolder {

        TextView titleMenu;
        ImageView imgMenu;

        public DashBoardHolder(@NonNull View itemView) {
            super(itemView);

            titleMenu =  itemView.findViewById(R.id.tv_title_menu);
            imgMenu           =  itemView.findViewById(R.id.iv_holiday);

        }
    }
}