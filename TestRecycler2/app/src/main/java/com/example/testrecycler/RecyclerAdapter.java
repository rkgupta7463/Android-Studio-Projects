package com.example.testrecycler;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    Context context;
    ArrayList<contactModule> arrcont;


    RecyclerAdapter(Context context, ArrayList<contactModule> arrcont){
        this.context=context;
        this.arrcont= arrcont;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view =  LayoutInflater.from(context).inflate(R.layout.contact_row,parent,false);
       ViewHolder viewHolder = new ViewHolder(view);
       return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
    holder.image.setImageResource(arrcont.get(position).img);
    holder.txtname.setText(arrcont.get(position).name);
    holder.number.setText(arrcont.get(position).number);

    setAnimation(holder.itemView,position);

    holder.linearLayout.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Dialog dialog = new Dialog(context);
            dialog.setContentView(R.layout.addupdate);

            EditText editname = dialog.findViewById(R.id.diloagname);
            EditText editnum = dialog.findViewById(R.id.diloagnum);
            Button btnAction = dialog.findViewById(R.id.btnadd);
            TextView textView = dialog.findViewById(R.id.textview);

            textView.setText("Update Contact");
            btnAction.setText("Update");

            editname.setText((arrcont.get(position)).name);
            editnum.setText((arrcont.get(position)).number);

            btnAction.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String name="" , num="";
                    if (!editname.getText().toString().equals("") && !editnum.getText().toString().equals("")) {
                        name = editname.getText().toString();
                        num = editnum.getText().toString();
                    }
                    else
                    {
                        Toast.makeText(context, "Contact is not valid",Toast.LENGTH_SHORT).show();
                    }

                    arrcont.set(position, new contactModule(arrcont.get(position).img,name, num));
                    notifyItemChanged(position);

                    dialog.dismiss();
                }
            });

            dialog.show();
        }
    });

    holder.linearLayout.setOnLongClickListener(new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View view) {
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(context)
                    .setTitle("Delete Contact")
                    .setMessage("Are you sure delete this number?")
                    .setIcon(R.drawable.ic_baseline_delete_24)
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            arrcont.remove(position);
                            notifyItemRemoved(position);
                        }
                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });

            alertDialog.show();
            return true;
        }
    });
    }

    @Override
    public int getItemCount() {
        return arrcont.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtname,number;
        ImageView image;
        LinearLayout linearLayout;

        public ViewHolder(View itemView){
            super(itemView);

            txtname = itemView.findViewById(R.id.txtname);
            number = itemView.findViewById(R.id.txtnum);
            image = itemView.findViewById(R.id.imageView);
            linearLayout = itemView.findViewById(R.id.linearcont);
        }
    }

    private void setAnimation(View view , int position){
        Animation anim = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
    }
}
