package com.example.joaquin.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //declaro variables
    private TextView mFactTextView;
    private Button mShowFactButton;
    private RelativeLayout relativeLayout;
    private FactBook factBook = new FactBook();
    private colorRandom colorRandom = new colorRandom();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mFactTextView = (TextView) findViewById(R.id.Fact_textView);
        mShowFactButton = (Button) findViewById(R.id.ShowFactbutton);
        relativeLayout = (RelativeLayout) findViewById(R.id.relative_layout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = factBook.getFact();
                int color = colorRandom.getColor();

                mFactTextView.setText(fact);
                relativeLayout.setBackgroundColor(color);
                mShowFactButton.setTextColor(color);

           }
        };
        mShowFactButton.setOnClickListener(listener);


    }
}
