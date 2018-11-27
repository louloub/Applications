package fr.loulou.app6anim;

// Import des "CLASSES"
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b;

    // "override" permet d'indiquer que l'on va redefinir une METHODE qui éxistait auparavant
    // dans la classe parente
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // "SUPER" : on fait appel à "ON CREATE" de la "ACTIVITY" (super classe de "MAIN ACTIVITY")
        super.onCreate(savedInstanceState);
        // Permet d'indiquer l'interface graphique de notre activité
        setContentView(R.layout.activity_main);

        b = (Button) findViewById(R.id.buttonAnim);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // On crée un utilitaire de configuration pour cette animation
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                // On l'affecte au widget désiré, et on démarre l'animation
                b.startAnimation(animation);
            }
        });
    }
}
