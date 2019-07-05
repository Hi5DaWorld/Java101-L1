package com.example.androidhangman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    char pw[] = new char[20];
    String str[] = new String[]{"galaxy","structure","refrigerator","turtle","ostrich","caramel","chocolate","kangaroo","umbrella",
            "caterpillar","elephant","penguin","robot","ribbon","alien","skunk","jackal","donkey","shark","leopard","jaguar",
            "badger","raccoon","eagle","monkey","beaver"};

    char uc[] = new char[50]; //used character
    int nuc = 0; //number of used characters

    int cu = 0; //count underscores

    Random rand = new Random();
    int a = rand.nextInt(str.length);

    int t = 7;

    boolean dead = false;
    boolean win = false;
    String ref = str[a];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView Stand = (ImageView) findViewById(R.id.Stand);
        final ImageView Head = (ImageView) findViewById(R.id.Head);
            Head.setVisibility(View.INVISIBLE);
        final ImageView Torso = (ImageView) findViewById(R.id.Torso);
            Torso.setVisibility(View.INVISIBLE);
        final ImageView Arm1 = (ImageView) findViewById(R.id.Arm1);
            Arm1.setVisibility(View.INVISIBLE);
        final ImageView Arm2 = (ImageView) findViewById(R.id.Arm2);
            Arm2.setVisibility(View.INVISIBLE);
        final ImageView Leg1 = (ImageView) findViewById(R.id.Leg1);
            Leg1.setVisibility(View.INVISIBLE);
        final ImageView Leg2 = (ImageView) findViewById(R.id.Leg2);
            Leg2.setVisibility(View.INVISIBLE);
        final ImageView Tail = (ImageView) findViewById(R.id.Tail);
            Tail.setVisibility(View.INVISIBLE);
        final Button EnterButton = (Button) findViewById(R.id.EnterButton);
        final EditText EnterLetter = (EditText) findViewById(R.id.EnterLetter);
        final TextView WordDisplay = (TextView) findViewById(R.id.WordDisplay);
        final TextView Title = (TextView) findViewById(R.id.Title);
        final TextView MessageDisplay = (TextView) findViewById(R.id.MessageDisplay);
        final TextView MessageDisplay2 = (TextView) findViewById(R.id.MessageDisplay2);
        final TextView MessageDisplay3 = (TextView) findViewById(R.id.MessageDisplay3);


//---------------------------------------------//


        for(int i = 0;i<str[a].length();i++){
            pw[i] = '_';
        }


//---------------------------------------------//


        EnterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText EnterLetter = (EditText) findViewById(R.id.EnterLetter);


                char x = EnterLetter.getText().charAt(0);


                int w = (str[a].length());

                boolean check = false;
                for (int p=0;p<w;p++){
                    char y = str[a].charAt(p);
                    if (x == y){

                        pw[p] = x;
                        check = true;
                    }
                    else{


                    }

                }

                String txt = String.copyValueOf(pw);
                WordDisplay.setText(txt);

                boolean checkChar = false; //checks if we used the input already
                if(check == true){

                }
                else{
                    for(int i = 0;i<nuc;i++){
                        if(uc[i]==x){
                            checkChar = true;
                        }
                    }

                    t = t-1;

                    if(checkChar==true){
                        t++;
                        MessageDisplay.setText("You already tried this letter.");
                    }
                    else{
                        uc[nuc] = x;
                        nuc++;
                    }

                }

                if(checkChar==false){
                    MessageDisplay.setText("You have "+t+" lives left.");
                }

                cu = 0;

                for(int i = 0; i < str[a].length(); i++){
                    if(pw[i]=='_'){
                        cu++;
                    }
                }
                if(cu==0){
                    win = true;
                    MessageDisplay.setText("Congrats! You won the game of smol hangman!! Now go brag to your friends.");
                    MessageDisplay2.setText("WORD: "+str[a]);
                    MessageDisplay3.setText("You had "+t+" lives left.");
                }

                if (t == 0){
                    dead = true;
                    Tail.setVisibility(View.VISIBLE);
                    MessageDisplay.setText("Oof. Better luck next time!");
                    MessageDisplay2.setText("WORD: "+str[a]);
                }

                if (t == 6){
                    Head.setVisibility(View.VISIBLE);
                }

                if (t == 5){
                    Torso.setVisibility(View.VISIBLE);
                }

                if (t == 4){
                    Arm1.setVisibility(View.VISIBLE);
                }

                if (t == 3){
                    Arm2.setVisibility(View.VISIBLE);
                }

                if (t == 2) {
                    Leg1.setVisibility(View.VISIBLE);
                }

                if (t == 1){
                    Leg2.setVisibility(View.VISIBLE);
                }



            }
        });














    }
}
