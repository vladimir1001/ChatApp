package com.example.vladimir.chatapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ChatList extends AppCompatActivity {

    String[] names = { "sp15-1", "sp15-1","sp15-1","sp15-1", "sp15-1", "sp15-1", "sp15-1", "sp15-1" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_list);
        ListView lv = (ListView) findViewById(R.id.ChatListView);
        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
        // присваиваем адаптер списку
        lv.setAdapter(adapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ChatList", "ChatListActivity: onStart()");
    }
}
