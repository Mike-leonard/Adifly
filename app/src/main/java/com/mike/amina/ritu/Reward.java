package com.mike.amina.ritu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import java.util.Locale;

public class Reward extends AppCompatActivity implements RewardedVideoAdListener {
	
	Button mButton;
	Button lButton;
	TextView mLog;
	RewardedVideoAd mRewardedVideoAd;

   @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_reward);
		
		
		mLog = findViewById(R.id.tv_log);
		mButton = findViewById(R.id.btn_show);
		mButton.setEnabled(false);
		lButton = findViewById(R.id.btn_ld);
		
		
		// Use an activity context to get the rewarded video instance.

		mButton.setOnClickListener (new View.OnClickListener(){
			
			@Override
			public void onClick (View view) {
				mButton.setEnabled(false);
				if (mRewardedVideoAd.isLoaded()) {
					mRewardedVideoAd.show();
				}
			}
		});

	   lButton.setOnClickListener (new View.OnClickListener(){
			@Override
			public void onClick (View view) {
			loadRewardedVideoAd();
			}
		});
		

		
		
		MobileAds.initialize(this, getString(R.string.app_identity));
		
		mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(this);
		mRewardedVideoAd.setRewardedVideoAdListener(this);
	}
	
	private void loadRewardedVideoAd() {
		mRewardedVideoAd.loadAd( getString(R.string.admob_reward_id), new AdRequest.Builder().build());
				
	}
	
	
	
	@Override
    public void onRewardedVideoAdLoaded() {
		mLog.append("An ad has Loaded.\n");
		mButton.setEnabled(true);
		
    }

    @Override
    public void onRewardedVideoAdOpened() {

    }

    @Override
    public void onRewardedVideoStarted() {

    }

    @Override
    public void onRewardedVideoAdClosed() {

    }

    @Override
    public void onRewarded(RewardItem rewardItem) {
		mLog.append(String.format(Locale.getDefault(),
		"You Received %d %s!\n", rewardItem.getAmount(), rewardItem.getType()));
    }

    @Override
    public void onRewardedVideoAdLeftApplication() {
		mLog.append("An ad has Caused focus to leave.\n");
    }

    @Override
    public void onRewardedVideoAdFailedToLoad(int i) {
       mLog.append("An ad has Failed to Load.\n");
    }

    @Override
    public void onRewardedVideoCompleted() {

    }
}


