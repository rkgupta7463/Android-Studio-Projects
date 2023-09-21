package com.example.recyclert;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{

    Context context;
    ArrayList<contactModule> contarray;

    RecyclerAdapter(Context context, ArrayList<contactModule> contarray){
        this.contarray = contarray;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.contact_row,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.txtname.setText(contarray.get(position).name);
        holder.number.setText(contarray.get(position).number);
    }

    @Override
    public int getItemCount() {
        return contarray.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtname,number;
        LinearLayout linearLayout;

        public ViewHolder(View view){
            super(view);
            txtname=view.findViewById(R.id.contname);
            number=view.findViewById(R.id.contnumber);

            linearLayout = view.findViewById(R.id.linearView);
        }
    }
}
