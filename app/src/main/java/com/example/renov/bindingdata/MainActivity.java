package com.example.renov.bindingdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        textView = (TextView) findViewById(R.id.text);
        textView.setText(HelloKt.formatMessage("Android with Kotlin"));

        textView.setOnClickListener(this::doSomeThing);
    }

    private void doSomeThing(View view) {
        Toast.makeText(this, "do Something !!", Toast.LENGTH_SHORT).show();
    }

}
