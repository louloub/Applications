package fr.loulou.app9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import fr.loulou.app9.adapter.RobotsItemAdapter;
import fr.loulou.app9.models.RobotsItem;

public class MainActivity extends AppCompatActivity {

    ListView view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // C'est à partir de ce moment que le fichier XML est désérialisé et qu'il est possible de récupérer les différentes vues qui le compose
        setContentView(R.layout.activity_main);

        // list view items
        // Liste de l'objet "RobotsItem" appelé "RobotsItemList", c'est égale à une nouvelle "ArrayList"
        List<RobotsItem> RobotsItemList = new ArrayList<>();

        // Nouvelles instances de l'objet "RobotsItem"
        RobotsItemList.add(new RobotsItem("Stephane le Robot", "Ce petit robot sait faire plein de choses", "1239€", "r1"));
        RobotsItemList.add(new RobotsItem("Loic le Robot", "Gros robot mmécanicien dérnière génération", "935€", "r2"));
        RobotsItemList.add(new RobotsItem("Patricia la Robot", "Danseuse à ces heures perdues", "855€", "r3"));

        // get list view
        // récuperation de la listeview  "Robot List View" dans "vue"
        ListView view = findViewById(R.id.robot_list_view);
        view.setAdapter(new RobotsItemAdapter(this, RobotsItemList));

        /*
        // Création d'un adapter pour afficher les boutton sur le coté
        ArrayAdapter<RobotsItem> adapter = new ArrayAdapter<RobotsItem>(MainActivity.this, android.R.layout.simple_list_item_single_choice);
        view.setAdapter(adapter);
        */
    }
}