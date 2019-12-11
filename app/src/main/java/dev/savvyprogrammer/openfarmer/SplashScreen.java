package dev.savvyprogrammer.openfarmer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.google.firebase.auth.FirebaseAuth;

import dev.savvyprogrammer.openfarmer.auth.PhoneAuthActivity;
import dev.savvyprogrammer.openfarmer.main.MainActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(this::gotoPhoneAuthActivity, 3000L);
    }

    private void gotoPhoneAuthActivity() {
        FirebaseAuth auth = FirebaseAuth.getInstance();
        if (auth.getCurrentUser() != null) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }
        else {
            Intent intent = new Intent(this, PhoneAuthActivity.class);
            startActivity(intent);
            finish();
        }


    }

}
