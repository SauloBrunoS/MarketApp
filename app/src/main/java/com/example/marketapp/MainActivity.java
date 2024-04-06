package com.example.marketapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv_menu_restaurante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_menu_restaurante = findViewById(R.id.rv_menu_restaurante);

        ArrayList<OpcaoDoMenu> opcoesDoMenu = new ArrayList<>();

        opcoesDoMenu.add(new OpcaoDoMenu("Frutas", "Frutas frescas do jardim", R.drawable.frutas));
        opcoesDoMenu.add(new OpcaoDoMenu("Vegetais", "Vegetais crus ou cozidos", R.drawable.vegetais));
        opcoesDoMenu.add(new OpcaoDoMenu("Padaria", "Diversos tipos de pães e massas", R.drawable.padaria));
        opcoesDoMenu.add(new OpcaoDoMenu("Bebidas", "Suco, café, chá e refrigerantes", R.drawable.bebidas));
        opcoesDoMenu.add(new OpcaoDoMenu("Sobremesas", "Deliciosas sobremesas caseiras", R.drawable.sobremesa));
        opcoesDoMenu.add(new OpcaoDoMenu("Saladas", "Saladas frescas e saudáveis", R.drawable.saladas));
        opcoesDoMenu.add(new OpcaoDoMenu("Sanduíches", "Diversos tipos de sanduíches", R.drawable.sanduiches));
        opcoesDoMenu.add(new OpcaoDoMenu("Sushis", "Variedade de sushis e sashimis", R.drawable.sushis));
        opcoesDoMenu.add(new OpcaoDoMenu("Pizzas", "Pizzas tradicionais e gourmet", R.drawable.pizzas));

        OpcaoDoMenuArrayListAdapter opcaoDoMenuArrayListAdapter = new OpcaoDoMenuArrayListAdapter(R.layout.opcao_menu_layout, opcoesDoMenu);

        rv_menu_restaurante.setLayoutManager(new LinearLayoutManager(this));

        rv_menu_restaurante.setAdapter(opcaoDoMenuArrayListAdapter);

    }
}