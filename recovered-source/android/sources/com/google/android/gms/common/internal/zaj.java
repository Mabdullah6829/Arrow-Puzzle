package com.google.android.gms.common.internal;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.LifecycleFragment;

/* JADX INFO: loaded from: classes.dex */
public abstract class zaj implements DialogInterface.OnClickListener {
    /* JADX INFO: renamed from: b */
    public static zaj m3601b(Intent intent, GoogleApiActivity googleApiActivity) {
        return new zag(intent, googleApiActivity);
    }

    /* JADX INFO: renamed from: c */
    public static zaj m3602c(Intent intent, LifecycleFragment lifecycleFragment) {
        return new zai(intent, lifecycleFragment);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo3600a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        try {
            try {
                mo3600a();
            } catch (ActivityNotFoundException e) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
