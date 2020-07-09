package com.kuuhaku.tuxapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    private RecyclerView rvAplikasi;
    private ArrayList<App> isi_list = new ArrayList<>();
    
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        setActionBarTitle();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvAplikasi = findViewById(R.id.rv_aplikasi);
        rvAplikasi.setHasFixedSize(true);

        isi_list.addAll(AppsData.AmbilDataAplikasi());
        tampilkanRL();
    }

    private void tampilkanRL()
    {
        rvAplikasi.setLayoutManager(new LinearLayoutManager(this));
        ListAppAdapter listHA  = new ListAppAdapter(isi_list);
        rvAplikasi.setAdapter(listHA);

        listHA.setOnItemClickCallback(new ListAppAdapter.OnItemClickCallback()
        {
            @Override
            public void onItemClicked(App data)
            {
                detailActivity(data);
            }
        });
    }

    private void detailActivity(App Aplikasi)
    {
        Intent pindahDetail = new Intent(MainActivity.this, DetailActivity.class);
        pindahDetail.putExtra(DetailActivity.NAMA, Aplikasi.getNama());
        pindahDetail.putExtra(DetailActivity.DESKRIPSI, Aplikasi.getDeskripsi());
        pindahDetail.putExtra(DetailActivity.VERSI, Aplikasi.getVersi());
        pindahDetail.putExtra(DetailActivity.TIPE, Aplikasi.getTipe_paket());
        pindahDetail.putExtra(DetailActivity.ARSITEKTUR, Aplikasi.getArsitektur());
        pindahDetail.putExtra(DetailActivity.RILIS, Aplikasi.getRilis());
        pindahDetail.putExtra(DetailActivity.TANGGAL, Aplikasi.getTgl_rilis());
        pindahDetail.putExtra(DetailActivity.UKURAN, Aplikasi.getUkuran());
        pindahDetail.putExtra(DetailActivity.IKON, Aplikasi.getIkon());

        startActivity(pindahDetail);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.tombol_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        if (item.getItemId()==R.id.help)
        {
            startActivity(new Intent(this, HelpActivity.class));
        }
        else if (item.getItemId() == R.id.about)
        {
            startActivity(new Intent(MainActivity.this, AboutActivity.class));
        }
        return true;
    }

    private void setActionBarTitle() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Tux-Apps");
        }
    }
}


