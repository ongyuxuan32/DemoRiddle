package sg.edu.rp.c346.id20042755.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class AnswerActivity2 extends AppCompatActivity {
    TextView tvAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);

        tvAnswer = findViewById(R.id.textView2);
        Intent intentReceived = getIntent();
        String q = intentReceived.getStringExtra("Question");
        tvAnswer.setText(q + " answer is gone ");



    }
}