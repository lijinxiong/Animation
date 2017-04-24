package com.demo.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {


    FrameLayout mFrameLayout;
    ImageView mImageView;
    boolean scaled;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mImageView = (ImageView) this.findViewById(R.id.image_scale);
        mFrameLayout = (FrameLayout) this.findViewById(R.id.root_view);

        mFrameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (scaled) {
                    scaled = false;
                    ScaleAnimation scaleAnimation = new ScaleAnimation(2.5f, 1.0f, 2.5f, 1.0f,
                            Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                    scaleAnimation.setDuration(2000);
                    scaleAnimation.setFillAfter(true);
                    mImageView.startAnimation(scaleAnimation);
                }
            }
        });


        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!scaled) {

                    ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 2.5f, 1.0f, 2.5f,
                            Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                    scaleAnimation.setDuration(2000);
                    scaleAnimation.setFillAfter(true);
                    mImageView.startAnimation(scaleAnimation);
                    scaled = true;
                } else {
                    scaled = false;
                    ScaleAnimation scaleAnimation = new ScaleAnimation(2.5f, 1.0f, 2.5f, 1.0f,
                            Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                    scaleAnimation.setDuration(2000);
                    scaleAnimation.setFillAfter(true);
                    mImageView.startAnimation(scaleAnimation);

                }

            }
        });
    }


    @Override
    public void onBackPressed() {

        if (scaled) {
            scaled = false;
            ScaleAnimation scaleAnimation = new ScaleAnimation(2.5f, 1.0f, 2.5f, 1.0f,
                    Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
            scaleAnimation.setDuration(2000);
            scaleAnimation.setFillAfter(true);
            mImageView.startAnimation(scaleAnimation);
        } else {

            super.onBackPressed();
        }
    }
}
