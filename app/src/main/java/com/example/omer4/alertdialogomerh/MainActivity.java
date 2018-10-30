package com.example.omer4.alertdialogomerh;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
AlertDialog.Builder adb,adb2,adb3,adb4,adb5;
Button b1,b2,b3,b4,b5;
LinearLayout screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen=findViewById(R.id.screen2);

        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("credits");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent t=new Intent(this,Credits.class);
        startActivity(t);
        return super.onOptionsItemSelected(item);
    }

    public void dialog1(View view) {
        adb=new AlertDialog.Builder(this);
        adb.setMessage("Message");
        adb.setTitle("Dialog 1");
        AlertDialog ad=adb.create();
        ad.show();
    }



    public void dialog3(View view) {
        adb3=new AlertDialog.Builder(this);
        adb3.setMessage("Message icon and button");
        adb3.setTitle("Dialog 3");
        adb3.setIcon(R.drawable.cutedroid);
        adb3.setNeutralButton("close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog ad2=adb3.create();
        ad2.show();
    }

    public void dialog4(View view) {
        adb4=new AlertDialog.Builder(this);
        adb4.setMessage("Message and 2 buttons");
        adb4.setTitle("Dialog 4");
        adb4.setNegativeButton("Random color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                screen.setBackgroundColor(color);
            }
        });
        adb4.setPositiveButton("I like this color!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog ad3=adb4.create();
        ad3.show();
    }

    public void dialog5(View view) {
        adb5=new AlertDialog.Builder(this);
        adb5.setMessage("Message and 3 buttons");
        adb5.setPositiveButton("Random color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                screen.setBackgroundColor(color);
            }
        });
        adb5.setNegativeButton("reset screen", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
               screen.setBackgroundColor(Color.WHITE);
            }
        });
    adb5.setNeutralButton("I like this color!", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.cancel();
        }
    });
        AlertDialog ad4=adb5.create();
        ad4.show();
    }

    public void dialog2(View view) {
        adb2=new AlertDialog.Builder(this);
        adb2.setMessage("Message and Icon");
        adb2.setTitle("Dialog 2");
        adb2.setIcon(R.drawable.cutedroid);
        AlertDialog ad1=adb2.create();
        ad1.show();
    }
}
