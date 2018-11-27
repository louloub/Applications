package fr.loulou.app7;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b1;
    Button b2;

    // "override" permet d'indiquer que l'on va redefinir une METHODE qui éxistait auparavant
    // dans la classe parente
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // "SUPER" : on fait appel à "ON CREATE" de la "ACTIVITY" (super classe de "MAIN ACTIVITY")
        super.onCreate(savedInstanceState);
        // Permet d'indiquer l'interface graphique de notre activité
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.B1);
        b2 = (Button) findViewById(R.id.B2);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // On crée un utilitaire de configuration pour cette animation
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink_anim);
                // On l'affecte au widget désiré, et on démarre l'animation
                b2.startAnimation(animation);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // On crée un utilitaire de configuration pour cette animation
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                // On l'affecte au widget désiré, et on démarre l'animation
                b1.startAnimation(animation);
            }
        });
    }

    public void onClick(View v) {
    }
}