package com.google.android.gms.ads.preload;

import android.content.ContextWrapper;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzch;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbvf;

/* JADX INFO: loaded from: classes.dex */
public class zzb {

    /* JADX INFO: renamed from: a */
    public final zzch f4010a;

    /* JADX INFO: renamed from: b */
    public final AdFormat f4011b;

    public zzb(ContextWrapper contextWrapper, AdFormat adFormat) {
        if (com.google.android.gms.ads.zzb.f4026a == null) {
            synchronized (com.google.android.gms.ads.zzb.class) {
                try {
                    if (com.google.android.gms.ads.zzb.f4026a == null) {
                        com.google.android.gms.ads.zzb.f4026a = zzay.f3085g.f3087b.m2804d(contextWrapper, new zzbvf());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f4010a = com.google.android.gms.ads.zzb.f4026a;
        contextWrapper.getApplicationContext();
        this.f4011b = adFormat;
    }

    /* JADX INFO: renamed from: a */
    public final void m3357a() {
        try {
            this.f4010a.mo2887X(this.f4011b.f2939s);
        } catch (RemoteException e) {
            zzo.m3076i("#007 Could not call remote method.", e);
        }
    }
}
