package com.example.vsvll.optionmenu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        linearLayout = findViewById(R.id.linearLayout);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu,menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){

            case R.id.profile:
                textView.setText("Profile");
                linearLayout.setBackgroundColor(Color.BLUE);
                break;
            case R.id.setting:
                textView.setText("Settings");
                linearLayout.setBackgroundColor(Color.GREEN);

                break;
            case R.id.signOut:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
