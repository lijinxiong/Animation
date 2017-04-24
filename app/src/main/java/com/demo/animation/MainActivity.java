package com.demo.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView noIterpolator;
    ImageView alphaImageView;
    Button startAnimationButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alphaImageView = (ImageView) this.findViewById(R.id.alpha_animation_image_view);
        noIterpolator = (ImageView) this.findViewById(R.id.no_interpolator);
        startAnimationButton = (Button) this.findViewById(R.id.start_animation);
        startAnimationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
/***
 * AlphaAnimation
 *
 */
//                java 代码实现

//                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
//                alphaAnimation.setDuration(1000);
//                alphaImageView.startAnimation(alphaAnimation);
//                alphaImageView.startAnimation(AnimationUtils.loadAnimation(MainActivity.this,
//                        R.anim.alpha));
                //set 作为xml的根元素
//                alphaImageView.startAnimation(AnimationUtils.loadAnimation(MainActivity.this,
//                        R.anim.set_alpha));


                /**
                 * ScaleAnimation
                 *
                 */

//                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.5f, 1.0f, 1.5f);
//                scaleAnimation.setDuration(2000);
//                scaleAnimation.setFillAfter(true);
//                alphaImageView.startAnimation(scaleAnimation);

//                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.5f, 1.0f, 1.5f,
//                        Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
//                scaleAnimation.setDuration(2000);
//                scaleAnimation.setFillAfter(true);
//                alphaImageView.startAnimation(scaleAnimation);


//                TranslateAnimation translateAnimation = new TranslateAnimation(0, 100, 0, 100);
//                translateAnimation.setDuration(2000);
//                translateAnimation.setFillAfter(true);
//                alphaImageView.startAnimation(translateAnimation);

//                TranslateAnimation translateAnimation = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 0.5f,
//                        Animation.RELATIVE_TO_SELF, 1.0f, Animation.ABSOLUTE, 0, Animation.ABSOLUTE, 0
//                );
//
//                translateAnimation.setDuration(2000);
//                translateAnimation.setFillAfter(true);
//                alphaImageView.startAnimation(translateAnimation);


//                alphaImageView.setVisibility(View.VISIBLE);
//                alphaImageView.setAnimation(AnimationUtils.makeInAnimation(MainActivity.this, false));


//                RotateAnimation rotateAnimation = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f,
//                        Animation.RELATIVE_TO_SELF, 0.5f);
//                rotateAnimation.setDuration(2000);
//                rotateAnimation.setFillAfter(true);
//                alphaImageView.startAnimation(rotateAnimation);


                alphaImageView.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.aimation_set_interpolator));
//                noIterpolator.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.animation_set));


            }

        });


    }
}
