package com.mike.amina.ritu;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Interstial extends AppCompatActivity {
    // Remove the below line after defining your own ad unit ID.
    private static final String TOAST_TEXT = "Devoloped By MiKe LeoNard";

    final static int [] interst_count = {0};
    TextView mLevel;
    private Button rd_ads, fv_ads, tn_ads, onefv_ads;
    private InterstitialAd  interstitial1, interstitial2, interstitial3, interstitial4, interstitial5,
            interstitial6, interstitial7, interstitial8, interstitial9, interstitial10,
            interstitial11,interstitial12,interstitial13,interstitial14,interstitial15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interstial);

        MobileAds.initialize(this, getString(R.string.app_identity));
		

        // Shower Interstial Button
        rd_ads = ((Button) findViewById(R.id.rd_bt));
        fv_ads = ((Button) findViewById(R.id.fv_bt));
        tn_ads = ((Button) findViewById(R.id.tn_bt));
        onefv_ads = ((Button) findViewById(R.id.onefv_bt));

        // Ads Shower Button onclick LIsatener

        rd_ads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                interstitial1();
                interstitial2();
                interstitial3();
            }
        });


        fv_ads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                interstitial4();
                interstitial5();
                interstitial6();
                interstitial7();
                interstitial8();
				
            }
        });


        tn_ads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                interstitial9();
                interstitial10();
                interstitial1();
                interstitial2();
                interstitial3();
                interstitial4();
                interstitial5();
                interstitial6();
                interstitial7();
                interstitial8();
            }
        });


        onefv_ads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                interstitial15();
                interstitial14();
                interstitial13();
                interstitial12();
                interstitial11();
                interstitial10();
                interstitial9();
                interstitial8();
                interstitial7();
                interstitial6();
                interstitial5();
                interstitial4();
                interstitial3();
                interstitial2();
                interstitial1();
            }
        });


        // Create the text view to show the level number.
        mLevel = (TextView) findViewById(R.id.level);
        //mLevel = START_LEVEL;

        // Toasts the test ad message on the screen. Remove this after defining your own ad unit ID.
        Toast.makeText(this, TOAST_TEXT, Toast.LENGTH_LONG).show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_interstial, menu);
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

    private void interstitial1() {
        AdRequest adRequest1 = new AdRequest.Builder().build();
        interstitial1 = new InterstitialAd(this);
        interstitial1.setAdUnitId(getString(R.string.admob_interstitial_id1));
        interstitial1.loadAd(adRequest1);
        interstitial1.setAdListener(new AdListener() {
            public void onAdLoaded() {
                if (interstitial1.isLoaded()) {
                    interstitial1.show();
                    interst_count[0]++;
                    mLevel.setText("Views : " + interst_count[0]);
                }
            }
        });
    } 
	
	private void interstitial2() {
        AdRequest adRequest2 = new AdRequest.Builder().build();
        interstitial2 = new InterstitialAd(this);
        interstitial2.setAdUnitId(getString(R.string.admob_interstitial_id1));
        interstitial2.loadAd(adRequest2);
        interstitial2.setAdListener(new AdListener() {
            public void onAdLoaded() {
                if (interstitial2.isLoaded()) {
                    interstitial2.show();
                    interst_count[0]++;
                    mLevel.setText("Views : " + interst_count[0]);
                }
            }
        });
    } 
	
	private void interstitial3() {
        AdRequest adRequest3 = new AdRequest.Builder().build();
        interstitial3 = new InterstitialAd(this);
        interstitial3.setAdUnitId(getString(R.string.admob_interstitial_id1));
        interstitial3.loadAd(adRequest3);
        interstitial3.setAdListener(new AdListener() {
            public void onAdLoaded() {
                if (interstitial3.isLoaded()) {
                    interstitial3.show();
                    interst_count[0]++;
                    mLevel.setText("Views : " + interst_count[0]);
                }
            }
        });
    }

    private void interstitial4() {
        AdRequest adRequest4 = new AdRequest.Builder().build();
        interstitial4 = new InterstitialAd(this);
        interstitial4.setAdUnitId(getString(R.string.admob_interstitial_id1));
        interstitial4.loadAd(adRequest4);
        interstitial4.setAdListener(new AdListener() {
            public void onAdLoaded() {
                if (interstitial4.isLoaded()) {
                    interstitial4.show();
                    interst_count[0]++;
                    mLevel.setText("Views : " + interst_count[0]);
                }
            }
        });
    }

    private void interstitial5() {
        AdRequest adRequest5 = new AdRequest.Builder().build();
        interstitial5 = new InterstitialAd(this);
        interstitial5.setAdUnitId(getString(R.string.admob_interstitial_id1));
        interstitial5.loadAd(adRequest5);
        interstitial5.setAdListener(new AdListener() {
            public void onAdLoaded() {
                if (interstitial5.isLoaded()) {
                    interstitial5.show();
                    interst_count[0]++;
                    mLevel.setText("Views : " + interst_count[0]);
                }
            }
        });
    }

    private void interstitial6() {
        AdRequest adRequest6 = new AdRequest.Builder().build();
        interstitial6 = new InterstitialAd(this);
        interstitial6.setAdUnitId(getString(R.string.admob_interstitial_id1));
        interstitial6.loadAd(adRequest6);
        interstitial6.setAdListener(new AdListener() {
            public void onAdLoaded() {
                if (interstitial6.isLoaded()) {
                    interstitial6.show();
                    interst_count[0]++;
                    mLevel.setText("Views : " + interst_count[0]);
                }
            }
        });
    }

    private void interstitial7() {
        AdRequest adRequest7 = new AdRequest.Builder().build();
        interstitial7 = new InterstitialAd(this);
        interstitial7.setAdUnitId(getString(R.string.admob_interstitial_id1));
        interstitial7.loadAd(adRequest7);
        interstitial7.setAdListener(new AdListener() {
            public void onAdLoaded() {
                if (interstitial7.isLoaded()) {
                    interstitial7.show();
                    interst_count[0]++;
                    mLevel.setText("Views : " + interst_count[0]);
                }
            }
        });
    }

    private void interstitial8() {
        AdRequest adRequest8 = new AdRequest.Builder().build();
        interstitial8 = new InterstitialAd(this);
        interstitial8.setAdUnitId(getString(R.string.admob_interstitial_id1));
        interstitial8.loadAd(adRequest8);
        interstitial8.setAdListener(new AdListener() {
            public void onAdLoaded() {
                if (interstitial8.isLoaded()) {
                    interstitial8.show();
                    interst_count[0]++;
                    mLevel.setText("Views : " + interst_count[0]);
                }
            }
        });
    }

    private void interstitial9() {
        AdRequest adRequest9 = new AdRequest.Builder().build();
        interstitial9 = new InterstitialAd(this);
        interstitial9.setAdUnitId(getString(R.string.admob_interstitial_id1));
        interstitial9.loadAd(adRequest9);
        interstitial9.setAdListener(new AdListener() {
            public void onAdLoaded() {
                if (interstitial9.isLoaded()) {
                    interstitial9.show();
                    interst_count[0]++;
                    mLevel.setText("Views : " + interst_count[0]);
                }
            }
        });
    }

    private void interstitial10() {
        AdRequest adRequest10 = new AdRequest.Builder().build();
        interstitial10 = new InterstitialAd(this);
        interstitial10.setAdUnitId(getString(R.string.admob_interstitial_id1));
        interstitial10.loadAd(adRequest10);
        interstitial10.setAdListener(new AdListener() {
            public void onAdLoaded() {
                if (interstitial10.isLoaded()) {
                    interstitial10.show();
                    interst_count[0]++;
                    mLevel.setText("Views : " + interst_count[0]);
                }
            }
        });
    }

    private void interstitial11() {
        AdRequest adRequest11 = new AdRequest.Builder().build();
        interstitial11 = new InterstitialAd(this);
        interstitial11.setAdUnitId(getString(R.string.admob_interstitial_id1));
        interstitial11.loadAd(adRequest11);
        interstitial11.setAdListener(new AdListener() {
            public void onAdLoaded() {
                if (interstitial11.isLoaded()) {
                    interstitial11.show();
                    interst_count[0]++;
                    mLevel.setText("Views : " + interst_count[0]);
                }
            }
        });
    }

    private void interstitial12() {
        AdRequest adRequest12 = new AdRequest.Builder().build();
        interstitial12 = new InterstitialAd(this);
        interstitial12.setAdUnitId(getString(R.string.admob_interstitial_id1));
        interstitial12.loadAd(adRequest12);
        interstitial12.setAdListener(new AdListener() {
            public void onAdLoaded() {
                if (interstitial12.isLoaded()) {
                    interstitial12.show();
                    interst_count[0]++;
                    mLevel.setText("Views : " + interst_count[0]);
                }
            }
        });
    }

    private void interstitial13() {
        AdRequest adRequest13 = new AdRequest.Builder().build();
        interstitial13 = new InterstitialAd(this);
        interstitial13.setAdUnitId(getString(R.string.admob_interstitial_id1));
        interstitial13.loadAd(adRequest13);
        interstitial13.setAdListener(new AdListener() {
            public void onAdLoaded() {
                if (interstitial13.isLoaded()) {
                    interstitial13.show();
                    interst_count[0]++;
                    mLevel.setText("Views : " + interst_count[0]);
                }
            }
        });
    }

    private void interstitial14() {
        AdRequest adRequest14 = new AdRequest.Builder().build();
        interstitial14 = new InterstitialAd(this);
        interstitial14.setAdUnitId(getString(R.string.admob_interstitial_id1));
        interstitial14.loadAd(adRequest14);
        interstitial14.setAdListener(new AdListener() {
            public void onAdLoaded() {
                if (interstitial14.isLoaded()) {
                    interstitial14.show();
                    interst_count[0]++;
                    mLevel.setText("Views : " + interst_count[0]);
                }
            }
        });
    }

    private void interstitial15() {
        AdRequest adRequest15 = new AdRequest.Builder().build();
        interstitial15 = new InterstitialAd(this);
        interstitial15.setAdUnitId(getString(R.string.admob_interstitial_id1));
        interstitial15.loadAd(adRequest15);
        interstitial15.setAdListener(new AdListener() {
            public void onAdLoaded() {
                if (interstitial15.isLoaded()) {
                    interstitial15.show();
                    interst_count[0]++;
                    mLevel.setText("Views : " + interst_count[0]);
                }
            }
        });
    }


    public static int getValue () {
        return interst_count[0];
    }

    @Override
    public void onBackPressed() {
        Intent interstitialIntent = new Intent(Interstial.this, MainActivity.class);
        startActivity(interstitialIntent);
        finish();
    }
}