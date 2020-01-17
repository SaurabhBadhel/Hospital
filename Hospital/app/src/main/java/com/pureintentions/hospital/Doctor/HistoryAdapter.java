package com.pureintentions.hospital.Doctor;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.pureintentions.hospital.R;

public class HistoryAdapter extends FirestoreRecyclerAdapter<History, HistoryAdapter.HistoryHolder> {

    public HistoryAdapter(@NonNull FirestoreRecyclerOptions<History> options) {
        super( options );
    }

    @Override
    protected void onBindViewHolder(@NonNull HistoryHolder historyHolder, int i, @NonNull History history) {
        historyHolder.nameList1.setText( history.getName() );
        historyHolder.dateList1.setText( history.getDate());
    }

    @NonNull
    @Override
    public HistoryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from( parent.getContext() ).inflate( R.layout.list_history,parent,false );
        return new HistoryHolder(v);
    }

    class HistoryHolder extends RecyclerView.ViewHolder {
        TextView nameList1;
        TextView dateList1;
        public HistoryHolder(@NonNull View itemView) {

            super( itemView );
            nameList1=itemView.findViewById( R.id.nameList1 );
            dateList1=itemView.findViewById( R.id.dateList1 );

        }
    }
}
