package com.example.pregnancy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class common4 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    //Variable assign
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    private ProgressBar progressBar;
    int progress=80;
    Button buttonArrowF;
    Button buttonArrowB;
    Button home;
    Button mom;
    Button child;
    Button item;
    Button hospital;
    Button kick;
    Button exercise;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common4);


        // Id Declaration
        drawerLayout = findViewById(R.id.drawerId);
        buttonArrowB = findViewById(R.id.buttonArrowB);
        buttonArrowF = findViewById(R.id.buttonArrowF);
        progressBar = findViewById(R.id.progressBar);
        home = findViewById(R.id.button2);
        mom =  findViewById(R.id.button3);
        child = findViewById(R.id.button4);
        item = findViewById(R.id.button8);
        kick = findViewById(R.id.button9);
        hospital = findViewById(R.id.button10);
        exercise = findViewById(R.id.button11);


        //match progress Bar
        progressBar.setProgress(progress);


        // Progress Bar  Forward Moving
        buttonArrowF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent1 = new Intent(common4.this,common5.class);
                startActivity(intent1);

            }
        });


        //Backward moving
        buttonArrowB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    Intent intent1 = new Intent(common4.this, common3.class);
                    startActivity(intent1);


            }
        });

        //home
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(common4.this, common.class);
                startActivity(intent1);

            }
        });

        //Hospital
        hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(common4.this, hospital.class);
                startActivity(intent1);

            }
        });


        //exercise
        exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(common4.this, exercise.class);
                startActivity(intent1);

            }
        });


        //navigation segment
        NavigationView navigationView = findViewById(R.id.navigationId);

        navigationView.setNavigationItemSelectedListener(this);

        toggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.nav_open,R.string.nav_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }



    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(toggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==R.id.homeMenuId) {
            Toast.makeText(common4.this, "Home item clicked", Toast.LENGTH_SHORT).show();
        }

        else if(item.getItemId()==R.id.profileMenuId) {
            Toast.makeText(common4.this, "Chat item clicked", Toast.LENGTH_SHORT).show();
        }

        else if(item.getItemId()==R.id.chatMenuId) {
            Toast.makeText(common4.this, "Chat item clicked", Toast.LENGTH_SHORT).show();
        }

        else if(item.getItemId()==R.id.shareMenuId) {
            Toast.makeText(common4.this, "Chat item clicked", Toast.LENGTH_SHORT).show();
        }

        else if(item.getItemId()==R.id.contactMenuId) {
            Toast.makeText(common4.this, "Chat item clicked", Toast.LENGTH_SHORT).show();
        }

        return false;
    }





}
