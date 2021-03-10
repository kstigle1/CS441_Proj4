package com.stigler.cs441_proj4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView inputLabel;
    EditText inputBox;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputLabel = (TextView) findViewById(R.id.labelText);
        inputBox = (EditText) findViewById(R.id.inputBox);
    }

    public void buttonPress( View view)
    {
        inputLabel.setText(inputBox.getText().toString());
        inputBox.setText("");
    }
}