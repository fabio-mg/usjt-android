package com.newidea.listarcursos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListarCursos extends AppCompatActivity {
    ArrayList<String> lista;
    Activity atividade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_cursos);

        lista = buscaCursos();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista);

        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);
    }

    public ArrayList<String> buscaCursos(){
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Curso de android");
        lista.add("Curso de paint");
        lista.add("Curso de office");
        lista.add("Curso de windows");
        lista.add("Curso de java 24 hrs");
        lista.add("Curso de maconha");
        lista.add("Curso de droga pesada");
        lista.add("Curso de teste");
        lista.add("Curso de 123");


        return lista;
    }

}
