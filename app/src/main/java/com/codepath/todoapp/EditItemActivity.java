package com.codepath.todoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {
    EditText etNameItem;
    Button btSave;
    private int postiveItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        String nameItem = getIntent().getStringExtra("nameItem");
        postiveItem = getIntent().getIntExtra("positiveItem", 0);
        etNameItem = (EditText) findViewById(R.id.etNameItem);
        etNameItem.setText(nameItem);
        btSave = (Button) findViewById(R.id.btSave);
    }

    public void saveNameItem(View view) {
        Intent data = new Intent();
        data.putExtra("name", etNameItem.getText().toString());
        data.putExtra("positive", postiveItem);
        setResult(RESULT_OK, data);
        finish();
    }
}
