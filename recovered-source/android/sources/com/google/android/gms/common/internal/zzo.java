package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class zzo implements ServiceConnection, zzr {

    /* JADX INFO: renamed from: s */
    public final HashMap f4537s;

    /* JADX INFO: renamed from: t */
    public int f4538t;

    /* JADX INFO: renamed from: u */
    public boolean f4539u;

    /* JADX INFO: renamed from: v */
    public IBinder f4540v;

    /* JADX INFO: renamed from: w */
    public final zzn f4541w;

    /* JADX INFO: renamed from: x */
    public ComponentName f4542x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ zzq f4543y;

    public zzo(zzq zzqVar, zzn zznVar) {
        java.util.Objects.requireNonNull(zzqVar);
        this.f4543y = zzqVar;
        this.f4541w = zznVar;
        this.f4537s = new HashMap();
        this.f4538t = 2;
    }

    /* JADX INFO: renamed from: a */
    public final ConnectionResult m3613a(Executor executor, String str) throws Throwable {
        try {
            Intent intentM3611a = zzah.m3611a(this.f4543y.f4546e, this.f4541w);
            this.f4538t = 3;
            StrictMode.VmPolicy vmPolicyM3660a = com.google.android.gms.common.util.zzd.m3660a();
            try {
                zzq zzqVar = this.f4543y;
                ConnectionTracker connectionTracker = zzqVar.f4548g;
                Context context = zzqVar.f4546e;
                zzn zznVar = this.f4541w;
                try {
                    boolean zM3635d = connectionTracker.m3635d(context, str, intentM3611a, this, 4225, executor);
                    this.f4539u = zM3635d;
                    if (zM3635d) {
                        zzqVar.f4547f.sendMessageDelayed(zzqVar.f4547f.obtainMessage(1, zznVar), zzqVar.f4550i);
                        ConnectionResult connectionResult = ConnectionResult.f4140x;
                        StrictMode.setVmPolicy(vmPolicyM3660a);
                        return connectionResult;
                    }
                    this.f4538t = 2;
                    try {
                        zzqVar.f4548g.m3634c(zzqVar.f4546e, this);
                    } catch (IllegalArgumentException unused) {
                    }
                    ConnectionResult connectionResult2 = new ConnectionResult(null, null, 16);
                    StrictMode.setVmPolicy(vmPolicyM3660a);
                    return connectionResult2;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    StrictMode.setVmPolicy(vmPolicyM3660a);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (zzaf e) {
            return e.f4515s;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzq zzqVar = this.f4543y;
        synchronized (zzqVar.f4545d) {
            try {
                zzqVar.f4547f.removeMessages(1, this.f4541w);
                this.f4540v = iBinder;
                this.f4542x = componentName;
                Iterator it = this.f4537s.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f4538t = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzq zzqVar = this.f4543y;
        synchronized (zzqVar.f4545d) {
            try {
                zzqVar.f4547f.removeMessages(1, this.f4541w);
                this.f4540v = null;
                this.f4542x = componentName;
                Iterator it = this.f4537s.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f4538t = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
