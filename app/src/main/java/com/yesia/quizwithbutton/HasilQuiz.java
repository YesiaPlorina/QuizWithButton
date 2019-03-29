package com.yesia.quizwithbutton;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HasilQuiz extends AppCompatActivity {

    @BindView(R.id.tv_hasil)
    TextView tvHasil;
    @BindView(R.id.tv_nilai)
    TextView tvNilai;
    @BindView(R.id.btn_ulangi)
    Button btnUlangi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_quiz);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_ulangi)
    public void onViewClicked() {
        Intent ulang = new Intent(HasilQuiz.this,MainActivity.class);
        startActivity(ulang);
    }
}
