package de.com.rost.fcap;

import android.app.ListActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class RealtiesListActivity extends ListActivity{

    public ArrayList<Realty> realtiesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realties_list);
        // Update the source list
        getRealtiesList();

        setListAdapter(new ContentListAdapter(this, realtiesList));
    }

    public void getRealtiesList() {

        if(realtiesList==null)
            realtiesList = new ArrayList<Realty>();

        realtiesList.add(new Realty("Musterhaus 1", "160128", "empty", this));
        realtiesList.add(new Realty("Musterhaus 2", "160128", "empty", this));
        realtiesList.add(new Realty("Musterhaus 3", "160128", "empty", this));
        realtiesList.add(new Realty("Musterhaus 4", "160128", "empty", this));
        realtiesList.add(new Realty("Musterhaus 5", "160128", "empty", this));
        realtiesList.add(new Realty("Musterhaus 6", "160128", "empty", this));
        realtiesList.add(new Realty("Musterhaus 7", "160128", "empty", this));
        realtiesList.add(new Realty("Musterhaus 8", "160128", "empty", this));
        realtiesList.add(new Realty("Musterhaus 9", "160128", "empty", this));
        realtiesList.add(new Realty("Musterhaus 0", "160128", "empty", this));
}

}
