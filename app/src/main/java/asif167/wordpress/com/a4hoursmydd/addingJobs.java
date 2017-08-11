package asif167.wordpress.com.a4hoursmydd;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class addingJobs extends AppCompatActivity {

    Button btnAdd, btnCancl;
    private int REQUEST_CODE=1;
    Fragment fragment;
    FragmentManager fragmentManager;
    BottomNavigationView navigation;
    FragmentTransaction transaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adding_jobs);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnAdd = (Button) findViewById(R.id.btnNext);
        btnCancl = (Button) findViewById(R.id.btnCancel);

        fragmentManager = getSupportFragmentManager();
        fragment = new addPage1();
        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.content, fragment).commit();

        
        btnCancl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }

}
