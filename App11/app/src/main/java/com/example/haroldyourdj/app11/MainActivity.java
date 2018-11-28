package com.example.haroldyourdj.app11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        public class RepertoireAdapter extends BaseAdapter {
            /**
             * Récupérer un item de la liste en fonction de sa position
             * @param position - Position de l'item à récupérer
             * @return l'item récupéré
             */
            public Object getItem(int position) {
                // …
            }

            /**
             * Récupérer l'identifiant d'un item de la liste en fonction de sa position (plutôt utilisé dans le cas d'une
             * base de données, mais on va l'utiliser aussi)
             * @param position - Position de l'item à récupérer
             * @return l'identifiant de l'item
             */
            public long getItemId(int position) {
                // …
            }

            /**
             * Explication juste en dessous.
             */
            public View getView(int position, View convertView, ViewGroup parent) {
                //…
            }
        }
    }
}
