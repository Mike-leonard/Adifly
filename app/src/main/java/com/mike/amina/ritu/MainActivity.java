package com.mike.amina.ritu;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView banner_text , interst_text, total_text;
    @SuppressLint("SetTextI18n")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext() ,  "First Check Rules & Terms " ,Toast.LENGTH_LONG).show();

        Button ban_btn, int_btn, rwd_btn, rules_btn;

        ban_btn =(Button) findViewById(R.id.banner_btn);
        int_btn =(Button) findViewById(R.id.inters_btn);
        rwd_btn =(Button) findViewById(R.id.reward_btn);
        rules_btn = (Button) findViewById( R.id.rules_shower) ;

        ban_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent banner_Int = new Intent( MainActivity.this, Banner.class);
                startActivity ( banner_Int );
            }
        });

        int_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent banner_Int = new Intent( MainActivity.this, Interstial.class);
                startActivity ( banner_Int );
            }
        });

        rwd_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent banner_Int = new Intent( MainActivity.this, Reward.class);
                startActivity ( banner_Int );
            }
        });

        rules_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rules_Int = new Intent( MainActivity.this, Rules.class);
                startActivity ( rules_Int );
            }
        });



        final int [] berhasilt  = {Banner.getValue()};
        final int [] berhasilt2  = {Banner_nd.getValue()};
        final int [] berhasilt3  = {Banner_rd.getValue()};
        final int [] inter_shlt  = {Interstial.getValue()};

        int total_banner = berhasilt[0] + berhasilt2[0] + berhasilt3[0];
        int total_ads = total_banner + inter_shlt[0];

        banner_text = (TextView) findViewById(R.id.ban_count);
        interst_text = (TextView) findViewById(R.id.int_count);
        total_text = (TextView) findViewById(R.id.total);

        banner_text.setText(total_banner+ "") ;
        interst_text.setText(inter_shlt[0]+ "") ;
        total_text.setText(total_ads + "") ;
    }
    @Override
    public void onBackPressed() {

            Intent interstitialIntent = new Intent(this, MainActivity.class);
            startActivity(interstitialIntent);
            finish();
    }

}
