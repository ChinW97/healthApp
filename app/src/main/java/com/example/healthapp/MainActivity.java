package com.example.healthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    private Button NAButton;
    private FirebaseDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //database = FirebaseDatabase.getInstance();
        //final DatabaseReference myRef = database.getReference("HelpLines");

        /**NAButton = (Button) findViewById(R.id.NAButton);
        NAButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        })

        **/
    }

    public void onHelpLines(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.na.org/meetingsearch/"));
        startActivity(intent);
    }


}
