package com.traxsmart.swmwrapperapp.utils.localStorage;

import android.content.Context;

public class PreferenceServiceImpl implements PreferenceServiceInterface {

    private static volatile PreferenceServiceImpl sInstance;

    private SharedPrefService mSharedPrefService;

    public static PreferenceServiceImpl getInstance(Context context){
        if(null == sInstance){
            sInstance = new PreferenceServiceImpl(context);
        }
        return sInstance;
    }

    private PreferenceServiceImpl(Context context){
        mSharedPrefService = new SharedPreferenceImplementation(context);
    }

    @Override
    public void saveString(String key, String value) {
        mSharedPrefService.saveString(key, value);
    }

    @Override
    public void saveBoolean(String key, boolean status) {
        mSharedPrefService.saveBoolean(key, status);
    }

    @Override
    public void saveLong(String key, long value) {
        mSharedPrefService.saveLong(key, value);
    }

    @Override
    public String getString(String key) {
       return mSharedPrefService.getString(key);
    }

    @Override
    public boolean getBoolean(String key) {
        return mSharedPrefService.getBoolean(key);
    }

    @Override
    public long getLong(String key) {
        return mSharedPrefService.getLong(key);
    }

    @Override
    public void clearOnly(String key) {
        mSharedPrefService.clearOnly(key);
    }

    @Override
    public void clearAll() {
        mSharedPrefService.clearAll();
    }
}
