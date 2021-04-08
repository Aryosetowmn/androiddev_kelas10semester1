package com.example.login_liur;

import android.view.LayoutInflater;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MahasiswaAdapter extends RecylerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder> {

    private ArrayList<Mahasiswa>datalist;

    public MahasiswaAdapter(ArrayList<Mahasiswa> datalist) {
        this.datalist = datalist;
    }

    @Override
    public MahasiswaViewHolder onCreateViewHolder (ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.Layout.itemview, parent, attachToRoot:false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder (MahasiswaViedHolder holder, int position){
        holder.txtNama.setText(datalist.get(position).getNama());
        holder.txtNim.setText(datalist.get(position).getNim());
        holder.txtNohp.setText(datalist.get(position).getNohp());
        holder.txtEmail.setText(datalist.get(position).getEmail());
    }

    public int getItemCount() {return(datalist != null) ? datalist.size() : 0;}

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder{
        private TextView txtnama, txtnim, txtnohp, txtemail;

        public MahasiswaViewHolder(View itemView){
            super(itemView);
            txtnama = (TextView) itemView.findViewById(R.id.txt_nama_mahasiswa);
            txtnim = (TextView) itemView.findViewById(R.id.txt_nim_mahasiswa);
            txtnohp = (TextView) itemView.findViewById(R.id.txt_nohp_mahasiswa);
            txtemail = (TextView) itemView.findViewById(R.id.txt_email_mahasiswa);
        }
    }
}
