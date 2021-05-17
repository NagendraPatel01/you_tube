package com.hackerkernel.youtube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SearchActivity extends AppCompatActivity {

    EditText edit;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        edit=findViewById(R.id.edit);
        btn=findViewById(R.id.btn);

      /*  btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String search= edit.getText().toString();

                Intent intent=new Intent(SearchActivity.this,MainActivity.class);

                intent.putExtra("video",search);

                startActivity(intent);
            }
        });*/
    }
}