package com.kuuhaku.tuxapps;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListAppAdapter extends RecyclerView.Adapter<ListAppAdapter.peganganList>
{
    private ArrayList<App> isi_list_aplikasi;

    ListAppAdapter(ArrayList<App> isi_list)
    {
        this.isi_list_aplikasi = isi_list;
    }

    @NonNull
    @Override
    public peganganList onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType)
    {
        View tampilan = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_app, viewGroup, false);
        return new peganganList(tampilan);
    }

    @Override
    public void onBindViewHolder(@NonNull final peganganList pegangan, int posisi)
    {
        App aplikasi = isi_list_aplikasi.get(posisi);
        Glide.with(pegangan.itemView.getContext())
                .load(aplikasi.getIkon())
                .apply(new RequestOptions().override(55, 55))
                .into(pegangan.imgIkon);
        pegangan.tvNama.setText(aplikasi.getNama());
        pegangan.tvDeskripsi.setText(aplikasi.getDeskripsi());


        pegangan.itemView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(isi_list_aplikasi.get(pegangan.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount()
    {
        return isi_list_aplikasi.size();
    }

    static class peganganList extends RecyclerView.ViewHolder
    {
        ImageView imgIkon;
        TextView tvNama, tvDeskripsi;

        peganganList(@NonNull View itemView)
        {
            super(itemView);

            imgIkon = itemView.findViewById(R.id.img_item_ikon);
            tvNama = itemView.findViewById(R.id.tv_item_nama);
            tvDeskripsi = itemView.findViewById(R.id.tv_item_deskripsi);
        }
    }

    private OnItemClickCallback onItemClickCallback;
    void setOnItemClickCallback(OnItemClickCallback onItemClickCallback)
    {
        this.onItemClickCallback = onItemClickCallback;
    }

    public interface OnItemClickCallback {
        void onItemClicked(App data);
    }
}
