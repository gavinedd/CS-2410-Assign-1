package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Declare the layout
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);

        // Define Params
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        // First text view
        AppCompatTextView firstTextView = new AppCompatTextView(this);
        firstTextView.setText("Adjective");

        // First edit text
        final AppCompatEditText firstEditText = new AppCompatEditText(this);
        firstEditText.setLayoutParams(params);

        // Second text view
        AppCompatTextView secondTextView = new AppCompatTextView(this);
        secondTextView.setText("Adjective");

        // Second edit text
        final AppCompatEditText secondEditText = new AppCompatEditText(this);
        secondEditText.setLayoutParams(params);

        // Third text view
        AppCompatTextView thirdTextView = new AppCompatTextView(this);
        thirdTextView.setText("Noun");

        // Third edit text
        final AppCompatEditText thirdEditText = new AppCompatEditText(this);
        thirdEditText.setLayoutParams(params);

        // Fourth text view
        AppCompatTextView fourthTextView = new AppCompatTextView(this);
        fourthTextView.setText("Noun");

        // Fourth edit text
        final AppCompatEditText fourthEditText = new AppCompatEditText(this);
        fourthEditText.setLayoutParams(params);

        // Fifth text view
        AppCompatTextView fifthTextView = new AppCompatTextView(this);
        fifthTextView.setText("Animal (Plural)");

        // Fifth edit text
        final AppCompatEditText fifthEditText = new AppCompatEditText(this);
        fifthEditText.setLayoutParams(params);

        // Text View for the message
        AppCompatTextView madLibMsg = new AppCompatTextView(this);
        madLibMsg.setText("");

        // Button
        AppCompatButton button = new AppCompatButton(this);
        button.setText("Generate Mad Lib");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstInput = firstEditText.getText().toString();
                String secondInput = secondEditText.getText().toString();
                String thirdInput = thirdEditText.getText().toString();
                String fourthInput = fourthEditText.getText().toString();
                String fifthInput = fifthEditText.getText().toString();
                madLibMsg.setText("A vacation is when you take a trip to some " + firstInput + "" +
                        " place with your " + secondInput + " family. Usually you go to some place that is near " +
                        "a/an " + thirdInput + " or up on a/an " + fourthInput + ". A good vacation place is one where" +
                        "you can ride " + fifthInput + " or play twister.");

                setContentView(madLibMsg);


            }
        });

        // Add children to layout
        layout.addView(firstTextView);
        layout.addView(firstEditText);
        layout.addView(secondTextView);
        layout.addView(secondEditText);
        layout.addView(thirdTextView);
        layout.addView(thirdEditText);
        layout.addView(fourthTextView);
        layout.addView(fourthEditText);
        layout.addView(fifthTextView);
        layout.addView(fifthEditText);
        layout.addView(button);

        setContentView(layout);










    }
}