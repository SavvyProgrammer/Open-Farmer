package dev.savvyprogrammer.openfarmer.crops;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import dev.savvyprogrammer.openfarmer.R;

public class FragmentAbout extends Fragment{

    @BindView(R.id.introduction_body)
    TextView introductionBody;
    @BindView(R.id.cultivation_body)
    TextView cultivationBody;
    @BindView(R.id.requirements_body)
    TextView requirementsBody;
    @BindView(R.id.harvesting_body)
    TextView harvestingBody;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_about_crop, container, false);
        ButterKnife.bind(this, rootView);

        return rootView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        CropActivity cropActivity = (CropActivity) getActivity();
        assert cropActivity != null;
        int position = cropActivity.cropPosition;

        switch (position) {
            case 1:
                introductionBody.setText(R.string.avocado_introduction_body);
                cultivationBody.setText(R.string.avocado_cultivation_body);
                requirementsBody.setText(R.string.avocado_requirements_body);
                harvestingBody.setText(R.string.avocado_harvesting_body);
                break;
            case 2:
                introductionBody.setText(R.string.beans_introduction_body);
                cultivationBody.setText(R.string.beans_cultivation_body);
                requirementsBody.setText(R.string.beans_requirements_body);
                harvestingBody.setText(R.string.beans_harvesting_body);
                break;
            case 3:
                introductionBody.setText(R.string.carrot_introduction_body);
                cultivationBody.setText(R.string.carrot_cultivation_body);
                requirementsBody.setText(R.string.carrot_requirements_body);
                harvestingBody.setText(R.string.carrot_harvesting_body);
                break;
            case 4:
                introductionBody.setText(R.string.cassava_introduction_body);
                cultivationBody.setText(R.string.cassava_cultivation_body);
                requirementsBody.setText(R.string.cassava_requirements_body);
                harvestingBody.setText(R.string.cassava_harvesting_body);
                break;
            case 5:
                introductionBody.setText(R.string.cocoyam_introduction_body);
                cultivationBody.setText(R.string.cocoyam_cultivation_body);
                requirementsBody.setText(R.string.cocoyam_requirements_body);
                harvestingBody.setText(R.string.cocoyam_harvesting_body);
                break;
            case 6:
                introductionBody.setText(R.string.mango_introduction_body);
                cultivationBody.setText(R.string.mango_cultivation_body);
                requirementsBody.setText(R.string.mango_requirements_body);
                harvestingBody.setText(R.string.mango_harvesting_body);
                break;
            case 7:
                introductionBody.setText(R.string.onion_introduction_body);
                cultivationBody.setText(R.string.onion_cultivation_body);
                requirementsBody.setText(R.string.onion_requirements_body);
                harvestingBody.setText(R.string.onion_harvesting_body);
                break;
            case 8:
                introductionBody.setText(R.string.pepper_introduction_body);
                cultivationBody.setText(R.string.pepper_cultivation_body);
                requirementsBody.setText(R.string.pepper_requirements_body);
                harvestingBody.setText(R.string.pepper_harvesting_body);
                break;
            case 9:
                introductionBody.setText(R.string.potato_introduction_body);
                cultivationBody.setText(R.string.potato_cultivation_body);
                requirementsBody.setText(R.string.potato_requirements_body);
                harvestingBody.setText(R.string.potato_harvesting_body);
                break;
            case 10:
                introductionBody.setText(R.string.pepper_introduction_body);
                cultivationBody.setText(R.string.pineapple_cultivation_body);
                requirementsBody.setText(R.string.pineapple_requirements_body);
                harvestingBody.setText(R.string.pineapple_harvesting_body);
                break;
            case 11:
                introductionBody.setText(R.string.tomato_introduction_body);
                cultivationBody.setText(R.string.tomato_cultivation_body);
                requirementsBody.setText(R.string.tomato_requirements_body);
                harvestingBody.setText(R.string.tomato_harvesting_body);
                break;
            case 12:
                introductionBody.setText(R.string.watermelon_introduction_body);
                cultivationBody.setText(R.string.watermelon_cultivation_body);
                requirementsBody.setText(R.string.watermelon_requirements_body);
                harvestingBody.setText(R.string.watermelon_harvesting_body);
                break;
            case 13:
                introductionBody.setText(R.string.yam_introduction_body);
                cultivationBody.setText(R.string.yam_cultivation_body);
                requirementsBody.setText(R.string.yam_requirements_body);
                harvestingBody.setText(R.string.yam_harvesting_body);
                break;

        }

    }





}
