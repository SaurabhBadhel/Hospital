package com.pureintentions.hospital.PrescriptionHistory;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pureintentions.hospital.R;

import java.util.List;

public class PrescriptionHistoryAdapter extends RecyclerView.Adapter<PrescriptionHistoryAdapter.PresriptionHistoryHolder> {
    private Context context;
    private List<PrescriptionHistoryModel> prescriptionHistoryModels;


    public PrescriptionHistoryAdapter(Context context, List<PrescriptionHistoryModel> prescriptionHistoryModel) {
        this.context = context;
        this.prescriptionHistoryModels = prescriptionHistoryModel;
    }

    @NonNull
    @Override
    public PrescriptionHistoryAdapter.PresriptionHistoryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.pres_item_list, parent, false);
        return new PrescriptionHistoryAdapter.PresriptionHistoryHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PrescriptionHistoryAdapter.PresriptionHistoryHolder holder, int position) {
        PrescriptionHistoryModel prescriptionHistoryModel = prescriptionHistoryModels.get(position);
        holder.hist_dates.setText(prescriptionHistoryModel.getDate());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class PresriptionHistoryHolder extends RecyclerView.ViewHolder {
        TextView hist_dates;

        public PresriptionHistoryHolder(@NonNull View itemView) {
            super(itemView);
            hist_dates=itemView.findViewById(R.id.hist_dates);
        }
    }
}
