package dev.savvyprogrammer.openfarmer;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.LinearLayout;


import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class QuestionActivity extends AppCompatActivity implements ModalBottomSheet.Listener{

    @BindView(R.id.bottom_sheet)
    LinearLayout bottomSheet;
    ModalBottomSheet modalBottomSheet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        ButterKnife.bind(this);
        modalBottomSheet = new ModalBottomSheet();
        showModalBottomSheet();
        bottomSheet.setOnDragListener(this::onDrag);

    }

    @OnClick(R.id.bottom_sheet)
    void setBottomSheet() {
        showModalBottomSheet();
    }

    private void showModalBottomSheet() {
        modalBottomSheet.show(getSupportFragmentManager(), null);
    }


    @Override
    public void onFarmerButtonClick() {

    }

    @Override
    public void onResearcherButtonClick() {

    }

    private boolean onDrag(View v, DragEvent event) {
        showModalBottomSheet();
        return false;
    }
}
