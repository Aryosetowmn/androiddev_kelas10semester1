package com.example.login_liur;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<SetterGetter> datamenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_menu);
    }

    public void addData(){
        datamenu = new ArrayList<>();
        datamenu.add(new SetterGetter("Paket Data1", "logomenu1"));
        datamenu.add(new SetterGetter("Paket Data2", "logomenu2"));
        datamenu.add(new SetterGetter("Paket Data3", "logomenu3"));
        datamenu.add(new SetterGetter("Paket Data4", "logomenu4"));
        datamenu.add(new SetterGetter("Paket Data5", "logomenu5"));
        datamenu.add(new SetterGetter("Paket Data6", "logomenu6"));
        datamenu.add(new SetterGetter("Paket Data7", "logomenu7"));
        datamenu.add(new SetterGetter("Paket Data8", "logomenu8"));
        datamenu.add(new SetterGetter("Paket Data9", "logomenu9"));
    }
}
