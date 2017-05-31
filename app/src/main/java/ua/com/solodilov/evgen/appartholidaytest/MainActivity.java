package ua.com.solodilov.evgen.appartholidaytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            startFirstFragment();
        }
    }

    private void startFirstFragment() {
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container,PlusOneFragment.instantiate(this, PlusOneFragment.class.getCanonicalName()))
                .commit();
    }
}
