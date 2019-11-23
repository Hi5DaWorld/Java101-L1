package com.example.mainactivity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Random;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText guess;
    private Button button;
    private TextView output;
    private int value = 0;

    Random rand = new Random();
    int number = rand.nextInt(100);

    int i = 0;

    public void newGame() {
        number = rand.nextInt(100) + 1;
        output.setText(output.getText().toString() + " Time for a new game!");
        i = 0;
    }

    public static void hideKeyboard(Context context, View view) {
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Activity.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public void checkGuess(int val) {
        if (i < 7) {
            if (val > 0) {
                if (val <= 100) {
                    if (val < number)
                        output.setText(val + " is too low!");
                    else if (val > number)
                        output.setText(val + " is too high!");
                    else {
                        output.setText(val + " is correct!");
                        newGame();
                    }
                    i++;
                } else
                    output.setText(val + " is over the limit!");
            } else
                output.setText(val + " is under the limit!");
        } else {
            output.setText("You failed...");
            newGame();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        guess = findViewById(R.id.guess);
        button = findViewById(R.id.button);
        output = findViewById(R.id.output);

        number = rand.nextInt(100) + 1;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    hideKeyboard(getApplicationContext(), v);
                    checkGuess(Integer.parseInt(guess.getText().toString().trim()));
                } catch (Exception e) {
                    output.setText(e.toString());
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}