package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.privacysandbox.ads.adservices.measurement.AbstractC1631a;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.zaq;
import com.google.android.gms.common.internal.zaf;
import com.google.android.gms.common.internal.zaj;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes.dex */
public class GoogleApiAvailability extends GoogleApiAvailabilityLight {

    /* JADX INFO: renamed from: d */
    public static final Object f4153d = new Object();

    /* JADX INFO: renamed from: e */
    public static final GoogleApiAvailability f4154e = new GoogleApiAvailability();

    /* JADX INFO: renamed from: c */
    public zaq f4155c;

    /* JADX INFO: renamed from: e */
    public static AlertDialog m3396e(Activity activity, int i2, zaj zajVar, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        if (i2 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(android.R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(zaf.m3596b(activity, i2));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i2 == 1) {
            string = resources.getString(com.arrow.puzzle.escape.maze.free.game.R.string.common_google_play_services_install_button);
        } else if (i2 != 2) {
            string = i2 != 3 ? resources.getString(android.R.string.ok) : resources.getString(com.arrow.puzzle.escape.maze.free.game.R.string.common_google_play_services_enable_button);
        } else {
            string = resources.getString(com.arrow.puzzle.escape.maze.free.game.R.string.common_google_play_services_update_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, zajVar);
        }
        String strM3595a = zaf.m3595a(activity, i2);
        if (strM3595a != null) {
            builder.setTitle(strM3595a);
        }
        Log.w("GoogleApiAvailability", AbstractC0271e0.m396d(i2, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    /* JADX INFO: renamed from: h */
    public static void m3397h(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
                SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
                Preconditions.m3545i(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                supportErrorDialogFragment.f4172s = alertDialog;
                if (onCancelListener != null) {
                    supportErrorDialogFragment.f4173t = onCancelListener;
                }
                supportErrorDialogFragment.show(supportFragmentManager, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        android.app.FragmentManager fragmentManager = activity.getFragmentManager();
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        Preconditions.m3545i(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        errorDialogFragment.f4146s = alertDialog;
        if (onCancelListener != null) {
            errorDialogFragment.f4147t = onCancelListener;
        }
        errorDialogFragment.show(fragmentManager, str);
    }

    /* JADX INFO: renamed from: d */
    public final void m3398d(GoogleApiActivity googleApiActivity, int i2, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogM3396e = m3396e(googleApiActivity, i2, zaj.m3601b(super.m3402b(googleApiActivity, i2, "d"), googleApiActivity), googleApiActivity2);
        if (alertDialogM3396e == null) {
            return;
        }
        m3397h(googleApiActivity, alertDialogM3396e, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    /* JADX INFO: renamed from: f */
    public final void m3399f(Activity activity, LifecycleFragment lifecycleFragment, int i2, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogM3396e = m3396e(activity, i2, zaj.m3602c(super.m3402b(activity, i2, "d"), lifecycleFragment), onCancelListener);
        if (alertDialogM3396e == null) {
            return;
        }
        m3397h(activity, alertDialogM3396e, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    /* JADX INFO: renamed from: g */
    public final void m3400g(Context context, int i2, PendingIntent pendingIntent) {
        int i3;
        Log.w("GoogleApiAvailability", AbstractC0271e0.m397e(i2, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i2 == 18) {
            new zad(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i2 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strM3599e = i2 == 6 ? zaf.m3599e(context, "common_google_play_services_resolution_required_title") : zaf.m3595a(context, i2);
        if (strM3599e == null) {
            strM3599e = context.getResources().getString(com.arrow.puzzle.escape.maze.free.game.R.string.common_google_play_services_notification_ticker);
        }
        String strM3598d = (i2 == 6 || i2 == 19) ? zaf.m3598d(context, "common_google_play_services_resolution_required_text", zaf.m3597c(context)) : zaf.m3596b(context, i2);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        Preconditions.m3544h(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        NotificationCompat.Builder style = new NotificationCompat.Builder(context).setLocalOnly(true).setAutoCancel(true).setContentTitle(strM3599e).setStyle(new NotificationCompat.BigTextStyle().bigText(strM3598d));
        boolean zM3644b = DeviceProperties.m3644b(context);
        int i4 = android.R.drawable.stat_sys_warning;
        if (zM3644b) {
            int i5 = context.getApplicationInfo().icon;
            if (i5 != 0) {
                i4 = i5;
            }
            style.setSmallIcon(i4).setPriority(2);
            if (DeviceProperties.m3645c(context)) {
                style.addAction(2131165317, resources.getString(com.arrow.puzzle.escape.maze.free.game.R.string.common_open_on_phone), pendingIntent);
            } else {
                style.setContentIntent(pendingIntent);
            }
        } else {
            style.setSmallIcon(android.R.drawable.stat_sys_warning).setTicker(resources.getString(com.arrow.puzzle.escape.maze.free.game.R.string.common_google_play_services_notification_ticker)).setWhen(System.currentTimeMillis()).setContentIntent(pendingIntent).setContentText(strM3598d);
        }
        if (PlatformVersion.m3653a()) {
            Preconditions.m3546j(PlatformVersion.m3653a());
            synchronized (f4153d) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.arrow.puzzle.escape.maze.free.game.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(AbstractC1631a.m2591e(string));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            style.setChannelId("com.google.android.gms.availability");
        }
        Notification notificationBuild = style.build();
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            GooglePlayServicesUtilLight.f4161a.set(false);
            i3 = 10436;
        } else {
            i3 = 39789;
        }
        notificationManager.notify(i3, notificationBuild);
    }
}
