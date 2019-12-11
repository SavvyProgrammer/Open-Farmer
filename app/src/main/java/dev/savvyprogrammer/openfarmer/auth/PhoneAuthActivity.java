package dev.savvyprogrammer.openfarmer.auth;


import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;

import android.text.TextWatcher;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;


import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dev.savvyprogrammer.openfarmer.R;

public class PhoneAuthActivity extends AppCompatActivity {

    public static final String PHONE_NUMBER = "phone_number";

    @BindView(R.id.send_sms_button)
    Button sendSmsButton;
    @BindView(R.id.phone_number_editText)
    TextInputEditText mPhoneNumberField;
    @BindView(R.id.phone_number_editText_error)
    TextInputLayout mPhoneNumberFieldError;

    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_auth);
        ButterKnife.bind(this);
        auth = FirebaseAuth.getInstance();
        mPhoneNumberField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (count > 0) {
                    mPhoneNumberFieldError.setError(null);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() == 11) {
                    mPhoneNumberFieldError.setError(null);
                }
            }
        });

    }

    @OnClick(R.id.send_sms_button)
    void validatePhoneNumber() {

        if (TextUtils.isEmpty(getPhoneNumberField())) {
            mPhoneNumberFieldError.setError("Phone number input field cannot be empty");
        }
        else if (getPhoneNumberField().length() < 11) {

            mPhoneNumberFieldError.setError("A valid phone number is 11 characters long");
        }
     /*   else if (Objects.equals(auth.getCurrentUser().getPhoneNumber(), getPhoneNumberField())) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage(String.format("%s%n%s%n%s%n%s", "we will not be verifying the phone number", getPhoneNumberField(),
                    " because this number has already been registered with OpenFarmer", "Click Ok to recover your account"))
                    .setPositiveButton("Ok", ((dialog, which) -> {
                        Intent intent = new Intent(this, MainActivity.class);
                        intent.putExtra(PHONE_NUMBER, auth.getCurrentUser().getPhoneNumber());
                        startActivity(intent);
                        finish();
                    })).show();
        }*/
        else {
            mPhoneNumberFieldError.setError(null);

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage(String.format("%s%n%n%s%n%n%s%n", "we will be verifying the phone number:", getPhoneNumberField(), "Is this OK, or would you like to edit the number?"))
                    .setPositiveButton("Ok", (dialog, which) -> {
                        Intent intent = new Intent(this, VerifyPhoneNumber.class);
                        intent.putExtra(PHONE_NUMBER, getPhoneNumberField());
                        startActivity(intent);
                        finish();
                    })
                    .setNeutralButton("EDIT", (dialog, which) -> {

                    })
                    .show();

        }
    }

    public String getPhoneNumberField() {
        return mPhoneNumberField.getText().toString();
    }
}
