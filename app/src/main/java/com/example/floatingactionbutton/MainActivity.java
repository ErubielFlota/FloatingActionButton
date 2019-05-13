package com.example.floatingactionbutton;


import android.animation.Animator;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

import com.github.fafaldo.fabtoolbar.widget.FABToolbarLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{




/*
        FloatingActionButton fab=(FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Se presionó el FAB", Snackbar.LENGTH_LONG).setAction("Action",null).show();
            }
        });
    }*/

 /* Animacion de el boton que al precionarlo gire

final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setScaleX(0);
        fab.setScaleY(0);

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            final Interpolator interpolador = AnimationUtils.loadInterpolator(getBaseContext(),
                    android.R.interpolator.fast_out_slow_in);

            fab.animate()
                    .scaleX(1)
                    .scaleY(1)
                    .setInterpolator(interpolador)
                    .setDuration(600)
                    .setStartDelay(1000)
                    .setListener(new Animator.AnimatorListener() {
                        @Override
                        public void onAnimationStart(Animator animation) {

                        }

                        @Override
                        public void onAnimationEnd(Animator animation) {
                            fab.animate()
                                    .scaleY(0)
                                    .scaleX(0)
                                    .setInterpolator(interpolador)
                                    .setDuration(600)
                            .start();

                        }

                        @Override
                        public void onAnimationCancel(Animator animation) {

                        }

                        @Override
                        public void onAnimationRepeat(Animator animation) {

                        }
                    });
        }
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Se presionó el FAB", Snackbar.LENGTH_LONG).show();
            }
        });
*/

/*
        boolean click = false;

        @Override
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
            fab.setImageResource(R.drawable.plus);

            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    click=!click;
                    if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                        Interpolator interpolador = AnimationUtils.loadInterpolator(getBaseContext(),
                                android.R.interpolator.fast_out_slow_in);

                        view.animate()
                                .rotation(click ? 45f : 0)
                                .setInterpolator(interpolador)
                                .start();
                    }
                }
            });*/

        private FABToolbarLayout morph;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);


                FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
                morph = (FABToolbarLayout) findViewById(R.id.fabtoolbar);

                View uno, dos, tres, cuatro;

                uno = findViewById(R.id.uno);
                dos = findViewById(R.id.dos);
                cuatro = findViewById(R.id.cuatro);
                tres = findViewById(R.id.tres);

                fab.setOnClickListener(this);
                uno.setOnClickListener(this);
                dos.setOnClickListener(this);
                tres.setOnClickListener(this);
                cuatro.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {
                if (v.getId() == R.id.fab) {
                        morph.show();
                }

                morph.hide();
        }





        }











