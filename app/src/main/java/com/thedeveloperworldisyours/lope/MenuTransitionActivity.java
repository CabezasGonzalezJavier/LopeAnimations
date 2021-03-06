package com.thedeveloperworldisyours.lope;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.thedeveloperworldisyours.lope.transition.CollapsingToolbarActivity;
import com.thedeveloperworldisyours.lope.transition.ElementStartActivity;
import com.thedeveloperworldisyours.lope.transition.VerticalRecyclerViewActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MenuTransitionActivity extends AppCompatActivity {

    @BindView(R.id.menu_transition_activity_toolbar)
    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_transition_activity);

        ButterKnife.bind(this);

        mToolbar.setTitle("");
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void back(View view) {
        finishMyActivity();
    }

    @Override
    public void onBackPressed() {
        finishMyActivity();
    }

    public void finishMyActivity() {
        finish();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finishMyActivity();
                break;
        }
        return true;
    }


    public void goToElementTransition(View view) {
        Intent intent = new Intent(this, ElementStartActivity.class);
        startActivity(intent);
    }

    public void goToElementRecyclerView(View view) {
        Intent intent = new Intent(this, VerticalRecyclerViewActivity.class);
        startActivity(intent);
    }

    public void goToCollapsing(View view) {
        Intent intent = new Intent(this, CollapsingToolbarActivity.class);
        startActivity(intent);
    }
}
