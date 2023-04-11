package com.example.olio_vk11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddItemActivity extends AppCompatActivity {

    private EditText editItem;
    private EditText editInformation;

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        context = this;
    }

    public void addItem(View view) {
        editItem = (EditText) findViewById(R.id.newItem);
        String newItem = editItem.getText().toString();
        editInformation = (EditText) findViewById(R.id.information);
        String information = editInformation.getText().toString();

        ItemStorage.getInstance().addItem(new Item(newItem,information));
    }

    public void switchToMainActivity(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}