package fr.yourdj.myapplication2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView monTexte = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

// MODIFIER TextView par "Bonjour, vous me devez 1 000 000€"
// public class MainActivity extends Activity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        TextView text = new TextView(this);
//        text.setText("Bonjour, vous me devez 1 000 000€.");
//        setContentView(text);
//    }

// POUR AFFICHER le contenu de la vue "activity_main"
// public class TroimsActivity extends Activity {
//  TextView monTexte = null;
//
//  @Override
//  public void onCreate(Bundle savedInstanceState) {
//    super.onCreate(savedInstanceState);
//    setContentView(R.layout.activity_main);
//
//    monTexte = (TextView)findViewById(R.id.text);
//    monTexte.setText("Le texte de notre TextView");
//  }
//}



//      Remplacer le texte par "Bonjour, vous me devez 1 000 000€."
//      TextView text = new TextView(this);
//      text.setText("Bonjour, vous me devez 1 000 000€.");
//      setContentView(text);


//    POUR AFFICHER "MY WAY 2" en remplacant "application" par "way"
//    String applicationName = getResources().getString(R.string.app_name);
//    Au lieu d'afficher "My Application" on va afficher "My way !"
//    pplicationName = applicationName.replace("Application", "way !");
//
//    TextView view = new TextView(this);
//    view.setText(applicationName);
//    setContentView(view);