package com.narsunreal.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){



        EditText enterNameTextField = (EditText) findViewById(R.id.enterNameTextField);

        Log.i("info", enterNameTextField.getText().toString());

        Toast.makeText(this, enterNameTextField.getText().toString(), Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
