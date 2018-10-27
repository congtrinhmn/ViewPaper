package android.com.viewpager;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(android.com.viewpager.R.layout.activity_main);

        TabLayout tabLayout = (TabLayout) findViewById(android.com.viewpager.R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Tin Nóng"));
        tabLayout.addTab(tabLayout.newTab().setText("Thời Sự"));
        tabLayout.addTab(tabLayout.newTab().setText("Thể Thao"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        FragmentManager manager = getSupportFragmentManager();
        final ViewPager viewPager = (ViewPager) findViewById(android.com.viewpager.R.id.pager);
        PagerAdapter adapter = new android.com.viewpager.PagerAdapter(manager);

        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
