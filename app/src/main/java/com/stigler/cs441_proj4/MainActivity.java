package com.stigler.cs441_proj4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    TextView inputLabel;
    EditText inputBox;
    TableLayout table;
    ArrayList<TableRow> rowList;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputLabel = (TextView) findViewById(R.id.labelText);
        inputBox = (EditText) findViewById(R.id.inputBox);
        table = (TableLayout) findViewById(R.id.theTable);
        rowList = new ArrayList<>();
    }

    public void addButton( View view)
    {
        /*inputLabel.setText(inputBox.getText().toString());
        inputBox.setText("");*/
        TableRow tRow = new TableRow(this);
        TextView words = new TextView(this);
        words.setText("Please work");
        tRow.addView(words, 0);
        table.addView(tRow);
        rowList.add(tRow);
    }

    public void removeButton(View view)
    {
        //
    }
}