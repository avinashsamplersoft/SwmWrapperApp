package com.traxsmart.swmwrapperapp.utils.localStorage;

/**
 * Created by saoud on 23/7/16.
 */

public interface SharedPrefService {

    void saveString(String key, String value);
    void saveBoolean(String key, boolean status);
    void saveLong(String key, long value);
    String getString(String key);
    boolean getBoolean(String key);
    long getLong(String key);
    void clearOnly(String key);
    void clearAll();
}
