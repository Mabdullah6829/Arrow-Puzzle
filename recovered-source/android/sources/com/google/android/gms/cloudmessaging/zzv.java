package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class zzv {

    /* JADX INFO: renamed from: e */
    public static zzv f4126e;

    /* JADX INFO: renamed from: a */
    public final Context f4127a;

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f4128b;

    /* JADX INFO: renamed from: c */
    public zzp f4129c = new zzp(this);

    /* JADX INFO: renamed from: d */
    public int f4130d = 1;

    public zzv(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f4128b = scheduledExecutorService;
        this.f4127a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    public static synchronized zzv m3385a(Context context) {
        try {
            if (f4126e == null) {
                f4126e = new zzv(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new NamedThreadFactory("MessengerIpcClient"))));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4126e;
    }

    /* JADX INFO: renamed from: b */
    public final Task m3386b(int i2, Bundle bundle) {
        int i3;
        synchronized (this) {
            i3 = this.f4130d;
            this.f4130d = i3 + 1;
        }
        return m3388d(new zzr(i3, i2, bundle));
    }

    /* JADX INFO: renamed from: c */
    public final Task m3387c(int i2, Bundle bundle) {
        int i3;
        synchronized (this) {
            i3 = this.f4130d;
            this.f4130d = i3 + 1;
        }
        return m3388d(new zzu(i3, i2, bundle));
    }

    /* JADX INFO: renamed from: d */
    public final synchronized Task m3388d(zzs zzsVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(zzsVar.toString()));
            }
            if (!this.f4129c.m3380d(zzsVar)) {
                zzp zzpVar = new zzp(this);
                this.f4129c = zzpVar;
                zzpVar.m3380d(zzsVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzsVar.f4123b.f23216a;
    }
}
