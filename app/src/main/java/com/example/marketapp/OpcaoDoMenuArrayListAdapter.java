package com.example.marketapp;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OpcaoDoMenuArrayListAdapter extends RecyclerView.Adapter<OpcaoDoMenuArrayListAdapter.ViewHolder> {
    private int opcaoDoMenuLayout;
    private ArrayList<OpcaoDoMenu> opcaoDoMenuList;

    public OpcaoDoMenuArrayListAdapter(int layoutId, ArrayList<OpcaoDoMenu> opcaoDoMenuList){
        opcaoDoMenuLayout = layoutId;
        this.opcaoDoMenuList = opcaoDoMenuList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(opcaoDoMenuLayout, parent, false);
        ViewHolder myViewHolder = new ViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TextView  tv_nome_opcao_menu_item = holder.tv_nome_opcao_menu_item;
        TextView tv_descricao_opcao_menu_item = holder.tv_descricao_opcao_menu_item;
        ImageView iv_opcao_menu_item = holder.iv_opcao_menu_item;
        tv_nome_opcao_menu_item.setText(opcaoDoMenuList.get(position).getNomeOpcao());
        tv_descricao_opcao_menu_item.setText(opcaoDoMenuList.get(position).getDescricaoOpcao());
        iv_opcao_menu_item.setBackgroundResource(opcaoDoMenuList.get(position).getImagemOpcao());
    }

    @Override
    public int getItemCount() {
        return opcaoDoMenuList == null ? 0 : opcaoDoMenuList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView iv_opcao_menu_item;
        public TextView tv_nome_opcao_menu_item;
        public TextView tv_descricao_opcao_menu_item;

        public ViewHolder (View opcaoDoMenuView){
            super(opcaoDoMenuView);
            opcaoDoMenuView.setOnClickListener(this);
            iv_opcao_menu_item = opcaoDoMenuView.findViewById(R.id.iv_opcao_menu_item);
            tv_nome_opcao_menu_item = opcaoDoMenuView.findViewById(R.id.tv_nome_opcao_menu_item);
            tv_descricao_opcao_menu_item = opcaoDoMenuView.findViewById(R.id.tv_descricao_opcao_menu_item);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(v.getContext(), "Você clicou em " + tv_nome_opcao_menu_item.getText(), Toast.LENGTH_SHORT).show();
        }
    }

}
