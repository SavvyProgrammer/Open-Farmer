package dev.savvyprogrammer.openfarmer.crops;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import dev.savvyprogrammer.openfarmer.R;

public class FragmentAdvise extends Fragment {

    @BindView(R.id.advise_body)
    TextView adviseBody;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_advise_crop, container, false);
        ButterKnife.bind(this, rootView);

        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        CropActivity cropActivity = (CropActivity) getActivity();
        assert cropActivity != null;
        int position = cropActivity.cropPosition;
        switch (position) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                adviseBody.setText(R.string.avocado_advise);
                break;
        }
    }


}
