package com.pureintentions.hospital.PrescriptionHistory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.pureintentions.hospital.Doctor.History;
import com.pureintentions.hospital.Doctor.HistoryAdapter;
import com.pureintentions.hospital.R;

import static com.pureintentions.hospital.DoctorSearchScreen.Uid;
public class PrescriptionHistory extends AppCompatActivity {
    HistoryAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prescription_history);
        setUpRecyclerViewHistory();
    }
    private void setUpRecyclerViewHistory() {
        Intent intent1=getIntent();
        String UID= intent1.getStringExtra(Uid);
        FirebaseFirestore db=FirebaseFirestore.getInstance();
        CollectionReference reference=db.collection( "Prescription" );
        Query query=reference.whereEqualTo("Uid",UID);
        Query query1=reference.orderBy( "date", Query.Direction.ASCENDING);
        FirestoreRecyclerOptions<History> options=new FirestoreRecyclerOptions.Builder<History>().setQuery( query1,History.class ).build();
        adapter=new HistoryAdapter( options );
        RecyclerView recyclerView=findViewById( R.id.recycler_view );
        recyclerView.setHasFixedSize( true );
        recyclerView.setLayoutManager( new LinearLayoutManager( this) );
        recyclerView.setAdapter( adapter);
    }
}
