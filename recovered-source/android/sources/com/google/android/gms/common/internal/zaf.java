package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.os.ConfigurationCompat;
import com.arrow.puzzle.escape.maze.free.game.R;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class zaf {

    /* JADX INFO: renamed from: a */
    public static final SimpleArrayMap f4488a = new SimpleArrayMap();

    /* JADX INFO: renamed from: b */
    public static Locale f4489b;

    /* JADX INFO: renamed from: a */
    public static String m3595a(Context context, int i2) {
        Resources resources = context.getResources();
        switch (i2) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m3599e(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m3599e(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 22);
                sb.append("Unexpected error code ");
                sb.append(i2);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m3599e(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m3599e(context, "common_google_play_services_restricted_profile_title");
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m3596b(Context context, int i2) {
        Resources resources = context.getResources();
        String strM3597c = m3597c(context);
        if (i2 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, strM3597c);
        }
        if (i2 == 2) {
            return DeviceProperties.m3645c(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, strM3597c);
        }
        if (i2 == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, strM3597c);
        }
        if (i2 == 5) {
            return m3598d(context, "common_google_play_services_invalid_account_text", strM3597c);
        }
        if (i2 == 7) {
            return m3598d(context, "common_google_play_services_network_error_text", strM3597c);
        }
        if (i2 == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, strM3597c);
        }
        if (i2 == 20) {
            return m3598d(context, "common_google_play_services_restricted_profile_text", strM3597c);
        }
        switch (i2) {
            case 16:
                return m3598d(context, "common_google_play_services_api_unavailable_text", strM3597c);
            case 17:
                return m3598d(context, "common_google_play_services_sign_in_failed_text", strM3597c);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, strM3597c);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, strM3597c);
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m3597c(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = Wrappers.m3665a(context).f4662a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m3598d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strM3599e = m3599e(context, str);
        if (strM3599e == null) {
            strM3599e = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strM3599e, str2);
    }

    /* JADX INFO: renamed from: e */
    public static String m3599e(Context context, String str) {
        Resources resourcesForApplication;
        SimpleArrayMap simpleArrayMap = f4488a;
        synchronized (simpleArrayMap) {
            try {
                Locale locale = ConfigurationCompat.getLocales(context.getResources().getConfiguration()).get(0);
                if (!locale.equals(f4489b)) {
                    simpleArrayMap.clear();
                    f4489b = locale;
                }
                String str2 = (String) simpleArrayMap.get(str);
                if (str2 != null) {
                    return str2;
                }
                int i2 = GooglePlayServicesUtil.f4160e;
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resourcesForApplication = null;
                }
                if (resourcesForApplication != null) {
                    int identifier = resourcesForApplication.getIdentifier(str, TypedValues.Custom.S_STRING, "com.google.android.gms");
                    if (identifier == 0) {
                        StringBuilder sb = new StringBuilder(str.length() + 18);
                        sb.append("Missing resource: ");
                        sb.append(str);
                        Log.w("GoogleApiAvailability", sb.toString());
                    } else {
                        String string = resourcesForApplication.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            simpleArrayMap.put(str, string);
                            return string;
                        }
                        StringBuilder sb2 = new StringBuilder(str.length() + 20);
                        sb2.append("Got empty resource: ");
                        sb2.append(str);
                        Log.w("GoogleApiAvailability", sb2.toString());
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
