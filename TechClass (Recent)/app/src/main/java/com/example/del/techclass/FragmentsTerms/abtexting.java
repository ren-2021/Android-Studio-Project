package com.example.del.techclass.FragmentsTerms;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.del.techclass.R;

public class abtexting extends AppCompatActivity {

    Toolbar mToolbar;
    MenuInflater inflater;
    MenuItem mSearch;
    SearchView mSearchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abtexting);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        inflater = getMenuInflater();
        getMenuInflater().inflate(R.menu.searchmenu, menu);
        mSearch = menu.findItem(R.id.action_search);
        mSearchView = (SearchView) mSearch.getActionView();
        mSearchView.setQueryHint("Search");
        return super.onCreateOptionsMenu(menu);

    }
}
