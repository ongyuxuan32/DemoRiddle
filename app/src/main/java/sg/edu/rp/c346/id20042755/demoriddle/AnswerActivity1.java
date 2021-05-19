package sg.edu.rp.c346.id20042755.demoriddle;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class AnswerActivity1 extends AppCompatActivity {
    TextView tvAnswer;

    @Override
    protected void onStart() {
        Log.d("MainActivity", "onStart() called.");
        super.onStart();
    }
    @Override
    protected void onResume() {
        Log.d("MainActivity", "onResume() called.");
        super.onResume();
    }
    @Override
    protected void onPause() {
        Log.d("MainActivity", "onPause() called.");
        super.onPause();
    }
    @Override
    protected void onStop() {
        Log.d("MainActivity", "onStop() called.");
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        Log.d("MainActivity", "onDestroy() called.");
        super.onDestroy();
    }
    @Override
    protected void onRestart() {
        Log.d("MainActivity", "onRestart() called.");
        super.onRestart();
    }


    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_answer1);


        tvAnswer = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        String questionSelected = intentReceived.getStringExtra("Question");
        tvAnswer.setText(questionSelected + " answer is:Queue ");
        if(questionSelected.equalsIgnoreCase("q1")) {
            tvAnswer.setText(questionSelected + " answer is:Queue ");
        }
        else{
            tvAnswer.setText(questionSelected + " answer is:Gone ");
        }



    }


}
