package com.nikki.intentsfriends;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Nikhitha Tarala on 3/30/2017.
 */

public class FriendsNameActivity extends AppCompatActivity{


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_name);

        Intent intent = getIntent();
        String name =intent.getStringExtra("username");

        final TextView textView =(TextView)findViewById(R.id.tv_name);
        Log.d("name",name);


        textView.setText("Hi ! " +name);

        Button btnBack = (Button)findViewById(R.id.btn_back);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent1);
                textView.setText("");

            }
        });

    }
}
