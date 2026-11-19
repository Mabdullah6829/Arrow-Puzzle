package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbhe {

    /* JADX INFO: renamed from: a */
    public ScheduledFuture f7842a = null;

    /* JADX INFO: renamed from: b */
    public final Runnable f7843b = new zzbha(this);

    /* JADX INFO: renamed from: c */
    public final Object f7844c = new Object();

    /* JADX INFO: renamed from: d */
    public zzbhh f7845d;

    /* JADX INFO: renamed from: e */
    public Context f7846e;

    /* JADX INFO: renamed from: f */
    public zzbhk f7847f;

    /* JADX INFO: renamed from: a */
    public final void m4881a(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.f7844c) {
            try {
                if (this.f7846e != null) {
                    return;
                }
                this.f7846e = context.getApplicationContext();
                zzbio zzbioVar = zzbix.f8527f5;
                com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                    m4884d();
                } else {
                    if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8510e5)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.f3698C.f3707g.m4852b(new zzbhb(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final zzbhf m4882b(zzbhi zzbhiVar) {
        synchronized (this.f7844c) {
            if (this.f7847f == null) {
                return new zzbhf();
            }
            try {
                if (this.f7845d.m4888e()) {
                    zzbhk zzbhkVar = this.f7847f;
                    Parcel parcelM4810u = zzbhkVar.m4810u();
                    zzben.m4815c(parcelM4810u, zzbhiVar);
                    Parcel parcelM4809k0 = zzbhkVar.m4809k0(2, parcelM4810u);
                    zzbhf zzbhfVar = (zzbhf) zzben.m4814b(parcelM4809k0, zzbhf.CREATOR);
                    parcelM4809k0.recycle();
                    return zzbhfVar;
                }
                zzbhk zzbhkVar2 = this.f7847f;
                Parcel parcelM4810u2 = zzbhkVar2.m4810u();
                zzben.m4815c(parcelM4810u2, zzbhiVar);
                Parcel parcelM4809k1 = zzbhkVar2.m4809k0(1, parcelM4810u2);
                zzbhf zzbhfVar2 = (zzbhf) zzben.m4814b(parcelM4809k1, zzbhf.CREATOR);
                parcelM4809k1.recycle();
                return zzbhfVar2;
            } catch (RemoteException e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("Unable to call into cache service.", e);
                return new zzbhf();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m4883c() {
        synchronized (this.f7844c) {
            try {
                zzbhh zzbhhVar = this.f7845d;
                if (zzbhhVar == null) {
                    return;
                }
                if (zzbhhVar.isConnected() || this.f7845d.isConnecting()) {
                    this.f7845d.disconnect();
                }
                this.f7845d = null;
                this.f7847f = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4884d() {
        zzbhh zzbhhVar;
        synchronized (this.f7844c) {
            if (this.f7846e != null && this.f7845d == null) {
                zzbhc zzbhcVar = new zzbhc(this);
                zzbhd zzbhdVar = new zzbhd(this);
                synchronized (this) {
                    zzbhhVar = new zzbhh(this.f7846e, com.google.android.gms.ads.internal.zzt.f3698C.f3720t.m3128a(), zzbhcVar, zzbhdVar);
                }
                this.f7845d = zzbhhVar;
                zzbhhVar.checkAvailabilityAndConnect();
            }
        }
    }
}
