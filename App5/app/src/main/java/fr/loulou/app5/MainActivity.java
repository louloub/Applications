package fr.loulou.app5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // On récupère le boutton par son identifiant dans le XML
        Button button1 = findViewById(R.id.button1);
        // On lui indique que cette class sera son listener pour tel événement
        button1.setOnClickListener(this);


    }
    // BOUTTON QUI FONCTIONNE AVEC ONECLICKLISTENER
    // Fonction qui sera lancée à chaque click
    @Override
    public void onClick(View v) {
        // "switch" est une condition
        // variable "v.getId"
        switch (v.getId()) {
            // argument de "case" : "R.id.button&"
            // "v.getId" = quelle est l'ID de la "view" (v) = button1, "case" est validé on lance l'action
            case R.id.button1:
                // action
                Toast.makeText(this, "Button 1 clicked", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}