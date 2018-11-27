package fr.yourdj.applicationanimation;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.imageView = (ImageView) findViewById(R.id.imageView);
    }
    imageView.setOnClickListener(new View.OnClickListener)

    {
        @Override
        public void onClick (View View){
        Intent otherActivity = new Intent(getApplicationContext(), CookieActivity.class);
        startActivity(otherActivity);
        finish();
    }

    }
}
