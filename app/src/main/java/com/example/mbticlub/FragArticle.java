package com.example.mbticlub;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class FragArticle extends AppCompatActivity {
    EditText editText;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getIntent();
        setContentView(R.layout.frag5_communityarticle);
    }
}