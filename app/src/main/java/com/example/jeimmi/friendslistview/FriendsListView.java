package com.example.jeimmi.friendslistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FriendsListView extends AppCompatActivity {
    String [] friends = {"Dennis","David","GG"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friends_list_view);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.list_adapter, friends);

        ListView listView = (ListView) findViewById(R.id.friend_lv);
        listView.setAdapter(adapter);


    }
}
