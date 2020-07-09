package com.kuuhaku.tuxapps;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity
{
    public static final String NAMA = "extra_name";
    public static final String DESKRIPSI = "extra_deskripsi";
    public static final String  VERSI = "extra_versi";
    public static final String  TIPE = "extra_tipe";
    public static final String  ARSITEKTUR = "extra_arsitektur";
    public static final String  RILIS = "extra_rilis";
    public static final String  TANGGAL = "extra_tanggal";
    public static final String  UKURAN  = "extra_ukuran";
    public static final String  IKON = "extra_ikon";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        setActionBarTitle();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView tvNama = findViewById(R.id.tv_item_nama);
        TextView tvDeskripsi = findViewById(R.id.tv_item_deskripsi);
        TextView tvVersi = findViewById(R.id.tv_item_versi);
        TextView tvTipe = findViewById(R.id.tv_item_tipe);
        TextView tvArsitektur = findViewById(R.id.tv_item_arsitektur);
        TextView tvRilis = findViewById(R.id.tv_item_rilis);
        TextView tvTanggal = findViewById(R.id.tv_item_tanggal);
        TextView tvUkuran = findViewById(R.id.tv_item_ukuran);
        ImageView imgIkon = findViewById(R.id.img_item_ikon);

        String nama = getIntent().getStringExtra(NAMA);
        String deskripsi = getIntent().getStringExtra(DESKRIPSI);
        String versi = getIntent().getStringExtra(VERSI);
        String tipe = getIntent().getStringExtra(TIPE);
        String arsitektur = getIntent().getStringExtra(ARSITEKTUR);
        String rilis = getIntent().getStringExtra(RILIS);
        String tanggal = getIntent().getStringExtra(TANGGAL);
        String ukuran = getIntent().getStringExtra(UKURAN);
        int ikon = getIntent().getIntExtra(IKON, 0);

        tvNama.setText(nama);
        tvDeskripsi.setText(deskripsi);
        tvVersi.setText(versi);
        tvTipe.setText(tipe);
        tvArsitektur.setText(arsitektur);
        tvRilis.setText(rilis);
        tvTanggal.setText(tanggal);
        tvUkuran.setText(ukuran);
        imgIkon.setImageResource(ikon);
    }

    private void setActionBarTitle() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Apps Details");
        }
    }
}
