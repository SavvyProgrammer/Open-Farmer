package dev.savvyprogrammer.openfarmer;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class ModalBottomSheet extends BottomSheetDialogFragment {


    private Listener mListener;

    @BindView(R.id.farmer)
    Button farmerButton;
    @BindView(R.id.researcher)
    Button researcherButton;

    @Override
    public void setupDialog(@NonNull Dialog dialog, int style) {
        super.setupDialog(dialog, style);
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        return super.onCreateDialog(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.modal_bottom_sheet, container, false);
        ButterKnife.bind(this, rootView);
        return rootView;
    }


    @OnClick(R.id.farmer)
    void setFarmerButton() {
        mListener.onFarmerButtonClick();

    }

    @OnClick(R.id.researcher)
    void setResearcherButton() {
        mListener.onResearcherButtonClick();

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        final Fragment parent = getParentFragment();
        if (parent != null) {
            mListener = (Listener) parent;
        } else {
            mListener = (Listener) context;
        }

    }

    @Override
    public void onDetach() {
        mListener = null;
        super.onDetach();
    }

    public interface Listener {
        void onFarmerButtonClick();
        void onResearcherButtonClick();
    }



}
