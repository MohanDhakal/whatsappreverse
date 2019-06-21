package com.agroproject.mohankumardhakal.firebaseapp;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;
import com.google.firebase.messaging.FirebaseMessaging;
public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private ViewPager mViewPager;
    private TabLayout mtabLayout;
    TabAccessorAdapter mtabAccessorAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //toolbar initializatioin
        mToolbar=findViewById(R.id.main_page_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("WhatsApp R");
        //view pager initialization
        mViewPager=findViewById(R.id.main_tab_pager);
        //tab layout
        mtabLayout=findViewById(R.id.main_tab);
       //viewpager adapter initialization
        mtabAccessorAdapter=new TabAccessorAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mtabAccessorAdapter);
        mtabLayout.setupWithViewPager(mViewPager);

//        FirebaseMessaging.getInstance().setAutoInitEnabled(true);

       }

    @Override
    protected void onResume() {
        super.onResume();
    }
}

  /*  Button getToken = findViewById(R.id.deviceToken);
        getToken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseInstanceId.getInstance().getInstanceId()
                        .addOnCompleteListener(new OnCompleteListener<InstanceIdResult>() {
                            @Override
                            public void onComplete(@NonNull Task<InstanceIdResult> task) {
                                if (!task.isSuccessful()) {
                                    Log.i("getInstanceId failed", String.valueOf(task.getException()));
                                    return;
                                }
                                // Get new Instance ID token
                                String token = task.getResult().getToken();
                                // Log and toast
                                String msg = getString(R.string.msg_token_fmt, token);
                                Log.i("message", msg);
                                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
                            }
                        });
            }
        });*/

