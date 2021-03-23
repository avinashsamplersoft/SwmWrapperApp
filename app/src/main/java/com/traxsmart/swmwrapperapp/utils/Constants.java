package com.traxsmart.swmwrapperapp.utils;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class Constants {

    public static final String supervisor = "5eda4f11a739911393c9d61c";
    public static final String healthInspector = "5eda4f25a739911393c9d61d";
    public static final String driver = "5eda4f3fa739911393c9d61e";   // for demo

    public static final String SUPERVISOR = "supervisor_id";
    public static final String HEALTH_INSPECTOR = "health_inspector_id";
    public static final String DRIVER = "driver_id";

    public static final String BASE_URL = "https://ztcedeq1lh.execute-api.ap-south-1.amazonaws.com/dev/";

    // API_KEY is no longer necessary since food2fork has shutdown. This can be empty it doesn't matter.
    // public static final String API_KEY = "453556cb475252e7e42d65aa11912447";

    public static final String API_KEY = "";

    public static final int NETWORK_TIMEOUT = 3000;

    public static final String WEB_APP_URL = "/bodhiinfo/quest/yet/bodhiinfo/yet/jack/bodhiinfo/zoo/yet/or/bodhiinfo/quest/yet/diversion/bodhiinfo/quest/yet/goalinfo/yet/cloud/yet/helpline";
    public static final String URL_PATTERN = "/";

    public static final String USER_PREFS = "USER_PREFS";
    public static final String USER_AUTH_KEY = "USER_AUTH_KEY";
    public static final String USER_LOGIN_INFO = "USER_LOGIN_INFO";
    public static final String USER_CREDENTIALS = "USER_CREDENTIALS";
    public static final String USER_LOGIN_STATUS = "USER_LOGIN_STATUS";
    public static final String USER_LOGIN_TIMESTAMP ="USER_LOGIN_TIMESTAMP";
    public static final String USER_PUNCH_STATUS = "USER_PUNCH_STATUS";
    public static final String SYSTEM_ATTRIBUTES = "SYSTEM_ATTRIBUTES";
    public static final String IS_ATTENDANCE_MARKED = "IS_ATTENDANCE_MARKED";
    public static final String ATTENDANCE_MARKED_TIMESTAMP = "ATTENDANCE_MARKED_TIMESTAMP";
    public static final String INITIAL_ATTENDANCE_TIMESTAMP = "INITIAL_ATTENDANCE_TIMESTAMP";
    public static final String IS_ATTENDANCE_PHOTO_CAPTURED = "IS_ATTENDANCE_PHOTO_CAPTURED";
    public static final String USER_TRIP_STATUS = "USER_TRIP_STATUS";
    public static final String IS_TRIP_PHOTO_CAPTURED = "IS_TRIP_PHOTO_CAPTURED";
    public static final String ATTENDANCE_DATA = "ATTENDANCE_DATA";
    public static final String TRIP_DATA = "ATTENDANCE_DATA";

    // Dashboard Modules
    public static final String COMPLAINTS_MODULE = "COMPLAINTS";
    public static final String ATTENDANCE_MODULE = "ATTENDANCE";
    public static final String INSTANT_INSPECTION_MODULE = "INSTANT_INSPECTION";
    public static final String INSPECTION_MODULE = "INSPECTION";
    public static final String TRIPS_MODULE = "TRIPS";
    public static final String COMPLAINTS_ESCALATION = "COMPLAINTS_ESCALATION";
    public static final String SUBORDINATES_ATTENDANCE = "SUBORDINATES_ATTENDANCE";
    public static final String SELF_ATTENDANCE = "SELF_ATTENDANCE";

    // ACTIVITY TYPES
    public static final String ATTENDANC_ACTIVITY_TYPE = "ATTENDANCE";
    public static final String INSPECTION_ACTIVITY_TYPE = "INSPECTION";
    public static final String RESOLUTION_ACTIVITY_TYPE = "RESOLUTION";
    public static final String TRIPS_ACTIVITY_TYPE = "TRIP";

    // AssestType
    public static final String GARBAGE_DEPOT = "GARBAGE_DEPOT";
    public static final String INSPECTION_ISSUE_CATEGORY = "INSPECTION_ISSUE_CATEGORY";
    public static final String WARD = "WARD";
    public static final String ROLE = "ROLE";
    public static final String CIRCLE = "CIRCLE";
    public static final String SELECTED_GARBAGE_DEPOT = "SELECTED_GARBAGE_DEPOT";
    public static final String SELECTED_ACTION_TAKEN_GARBAGE_DEPOT = "SELECTED_ACTION_TAKEN_GARBAGE_DEPOT";

    // User Roles
    public static final String HEALTH_INSPECTOR_TITLE = "Health Inspector";
    public static final String DRIVER_TITLE = "Driver";
    public static final String SUPERVISOR_TITLE = "Supervisor";
    public static final String CITIZEN_TITLE = "Citizen";
    public static final String NAGAR_NIGAM_OFFICIAL_TITLE = "Nagar Nigam Official";

    // Complaints
    public static final String COMPLAINT_LIST = "COMPLAINT_LIST";
    public static final String COMPLAINT_OPEN_STATUS = "OPEN";
    public static final String COMPLAINT_RESOLVED_STATUS = "RESOLVED";
    public static final String COMPLAINTS_PENDING_STATUS = "PENDING";
    public static final String SELECTED_COMPLAINT = "SELECTED_COMPLAINT";
    public static final String COMPLAINTS_SWM_TITLE = "COMPLAINTS_SWM";
    public static final String COMPLAINTS_SWM_DESC = "COMPLAINTS_SWM_DESC";
    public static final String SAVE_COMPLAINTS_PENDING = "SAVE_COMPLAINTS_PENDING";
    public static final String SAVE_COMPLAINTS_OPEN = "SAVE_COMPLAINTS_OPEN";
    public static final String SAVE_COMPLAINTS_RESOLVED = "SAVE_COMPLAINTS_RESOLVED";

    //DataTransfer
    public static final String FROM_COMPLAINTS_RAISED = "FROM_COMPLAINTS_RAISED";
    public static final String APP_LANGUAGE = "APP_LANGUAGE";
    public static final String IS_LANGUAGE_CHANGE = "IS_LANGUAGE_CHANGE";

    //TimeZone
    public static final String LOCAL_IST_TIMEZONE = "Asia/Kolkata";

    //activityDataTransfers
    public static final String RE_LOGIN = "RE_LOGIN";

    public static ProgressDialog getProgressDialog(Context context, String msg) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setMessage(msg);
        progressDialog.setCancelable(false);
        return progressDialog;
    }

    public static boolean checkInternetConnection(Context context) {
        ConnectivityManager connectivity = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity == null) {
            return false;
        } else {
            NetworkInfo[] info = connectivity.getAllNetworkInfo();
            if (info != null) {
                for (int i = 0; i < info.length; i++) {
                    if (info[i].getState() == NetworkInfo.State.CONNECTED) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
