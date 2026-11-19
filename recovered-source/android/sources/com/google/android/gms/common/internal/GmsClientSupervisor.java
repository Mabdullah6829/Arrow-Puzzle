package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class GmsClientSupervisor {

    /* JADX INFO: renamed from: a */
    public static final Object f4442a = new Object();

    /* JADX INFO: renamed from: b */
    public static zzq f4443b;

    /* JADX INFO: renamed from: c */
    public static HandlerThread f4444c;

    /* JADX INFO: renamed from: a */
    public static GmsClientSupervisor m3530a(Context context) {
        synchronized (f4442a) {
            try {
                if (f4443b == null) {
                    f4443b = new zzq(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f4443b;
    }

    /* JADX INFO: renamed from: b */
    public abstract ConnectionResult mo3531b(zzn zznVar, zze zzeVar, String str, Executor executor);

    /* JADX INFO: renamed from: c */
    public abstract void mo3532c(zzn zznVar, ServiceConnection serviceConnection);
}
