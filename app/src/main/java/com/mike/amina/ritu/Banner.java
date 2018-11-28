package com.mike.amina.ritu;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Banner extends AppCompatActivity {
    TextView banner_info;
   // private static final String BB = "BeReady";

    final static int [] berhasilt = {0};
   //


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner);

		MobileAds.initialize(this, getString(R.string.app_identity));


        Button ten_imp, five_imp;
        banner_info = findViewById(R.id.lol);
        ten_imp = findViewById(R.id.tn_clk);
        five_imp = findViewById(R.id.fv_clk);


        ten_imp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent banner_Int = new Intent( Banner.this, Banner_nd.class);
                startActivity ( banner_Int );
            }
        });

        five_imp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent banner_Int = new Intent( Banner.this, Banner_rd.class);
                startActivity ( banner_Int );
            }
        });

        // Ad Request for showing new ads
        AdView adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();

        adView.setAdListener(new AdListener(){
            @Override

            public void onAdLoaded() {

                super.onAdLoaded();
                berhasilt[0]++;
                banner_info.setText("Views : " +berhasilt[0]);

            }
        });
        adView.loadAd(adRequest);


        AdView adView2 = findViewById(R.id.adView2);
        AdRequest adRequest2 = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();

        adView2.setAdListener(new AdListener(){
            @Override

            public void onAdLoaded() {

                super.onAdLoaded();
                berhasilt[0]++;
                banner_info.setText("Views : " +berhasilt[0]);
            }
        });
        adView2.loadAd(adRequest2);

        AdView adView3 = findViewById(R.id.adView3);
        AdRequest adRequest3 = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();

        adView3.setAdListener(new AdListener(){
            @Override
            public void onAdLoaded() {

                super.onAdLoaded();
                berhasilt[0]++;
                banner_info.setText("Views : " +berhasilt[0]);
            }
        });
        adView3.loadAd(adRequest3);

        AdView adView4 = findViewById(R.id.adView4);
        AdRequest adRequest4 = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();


        adView4.setAdListener(new AdListener(){
            @Override

            public void onAdLoaded() {

                super.onAdLoaded();
                berhasilt[0]++;
                banner_info.setText("Views : " +berhasilt[0]);
            }
        });
        adView4.loadAd(adRequest4);


    }


    public static int getValue () {
        return berhasilt[0];
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_banner, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        Intent interstitialIntent = new Intent(Banner.this, MainActivity.class);
        startActivity(interstitialIntent);
        finish();
    }

}
