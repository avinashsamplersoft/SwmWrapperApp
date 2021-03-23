package com.traxsmart.swmwrapperapp.utils.session;

import javax.inject.Singleton;

@Singleton
public class SessionManager {

    /*private static final String TAG = "DaggerExample";

    // data
    private MediatorLiveData<AuthResource<CredentialsDetails>> cachedUser = new MediatorLiveData<>();

    @Inject
    public SessionManager() {

    }

    public void authenticateWithId(final LiveData<AuthResource<CredentialsDetails>> source) {
        if(cachedUser != null){
            cachedUser.setValue(AuthResource.loading((CredentialsDetails)null));
            cachedUser.addSource(source, new Observer<AuthResource<CredentialsDetails>>() {
                @Override
                public void onChanged(AuthResource<CredentialsDetails> userAuthResource) {
                    cachedUser.setValue(userAuthResource);
                    cachedUser.removeSource(source);

                    if(userAuthResource.status.equals(AuthResource.AuthStatus.ERROR)){
                        cachedUser.setValue(AuthResource.<CredentialsDetails>logout());
                    }
                }
            });
        }
    }

    public void logOut() {
        Log.d(TAG, "logOut: logging out...");
        cachedUser.setValue(AuthResource.<CredentialsDetails>logout());
    }


    public LiveData<AuthResource<CredentialsDetails>> getAuthUser(){
        return cachedUser;
    }*/

}
