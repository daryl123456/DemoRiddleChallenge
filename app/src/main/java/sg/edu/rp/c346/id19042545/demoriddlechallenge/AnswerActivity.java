package sg.edu.rp.c346.id19042545.demoriddlechallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        tvAnswer = findViewById(R.id.textView);

        Intent intent=getIntent();
        String q = intent.getStringExtra("Question");
        if (q.equals("Q1")){
            tvAnswer.setText(q+ " answer is: Queue");
        }else{
            tvAnswer.setText(q+ " answer is: Gone");
        }
    }
}
