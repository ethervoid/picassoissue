package com.thefrutos.picassoissue;

import android.app.ListActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ListActivity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        List<ListElement> listOfItems = generateTestItems();
        MainListAdapter adapter = new MainListAdapter(this,listOfItems);
        setListAdapter(adapter);
    }

    private List<ListElement> generateTestItems() {
        List<ListElement> itemLists = new ArrayList<ListElement>();
        for (int i=0;i<100;i++) {
            int imageId = 1329825 + i;
            ListElement item = new ListElement("http://static.supertruper.com/images/p/" + imageId, "Test elements " + i);
            itemLists.add(item);
        }
        return itemLists;
    }
}
