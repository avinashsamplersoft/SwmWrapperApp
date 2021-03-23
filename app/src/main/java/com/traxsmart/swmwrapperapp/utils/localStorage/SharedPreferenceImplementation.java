package com.traxsmart.swmwrapperapp.utils.localStorage;

import android.content.Context;
import android.content.SharedPreferences;

import com.traxsmart.swmwrapperapp.utils.Constants;

public class SharedPreferenceImplementation implements SharedPrefService {

    private SharedPreferences mSharedPrefs;

    public SharedPreferenceImplementation(Context context){
        mSharedPrefs = context.getSharedPreferences(Constants.USER_PREFS, Context.MODE_PRIVATE);
    }

    @Override
    public void saveString(String key, String value) {
        SharedPreferences.Editor editor = mSharedPrefs.edit();
        editor.putString(key, value);
        editor.apply();
    }

    @Override
    public String getString(String key) {
        return mSharedPrefs.getString(key, null);
    }

    @Override
    public void clearAll() {
        SharedPreferences.Editor editor = mSharedPrefs.edit();
        editor.remove(Constants.USER_PREFS);
        editor.clear();
        editor.apply();
    }

    @Override
    public void saveBoolean(String key, boolean status) {
        SharedPreferences.Editor editor = mSharedPrefs.edit();
        editor.putBoolean(key, status);
        editor.apply();
    }

    @Override
    public void saveLong(String key, long value) {
        SharedPreferences.Editor editor = mSharedPrefs.edit();
        editor.putLong(key, value);
        editor.apply();
    }

    @Override
    public boolean getBoolean(String key) {
        return mSharedPrefs.getBoolean(key, false);
    }

    @Override
    public long getLong(String key) {
        return mSharedPrefs.getLong(key, 0);
    }

    @Override
    public void clearOnly(String key) {
        SharedPreferences.Editor editor = mSharedPrefs.edit();
        editor.remove(key);
        editor.apply();
    }
}


// To store Data
/*
                String hcData = gson.toJson(healthReportObjHashMap);
                PrefUtils.storeHCDataHistory(getActivity(), hcData);       */

// To retrieve data

/*       String storedHashMapString = PrefUtils.getHCDataHistory(getActivity());
        java.lang.reflect.Type type = new TypeToken<List<HealthReportObj>>() {}.getType();
        List<HealthReportObj> hashMap = gson.fromJson(storedHashMapString, type); */