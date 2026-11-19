package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Looper;
import androidx.work.PeriodicWorkRequest;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class zzq extends GmsClientSupervisor {

    /* JADX INFO: renamed from: d */
    public final HashMap f4545d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final Context f4546e;

    /* JADX INFO: renamed from: f */
    public volatile com.google.android.gms.internal.common.zzg f4547f;

    /* JADX INFO: renamed from: g */
    public final ConnectionTracker f4548g;

    /* JADX INFO: renamed from: h */
    public final long f4549h;

    /* JADX INFO: renamed from: i */
    public final long f4550i;

    public zzq(Context context, Looper looper) {
        zzp zzpVar = new zzp(this);
        this.f4546e = context.getApplicationContext();
        com.google.android.gms.internal.common.zzg zzgVar = new com.google.android.gms.internal.common.zzg(looper, zzpVar);
        Looper.getMainLooper();
        this.f4547f = zzgVar;
        this.f4548g = ConnectionTracker.m3632b();
        this.f4549h = 5000L;
        this.f4550i = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    /* JADX INFO: renamed from: b */
    public final ConnectionResult mo3531b(zzn zznVar, zze zzeVar, String str, Executor executor) {
        ConnectionResult connectionResultM3613a;
        HashMap map = this.f4545d;
        synchronized (map) {
            try {
                zzo zzoVar = (zzo) map.get(zznVar);
                if (executor == null) {
                    executor = null;
                }
                if (zzoVar == null) {
                    zzoVar = new zzo(this, zznVar);
                    zzoVar.f4537s.put(zzeVar, zzeVar);
                    connectionResultM3613a = zzoVar.m3613a(executor, str);
                    map.put(zznVar, zzoVar);
                } else {
                    this.f4547f.removeMessages(0, zznVar);
                    if (zzoVar.f4537s.containsKey(zzeVar)) {
                        String string = zznVar.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(string);
                        throw new IllegalStateException(sb.toString());
                    }
                    zzoVar.f4537s.put(zzeVar, zzeVar);
                    int i2 = zzoVar.f4538t;
                    if (i2 == 1) {
                        zzeVar.onServiceConnected(zzoVar.f4542x, zzoVar.f4540v);
                    } else if (i2 == 2) {
                        connectionResultM3613a = zzoVar.m3613a(executor, str);
                    }
                    connectionResultM3613a = null;
                }
                if (zzoVar.f4539u) {
                    return ConnectionResult.f4140x;
                }
                if (connectionResultM3613a == null) {
                    connectionResultM3613a = new ConnectionResult(null, null, -1);
                }
                return connectionResultM3613a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    /* JADX INFO: renamed from: c */
    public final void mo3532c(zzn zznVar, ServiceConnection serviceConnection) {
        Preconditions.m3545i(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f4545d;
        synchronized (map) {
            try {
                zzo zzoVar = (zzo) map.get(zznVar);
                if (zzoVar == null) {
                    String string = zznVar.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                if (!zzoVar.f4537s.containsKey(serviceConnection)) {
                    String string2 = zznVar.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(string2);
                    throw new IllegalStateException(sb2.toString());
                }
                zzoVar.f4537s.remove(serviceConnection);
                if (zzoVar.f4537s.isEmpty()) {
                    this.f4547f.sendMessageDelayed(this.f4547f.obtainMessage(0, zznVar), this.f4549h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
