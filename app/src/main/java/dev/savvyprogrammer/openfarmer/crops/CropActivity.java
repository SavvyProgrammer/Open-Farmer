package dev.savvyprogrammer.openfarmer.crops;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import dev.savvyprogrammer.openfarmer.R;
import dev.savvyprogrammer.openfarmer.ui.dashboard.DashboardFragment;
import dev.savvyprogrammer.openfarmer.ui.dashboard.DashboardViewModel;

public class CropActivity extends AppCompatActivity{


    @BindView(R.id.crop_image)
    ImageView cropImage;
    @BindView(R.id.tabLayout)
    TabLayout tabLayout;
    @BindView(R.id.edit_activity_viewpager)
    ViewPager viewPager;

    public int cropPosition;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crop);
        Intent intent = getIntent();
        cropPosition = intent.getExtras().getInt(DashboardFragment.CROP_POSITION);
        ButterKnife.bind(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        viewPager.setAdapter(new SectionsPagerAdapter(this, getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);


        switch (cropPosition) {
            case 1:
                cropImage.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.avocado, null));
                getSupportActionBar().setTitle("Avocado");
                break;
            case 2:
                cropImage.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.beans, null));
                getSupportActionBar().setTitle("Beans");
                break;
            case 3:
                cropImage.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.carrot, null));
                getSupportActionBar().setTitle("Carrot");
                break;
            case 4:
                cropImage.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.cassava, null));
                getSupportActionBar().setTitle("Cassava");
                break;
            case 5:
                cropImage.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.cocoyam, null));
                getSupportActionBar().setTitle("Cocoyam");
                break;
            case 6:
                cropImage.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.mango, null));
                getSupportActionBar().setTitle("Mango");
                break;
            case 7:
                cropImage.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.onion, null));
                getSupportActionBar().setTitle("Onion");
                break;
            case 8:
                cropImage.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.pepper, null));
                getSupportActionBar().setTitle("Pepper");
                break;
            case 9:
                cropImage.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.potato, null));
                getSupportActionBar().setTitle("Potato");
                break;
            case 10:
                cropImage.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.pineapple, null));
                getSupportActionBar().setTitle("Pineapple");
                break;
            case 11:
                cropImage.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.tomato, null));
                getSupportActionBar().setTitle("Tomato");
                break;
            case 12:
                cropImage.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.watermelon, null));
                getSupportActionBar().setTitle("Watermelon");
                break;
            case 13:
                cropImage.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.yam, null));
                getSupportActionBar().setTitle("Yam");
                break;
        }


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            super.onBackPressed();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onAttachFragment(@NonNull Fragment fragment) {
        super.onAttachFragment(fragment);


    }



    @Override
    protected void onResume() {
        super.onResume();

    }
}
