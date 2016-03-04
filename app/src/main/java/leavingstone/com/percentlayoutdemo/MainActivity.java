package leavingstone.com.percentlayoutdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import leavingstone.com.percentlayoutdemo.adapter.MyAdapter;
import leavingstone.com.percentlayoutdemo.model.SimpleModelItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        fillListView();
    }


    private ListView listView;

    /**
     * fill listView with dummy data
     */
    private void initViews(){
        listView = (ListView) findViewById(R.id.list_view_id);

    }

    private void fillListView(){
        List<SimpleModelItem> itemList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            itemList.add(new SimpleModelItem("HELLO",R.drawable.screen_shot));
        }

        MyAdapter myAdapter = new MyAdapter(itemList,this);
        listView.setAdapter(myAdapter);
    }
}
