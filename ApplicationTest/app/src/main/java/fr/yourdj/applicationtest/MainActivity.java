package fr.yourdj.applicationtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String applicationName = getResources().getString(R.string.app_name);
        // Au lieu d'afficher "My Application" on va afficher "My way !"
        applicationName = applicationName.replace("Application", "way !");

        TextView view = new TextView(this);
        view.setText(applicationName);

        setContentView(view);
    }
}


