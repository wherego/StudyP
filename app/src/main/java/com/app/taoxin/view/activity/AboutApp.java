package com.app.taoxin.view.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import android.view.View;
import com.app.taoxin.R;
import com.app.taoxin.util.ShareUtil;
import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class AboutApp extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Element adsElement = new Element();
        adsElement.setTitle("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tBy 陶鑫");

        View aboutPage = new AboutPage(this)
            .isRTL(false)
            .setDescription(
                "每日分享妹子图 和 技术干货\n还有供大家中午休息的休闲视频")
            .setImage(R.mipmap.gank)
            .addItem(new Element().setTitle("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tVersion 1.0"))
            .addItem(adsElement)
            .create();

        setContentView(aboutPage);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_about_app, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_share_app) {
            ShareUtil.shareText(this, "分享一个很赞的学习App，赶紧去看看吧");
        }
        return super.onOptionsItemSelected(item);
    }

}
