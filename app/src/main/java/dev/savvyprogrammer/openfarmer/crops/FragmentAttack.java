package dev.savvyprogrammer.openfarmer.crops;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import dev.savvyprogrammer.openfarmer.R;

public class FragmentAttack extends Fragment{

    @BindView(R.id.disease1)
    TextView diseaseOneHeader;
    @BindView(R.id.disease1_text)
    TextView diseaseOneBody;
    @BindView(R.id.disease1_image1)
    ImageView diseaseOneImageOne;
    @BindView(R.id.disease1_image2)
    ImageView diseaseOneImageTwo;

    @BindView(R.id.disease2)
    TextView diseaseTwoHeader;
    @BindView(R.id.disease2_text)
    TextView diseaseTwoBody;
    @BindView(R.id.disease2_image1)
    ImageView diseaseTwoImageOne;
    @BindView(R.id.disease2_image2)
    ImageView diseaseTwoImageTwo;

    @BindView(R.id.disease3)
    TextView diseaseThreeHeader;
    @BindView(R.id.disease3_text)
    TextView diseaseThreeBody;
    @BindView(R.id.disease3_image1)
    ImageView diseaseThreeImageOne;
    @BindView(R.id.disease3_image2)
    ImageView diseaseThreeImageTwo;

    @BindView(R.id.disease4)
    TextView diseaseFourHeader;
    @BindView(R.id.disease4_text)
    TextView diseaseFourBody;
    @BindView(R.id.disease4_image1)
    ImageView diseaseFourImageOne;
    @BindView(R.id.disease4_image2)
    ImageView diseaseFourImageTwo;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_attack_crop, container, false);
        ButterKnife.bind(this, rootView);

        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        super.onActivityCreated(savedInstanceState);
        CropActivity cropActivity = (CropActivity) getActivity();
        assert cropActivity != null;
        int position = cropActivity.cropPosition;

        switch (position) {

            case 1:
                diseaseOneHeader.setText(R.string.avocado_disease_one_header);
                diseaseOneBody.setText(R.string.avocado_disease_one_body);
                diseaseOneImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.avocado_algal_leaf_spot, null));
                diseaseOneImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.avocado_algal_leaf_spot2, null));
                diseaseTwoHeader.setText(R.string.avocado_disease_two_header);
                diseaseTwoBody.setText(R.string.avocado_disease_two_body);
                diseaseTwoImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.avocado_anthracnose1, null));
                diseaseTwoImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.avocado_anthracnose2, null));
                diseaseThreeHeader.setText(R.string.avocado_disease_three_header);
                diseaseThreeBody.setText(R.string.avocado_disease_three_body);
                diseaseThreeImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.avocado_thrips1, null));
                diseaseThreeImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.avocado_thrips2, null));
                diseaseFourHeader.setText(R.string.avocado_disease_four_header);
                diseaseFourBody.setText(R.string.avocado_disease_four_body);
                diseaseFourImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.avocado_mites_persea1, null));
                diseaseFourImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.avocado_mites_persea2, null));
                break;
            case 2:
                diseaseOneHeader.setText(R.string.avocado_disease_one_header);
                diseaseOneBody.setText(R.string.avocado_disease_one_body);
                diseaseOneImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.beans_alternaria_leaf_spot1, null));
                diseaseOneImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.beans_alternaria_leaf_spot2, null));
                diseaseTwoHeader.setText(R.string.avocado_disease_two_header);
                diseaseTwoBody.setText(R.string.avocado_disease_two_body);
                diseaseTwoImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.beans_anthracnose1, null));
                diseaseTwoImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.beans_anthracnose2, null));
                diseaseThreeHeader.setText(R.string.avocado_disease_three_header);
                diseaseThreeBody.setText(R.string.avocado_disease_three_body);
                diseaseThreeImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.beans_aphids1, null));
                diseaseThreeImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.beans_aphids2, null));
                diseaseFourHeader.setText(R.string.avocado_disease_four_header);
                diseaseFourBody.setText(R.string.avocado_disease_four_body);
                diseaseFourImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.beans_beans_rust1, null));
                diseaseFourImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.beans_beans_rust2, null));
                break;

            case 3:
                diseaseOneHeader.setText(R.string.avocado_disease_one_header);
                diseaseOneBody.setText(R.string.avocado_disease_one_body);
                diseaseOneImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.carrot_alternaria_leaf_blight1, null));
                diseaseOneImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.carrot_alternaria_leaf_blight2, null));
                diseaseTwoHeader.setText(R.string.avocado_disease_two_header);
                diseaseTwoBody.setText(R.string.avocado_disease_two_body);
                diseaseTwoImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.carrot_rust_fly1, null));
                diseaseTwoImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.carrot_rust_fly2, null));
                diseaseThreeHeader.setText(R.string.avocado_disease_three_header);
                diseaseThreeBody.setText(R.string.avocado_disease_three_body);
                diseaseThreeImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.carrot_aphids1, null));
                diseaseThreeImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.carrot_aphids2, null));
                diseaseFourHeader.setText(R.string.avocado_disease_four_header);
                diseaseFourBody.setText(R.string.avocado_disease_four_body);
                diseaseFourImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.carrot_weevil1, null));
                diseaseFourImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.carrot_weevil2, null));
                break;

            case 4:
                diseaseOneHeader.setText(R.string.avocado_disease_one_header);
                diseaseOneBody.setText(R.string.avocado_disease_one_body);
                diseaseOneImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.cassava_african_root_and_tuber_scale_1, null));
                diseaseOneImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.cassava_african_root_and_tuber_scale_2, null));
                diseaseTwoHeader.setText(R.string.avocado_disease_two_header);
                diseaseTwoBody.setText(R.string.avocado_disease_two_body);
                diseaseTwoImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.cassava_anthracnose_1, null));
                diseaseTwoImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.cassava_anthracnose_2, null));
                diseaseThreeHeader.setText(R.string.avocado_disease_three_header);
                diseaseThreeBody.setText(R.string.avocado_disease_three_body);
                diseaseThreeImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.cassava_brown_streak_1, null));
                diseaseThreeImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.cassava_brown_streak_2, null));
                diseaseFourHeader.setText(R.string.avocado_disease_four_header);
                diseaseFourBody.setText(R.string.avocado_disease_four_body);
                diseaseFourImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.cassava_root_rot_1, null));
                diseaseFourImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.cassava_root_rot_2, null));
                break;

            case 5:
                diseaseOneHeader.setText(R.string.avocado_disease_one_header);
                diseaseOneBody.setText(R.string.avocado_disease_one_body);
                diseaseOneImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.cocoyam_alomae_bobone1, null));
                diseaseOneImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.cocoyam_alomae_bobone2, null));
                diseaseTwoHeader.setText(R.string.avocado_disease_two_header);
                diseaseTwoBody.setText(R.string.avocado_disease_two_body);
                diseaseTwoImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.cocoyam_dasheen_mosaic1, null));
                diseaseTwoImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.cocoyam_dasheen_mosaic2, null));
                diseaseThreeHeader.setText(R.string.avocado_disease_three_header);
                diseaseThreeBody.setText(R.string.avocado_disease_three_body);
                diseaseThreeImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.cocoyam_phytophthora_leaf_blight1, null));
                diseaseThreeImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.cocoyam_phytophthora_leaf_blight2, null));
                diseaseFourHeader.setText(R.string.avocado_disease_four_header);
                diseaseFourBody.setText(R.string.avocado_disease_four_body);
                diseaseFourImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.cocoyam_pink_hibiscus1, null));
                diseaseFourImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.cocoyam_pink_hibiscus2, null));
                break;
            case 6:
                diseaseOneHeader.setText(R.string.avocado_disease_one_header);
                diseaseOneBody.setText(R.string.avocado_disease_one_body);
                diseaseOneImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.mango_algal_leaf_spot1, null));
                diseaseOneImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.mango_algal_leaf_spot2, null));
                diseaseTwoHeader.setText(R.string.avocado_disease_two_header);
                diseaseTwoBody.setText(R.string.avocado_disease_two_body);
                diseaseTwoImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.mango_anthracnose1, null));
                diseaseTwoImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.mango_anthracnose2, null));
                diseaseThreeHeader.setText(R.string.avocado_disease_three_header);
                diseaseThreeBody.setText(R.string.avocado_disease_three_body);
                diseaseThreeImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.mango_bacterial_black_spot1, null));
                diseaseThreeImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.mango_bacterial_black_spot2, null));
                diseaseFourHeader.setText(R.string.avocado_disease_four_header);
                diseaseFourBody.setText(R.string.avocado_disease_four_body);
                diseaseFourImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.mango_mealy_bug1, null));
                diseaseFourImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.mango_mealy_bug2, null));
                break;
            case 7:
                diseaseOneHeader.setText(R.string.avocado_disease_one_header);
                diseaseOneBody.setText(R.string.avocado_disease_one_body);
                diseaseOneImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.onion_black_mold_1, null));
                diseaseOneImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.onion_black_mold_2, null));
                diseaseTwoHeader.setText(R.string.avocado_disease_two_header);
                diseaseTwoBody.setText(R.string.avocado_disease_two_body);
                diseaseTwoImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.onion_pink_root_1, null));
                diseaseTwoImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.onion_pink_root_2, null));
                diseaseThreeHeader.setText(R.string.avocado_disease_three_header);
                diseaseThreeBody.setText(R.string.avocado_disease_three_body);
                diseaseThreeImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.onion_purple_blotch_1, null));
                diseaseThreeImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.onion_purple_blotch_2, null));
                diseaseFourHeader.setText(R.string.avocado_disease_four_header);
                diseaseFourBody.setText(R.string.avocado_disease_four_body);
                diseaseFourImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.onion_rust1, null));
                diseaseFourImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.onion_rust2, null));
                break;
            case 8:
                diseaseOneHeader.setText(R.string.avocado_disease_one_header);
                diseaseOneBody.setText(R.string.avocado_disease_one_body);
                diseaseOneImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.pepper_anthracnose1, null));
                diseaseOneImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.pepper_anthracnose2, null));
                diseaseTwoHeader.setText(R.string.avocado_disease_two_header);
                diseaseTwoBody.setText(R.string.avocado_disease_two_body);
                diseaseTwoImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.pepper_bacterial_spot_1, null));
                diseaseTwoImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.pepper_bacterial_spot_2, null));
                diseaseThreeHeader.setText(R.string.avocado_disease_three_header);
                diseaseThreeBody.setText(R.string.avocado_disease_three_body);
                diseaseThreeImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.pepper_powdery_mildew1, null));
                diseaseThreeImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.pepper_powdery_mildew2, null));
                diseaseFourHeader.setText(R.string.avocado_disease_four_header);
                diseaseFourBody.setText(R.string.avocado_disease_four_body);
                diseaseFourImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.pepper_southern_blight1, null));
                diseaseFourImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.pepper_southern_blight2, null));
                break;

            case 9:
                diseaseOneHeader.setText(R.string.avocado_disease_one_header);
                diseaseOneBody.setText(R.string.avocado_disease_one_body);
                diseaseOneImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.potato_early_blight_1, null));
                diseaseOneImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.potato_early_blight_2, null));
                diseaseTwoHeader.setText(R.string.avocado_disease_two_header);
                diseaseTwoBody.setText(R.string.avocado_disease_two_body);
                diseaseTwoImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.potato_late_blight_1, null));
                diseaseTwoImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.potato_late_blight_2, null));
                diseaseThreeHeader.setText(R.string.avocado_disease_three_header);
                diseaseThreeBody.setText(R.string.avocado_disease_three_body);
                diseaseThreeImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.potato_powdery_scab_1, null));
                diseaseThreeImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.potato_powdery_scab_2, null));
                diseaseFourHeader.setText(R.string.avocado_disease_four_header);
                diseaseFourBody.setText(R.string.avocado_disease_four_body);
                diseaseFourImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.potato_cutworm_1, null));
                diseaseFourImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.potato_cutworm_2, null));
                break;

            case 10:
                diseaseOneHeader.setText(R.string.avocado_disease_one_header);
                diseaseOneBody.setText(R.string.avocado_disease_one_body);
                diseaseOneImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.pineapple_black_rot, null));
                diseaseOneImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.pineapple_black_rot2, null));
                diseaseTwoHeader.setText(R.string.avocado_disease_two_header);
                diseaseTwoBody.setText(R.string.avocado_disease_two_body);
                diseaseTwoImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.pineapple_fusariosis1, null));
                diseaseTwoImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.pineapple_fusariosis2, null));
                diseaseThreeHeader.setText(R.string.avocado_disease_three_header);
                diseaseThreeBody.setText(R.string.avocado_disease_three_body);
                diseaseThreeImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.pineapple_mealy_bug1, null));
                diseaseThreeImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.pineapple_mealy_bug2, null));
                diseaseFourHeader.setText(R.string.avocado_disease_four_header);
                diseaseFourBody.setText(R.string.avocado_disease_four_body);
                diseaseFourImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.pineapple_root_rot1, null));
                diseaseFourImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.pineapple_root_rot2, null));
                break;
            case 11:
                diseaseOneHeader.setText(R.string.avocado_disease_one_header);
                diseaseOneBody.setText(R.string.avocado_disease_one_body);
                diseaseOneImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.tomato_anthracnose_1, null));
                diseaseOneImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.tomato_anthracnose_2, null));
                diseaseTwoHeader.setText(R.string.avocado_disease_two_header);
                diseaseTwoBody.setText(R.string.avocado_disease_two_body);
                diseaseTwoImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.tomato_early_blight_1, null));
                diseaseTwoImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.tomato_early_blight_2, null));
                diseaseThreeHeader.setText(R.string.avocado_disease_three_header);
                diseaseThreeBody.setText(R.string.avocado_disease_three_body);
                diseaseThreeImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.tomato_leaf_mold1, null));
                diseaseThreeImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.tomato_leaf_mold2, null));
                diseaseFourHeader.setText(R.string.avocado_disease_four_header);
                diseaseFourBody.setText(R.string.avocado_disease_four_body);
                diseaseFourImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.tomato_septoria_leaf_spot1, null));
                diseaseFourImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.tomato_septoria_leaf_spot2, null));
                break;
            case 12:
                diseaseOneHeader.setText(R.string.avocado_disease_one_header);
                diseaseOneBody.setText(R.string.avocado_disease_one_body);
                diseaseOneImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.watermelon_anthracnose1, null));
                diseaseOneImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.watermelon_anthracnose2, null));
                diseaseTwoHeader.setText(R.string.avocado_disease_two_header);
                diseaseTwoBody.setText(R.string.avocado_disease_two_body);
                diseaseTwoImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.watermelon_bacterial_fruit_blotch1, null));
                diseaseTwoImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.watermelon_bacterial_fruit_blotch2, null));
                diseaseThreeHeader.setText(R.string.avocado_disease_three_header);
                diseaseThreeBody.setText(R.string.avocado_disease_three_body);
                diseaseThreeImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.watermelon_gummy_stem_blight1, null));
                diseaseThreeImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.watermelon_gummy_stem_blight2, null));
                diseaseFourHeader.setText(R.string.avocado_disease_four_header);
                diseaseFourBody.setText(R.string.avocado_disease_four_body);
                diseaseFourImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.watermelon_downy_mildew1, null));
                diseaseFourImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.watermelon_downy_mildew2, null));
                break;

            case 13:
                diseaseOneHeader.setText(R.string.avocado_disease_one_header);
                diseaseOneBody.setText(R.string.avocado_disease_one_body);
                diseaseOneImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.yam_anthracnose1, null));
                diseaseOneImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.yam_anthracnose2, null));
                diseaseTwoHeader.setText(R.string.avocado_disease_two_header);
                diseaseTwoBody.setText(R.string.avocado_disease_two_body);
                diseaseTwoImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.yam_dry_rot1, null));
                diseaseTwoImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.yam_dry_rot2, null));
                diseaseThreeHeader.setText(R.string.avocado_disease_three_header);
                diseaseThreeBody.setText(R.string.avocado_disease_three_body);
                diseaseThreeImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.yam_mosiac1, null));
                diseaseThreeImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.yam_mosiac2, null));
                diseaseFourHeader.setText(R.string.avocado_disease_four_header);
                diseaseFourBody.setText(R.string.avocado_disease_four_body);
                diseaseFourImageOne.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.yam_white_scale_insect1, null));
                diseaseFourImageTwo.setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.yam_white_scale_insect2, null));
                break;


        }
    }

}
