package com.google.android.gms.common.api;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public abstract class ResolvingResultCallbacks<R extends Result> extends ResultCallbacks<R> {
    @Override // com.google.android.gms.common.api.ResultCallbacks
    /* JADX INFO: renamed from: b */
    public final void mo3429b(Status status) {
        PendingIntent pendingIntent = status.f4212u;
        if (pendingIntent == null) {
            m3430d();
            return;
        }
        if (pendingIntent != null) {
            try {
                if (Build.VERSION.SDK_INT >= 34) {
                    ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle();
                }
                Preconditions.m3544h(pendingIntent);
                pendingIntent.getIntentSender();
                throw null;
            } catch (IntentSender.SendIntentException e) {
                Log.e("ResolvingResultCallback", "Failed to start resolution", e);
                new Status(8, null, null, null);
                m3430d();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void m3430d();
}
