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

public class Banner_rd extends AppCompatActivity {
    // Remove the below line after defining your own ad unit ID.
    final static int[] berhasilt = {Banner.getValue()};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner_rd);

        MobileAds.initialize(this, getString(R.string.app_identity));

        Button bto_home;

        final TextView banner_count = (TextView) findViewById(R.id.fv_bann_cunt);
        bto_home =(Button) findViewById(R.id.main_page);

        bto_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent banner_Int_home = new Intent( Banner_rd.this, MainActivity.class);
                startActivity ( banner_Int_home );
            }
        });
        // Load an ad into the AdMob banner view.
        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);

        AdView adView2 = (AdView) findViewById(R.id.adView2);
        AdRequest adRequest2 = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView2.loadAd(adRequest2);

        AdView adView3 = (AdView) findViewById(R.id.adView3);
        AdRequest adRequest3 = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView3.loadAd(adRequest3);

        AdView adView4 = (AdView) findViewById(R.id.adView4);
        AdRequest adRequest4 = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView4.loadAd(adRequest4);

        AdView adView5 = (AdView) findViewById(R.id.adView5);
        AdRequest adRequest5 = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView5.loadAd(adRequest5);

        adView.setAdListener(new AdListener(){
            @Override

            public void onAdLoaded() {

                super.onAdLoaded();
                berhasilt[0]++;
                banner_count.setText("Views : " + berhasilt[0]);
            }
        });

        adView2.setAdListener(new AdListener(){
            @Override

            public void onAdLoaded() {

                super.onAdLoaded();
                berhasilt[0]++;
                banner_count.setText("Views : " + berhasilt[0]);
            }
        });

        adView3.setAdListener(new AdListener(){
            @Override

            public void onAdLoaded() {

                super.onAdLoaded();
                berhasilt[0]++;
                banner_count.setText("Views : " + berhasilt[0]);
            }
        });

        adView4.setAdListener(new AdListener(){
            @Override

            public void onAdLoaded() {

                super.onAdLoaded();
                berhasilt[0]++;
                banner_count.setText("Views : " + berhasilt[0]);
            }
        });

        adView5.setAdListener(new AdListener(){
            @Override

            public void onAdLoaded() {

                super.onAdLoaded();
                berhasilt[0]++;
                banner_count.setText("Views : " + berhasilt[0]);
            }
        });


    }

    public static int getValue () {
        return berhasilt[0];
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_banner_rd, menu);
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
        Intent interstitialIntent = new Intent(Banner_rd.this, Banner.class);
        startActivity(interstitialIntent);
        finish();
    }
}
