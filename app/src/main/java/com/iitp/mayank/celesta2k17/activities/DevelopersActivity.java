package com.iitp.mayank.celesta2k17.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.iitp.mayank.celesta2k17.R;

public class DevelopersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developers);

        ImageView github_muks = (ImageView) findViewById(R.id.github_muks);
        ImageView github_mayank = (ImageView) findViewById(R.id.github_mayank);
        ImageView github_manish = (ImageView) findViewById(R.id.github_manish);
        ImageView fb_muks = (ImageView) findViewById(R.id.fb_muks);
        ImageView fb_mayank = (ImageView) findViewById(R.id.fb_mayank);
        ImageView fb_manish = (ImageView) findViewById(R.id.fb_manish);

        String urls[] = {
                "https://github.com/Muks14x",
                "https://github.com/Mayank8318",
                "https://github.com/ivary43",
                "https://www.facebook.com/pesk123",
                "https://www.facebook.com/mayank.vaidya.9",
                "https://www.facebook.com/profile.php?id=100009684360848"
        };

        github_muks.setOnClickListener(new devOnClickListener(urls[0]));
        github_mayank.setOnClickListener(new devOnClickListener(urls[1]));
        github_manish.setOnClickListener(new devOnClickListener(urls[2]));
        fb_muks.setOnClickListener(new devOnClickListener(urls[3]));
        fb_mayank.setOnClickListener(new devOnClickListener(urls[4]));
        fb_manish.setOnClickListener(new devOnClickListener(urls[5]));
    }

    public class devOnClickListener implements View.OnClickListener {

        String mUrl;

        public devOnClickListener(String url) {
            super();
            mUrl = url;
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(mUrl));
            startActivity(intent);
        }
    }


}
