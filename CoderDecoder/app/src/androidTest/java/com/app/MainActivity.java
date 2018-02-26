package com.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.nyanm.coderdecoder.R;

public class MainActivity extends AppCompatActivity {

    private String Stringinput = "";
    private int key;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText input = (EditText) findViewById(R.id.inputText);

        final TextView output = (TextView) findViewById(R.id.outputView);

        final TextView keyTxt = (TextView) findViewById(R.id.keyText);


        Button encode = (Button) findViewById(R.id.encoderButton);
        encode.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Stringinput = input.getText().toString();
                        key = Integer.parseInt(keyTxt.getText().toString());
                        Encoder e = new Encoder(Stringinput, key);
                        output.setText(e.toString());
                        //Debug
                        //output.setText(Stringinput);
                    }
                }
        );

        Button decode = (Button) findViewById(R.id.decodebutton);
        decode.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {
                        Stringinput = input.getText().toString();
                        key = Integer.parseInt(keyTxt.getText().toString());
                        Decoder d = new Decoder(Stringinput, key);
                        output.setText(d.toString());
                    }
                }
        );


    }

}
