package com.traxsmart.swmwrapperapp.utils;

import android.content.Context;

import com.traxsmart.swmwrapperapp.utils.localStorage.PreferenceServiceImpl;
import com.traxsmart.swmwrapperapp.utils.localStorage.SharedPrefService;

public class ServiceHolder {

    private static volatile ServiceHolder sInstance;
    SharedPrefService mSharedPreferanceService;

    public static ServiceHolder getInstance(Context context){
        if(null == sInstance){
            synchronized (ServiceHolder.class) {
                sInstance = new ServiceHolder(context);
            }
        }
        return sInstance;
    }


    private ServiceHolder(Context context){
        mSharedPreferanceService = PreferenceServiceImpl.getInstance(context);
    }

    /**
     * @return Singleton instance of the {@Link IPersistenceServices} for interactors to use storage and retrieval methods
     */
    public SharedPrefService getPersistenceServices(){
        return mSharedPreferanceService;
    }

    /*public DbServiceInterface getDbServiceInterface(){
        return mDbServiceInterface;
    }*/

}