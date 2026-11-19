package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
abstract class zzs {

    /* JADX INFO: renamed from: a */
    public final int f4122a;

    /* JADX INFO: renamed from: b */
    public final TaskCompletionSource f4123b = new TaskCompletionSource();

    /* JADX INFO: renamed from: c */
    public final int f4124c;

    /* JADX INFO: renamed from: d */
    public final Bundle f4125d;

    public zzs(int i2, int i3, Bundle bundle) {
        this.f4122a = i2;
        this.f4124c = i3;
        this.f4125d = bundle;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo3381a(Bundle bundle);

    /* JADX INFO: renamed from: b */
    public abstract boolean mo3382b();

    /* JADX INFO: renamed from: c */
    public final void m3383c(zzt zztVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + zztVar.toString());
        }
        this.f4123b.m10767a(zztVar);
    }

    /* JADX INFO: renamed from: d */
    public final void m3384d(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(bundle));
        }
        this.f4123b.m10768b(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.f4124c + " id=" + this.f4122a + " oneWay=" + mo3382b() + "}";
    }
}
