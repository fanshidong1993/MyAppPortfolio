package com.sdf.www.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int[] id = new int[]{
            R.id.portflio1,
            R.id.portflio2,
            R.id.portflio3,
            R.id.portflio4,
            R.id.portflio5,
            R.id.portflio6,

    };

    int[] content = new int[]{
            R.string.APP1,
            R.string.APP2,
            R.string.APP3,
            R.string.APP4,
            R.string.APP5,
            R.string.APP6,
    };

    public void onClick(View v){
        String TOASTString = "";
        for(int i = 0 ; i < id.length ; ++ i ){
            if(v.getId() == id[i]){
                TOASTString = getResources().getString(content[i]);
                break;
            }
        }
        Toast.makeText(MainActivity.this,"this button will launch my "+ TOASTString +" app", Toast.LENGTH_SHORT).show();
    }

}
