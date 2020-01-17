package com.pureintentions.hospital.Prescription;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pureintentions.hospital.R;

import java.util.List;

public class PrescriptionAdapter extends RecyclerView.Adapter<PrescriptionAdapter.PrescriptionHolder> {

    private Context context;
    private List<PrescriptionModel> prescriptionModels;

    public PrescriptionAdapter(Context context, List<PrescriptionModel> prescriptionModels) {
        this.context = context;
        this.prescriptionModels = prescriptionModels;
    }

    @NonNull
    @Override
    public PrescriptionHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.pres_item_list, parent, false);
        return new PrescriptionAdapter.PrescriptionHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull PrescriptionHolder holder, int position) {

    }


    public void onBindViewHolder(@NonNull PrescriptionAdapter holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class PrescriptionHolder extends RecyclerView.ViewHolder {
        TextView medcn_name,days,medcn_intake,qty,medc1_qty,medc1_day1,medc1;
        CheckBox chkbox_eve,chkbox_mrng,chkbox_aftrnoon;

        TextView hist_dates;

        public PrescriptionHolder(@NonNull View itemView) {
            super(itemView);
            hist_dates=itemView.findViewById(R.id.hist_dates);
          /*  medcn_name=itemView.findViewById(R.id.medcn_name);
            days=itemView.findViewById(R.id.days);
            medcn_intake=itemView.findViewById(R.id.medcn_intake);
            qty=itemView.findViewById(R.id.qty);
            chkbox_eve=itemView.findViewById(R.id.chkbox_eve);
            chkbox_mrng=itemView.findViewById(R.id.chkbox_mrng);
            chkbox_aftrnoon=itemView.findViewById(R.id.chkbox_aftrnoon);
            medc1=itemView.findViewById(R.id.medcn_name);*/


        }
    }
}