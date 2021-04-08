package com.example.login_liur;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainRecycler extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    privata Arraylis<Mahasiswa> mahasiswaArrayList;
}

protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    recyclerView = (RecyclerView) findViewById(R.id.rvdata);

    add Data();

    adapter = new MahasiswaAdapter(mahasiswaArrayList);

    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(context: MainActivity.this);
    recyclerView.setLayoutManager(layoutManager);
    recyclerView.setAdapter(adapter);

    void addData(){
        mahasiswaArraList = new ArrayList<>();
        mahasiswaArraList.add(new Mahasiswa(nama:"Deddy", nim:"312", nohp:"23412", email:"4fklasn"));
        mahasiswaArraList.add(new Mahasiswa(nama:"Irene", nim:"112", nohp:"63642", email:"adfhasn"));
        mahasiswaArraList.add(new Mahasiswa(nama:"Dadang", nim:"987", nohp:"92352", email:"jodgisa"));
    }
}
