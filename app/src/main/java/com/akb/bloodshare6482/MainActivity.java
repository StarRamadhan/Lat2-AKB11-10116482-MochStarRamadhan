package com.akb.bloodshare6482;

//        Nama  : Moch. Star Ramadhan
//        Nim   : 10116482
//        Kelas : AKB/IF - 11
//        Waktu Pengertaan Mulai Tanggal 18/04/2019
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
    }
    public void kePage2(View view) {
        Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
        startActivity(intent);
    }
}
