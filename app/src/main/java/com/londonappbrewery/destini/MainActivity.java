package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button btnTop;
    Button btnBottom;
    TextView storyText;
    int mStoryindex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        btnTop = (Button) findViewById(R.id.buttonTop);
        btnBottom = (Button) findViewById(R.id.buttonBottom);
        storyText = (TextView) findViewById(R.id.storyTextView);
        mStoryindex = 1;




            btnTop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (mStoryindex == 1){
                        storyText.setText(R.string.T3_Story);
                        btnTop.setText(R.string.T3_Ans1);
                        btnBottom.setText(R.string.T3_Ans2);
                        mStoryindex = 5;
                    } else if (mStoryindex == 5){
                        storyText.setText(R.string.T6_End);
                        btnTop.setVisibility(View.GONE);
                        btnBottom.setVisibility(View.GONE);
                    } else if (mStoryindex == 2){
                        storyText.setText(R.string.T4_End);
                        btnTop.setVisibility(View.GONE);
                        btnBottom.setVisibility(View.GONE);
                    }

                }
            });



        btnBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryindex == 1) {
                    storyText.setText(R.string.T2_Story);
                    btnTop.setText(R.string.T2_Ans1);
                    btnBottom.setText(R.string.T2_Ans2);
                    mStoryindex = 2;
                }else if (mStoryindex == 2){
                    storyText.setText(R.string.T4_End);
                    btnTop.setVisibility(View.GONE);
                    btnBottom.setVisibility(View.GONE);
                } else if (mStoryindex == 5){
                    storyText.setText(R.string.T5_End);
                    btnTop.setVisibility(View.GONE);
                    btnBottom.setVisibility(View.GONE);
                }
            }
        });
    }
}
