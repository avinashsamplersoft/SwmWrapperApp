package com.traxsmart.swmwrapperapp.base;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.material.snackbar.Snackbar;
import com.traxsmart.swmwrapperapp.R;
import com.traxsmart.swmwrapperapp.notifications.FcmTokenRegistrationService;

import java.io.IOException;

import dagger.android.support.DaggerAppCompatActivity;

public abstract class BaseActivity extends DaggerAppCompatActivity {

    private static final String systemPing = "/system/bin/ping -c 1 8.8.8.8";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        checkGoogleApiAvailability();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        // FrameLayout frameLayout = findViewById(R.id.activity_content);
    }

    @Override
    protected void onResume() {
        sendFcmRegistrationToken();
        super.onResume();
    }

    private void sendFcmRegistrationToken() {
        Intent intent = new Intent(this, FcmTokenRegistrationService.class);
        startService(intent);
    }

    private void checkGoogleApiAvailability() {
        GoogleApiAvailability apiAvailability = GoogleApiAvailability.getInstance();
        int resultCode = apiAvailability.isGooglePlayServicesAvailable(this);

        if (resultCode != ConnectionResult.SUCCESS) {
            if (resultCode == ConnectionResult.SUCCESS) {
                //Log.d("GoogleApi is available");
            } else {
                apiAvailability.getErrorDialog(this, resultCode, 1).show();
            }
        }
    }

    public void showSnackBarMessage(String message) {
        Snackbar snackbar = Snackbar.make(findViewById(R.id.activity_content), message, Snackbar.LENGTH_SHORT);
        snackbar.show();
    }

    public void showToastMessage(String message) {
        Toast.makeText(BaseActivity.this, message, Toast.LENGTH_SHORT).show();
    }

    public static boolean isInternetAvailable(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        if (activeNetwork == null) return false;

        switch (activeNetwork.getType()) {
            case ConnectivityManager.TYPE_WIFI:
                if ((activeNetwork.getState() == NetworkInfo.State.CONNECTED ||
                        activeNetwork.getState() == NetworkInfo.State.CONNECTING) &&
                        isInternet())
                    return true;
                break;
            case ConnectivityManager.TYPE_MOBILE:
                if ((activeNetwork.getState() == NetworkInfo.State.CONNECTED ||
                        activeNetwork.getState() == NetworkInfo.State.CONNECTING) &&
                        isInternet())
                    return true;
                break;
            default:
                return false;
        }
        return false;
    }

    private static boolean isInternet() {

        Runtime runtime = Runtime.getRuntime();
        try {
            Process ipProcess = runtime.exec(systemPing);
            int exitValue = ipProcess.waitFor();
            // Log.i(exitValue + "");
            return (exitValue == 0);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        return false;
    }
}
