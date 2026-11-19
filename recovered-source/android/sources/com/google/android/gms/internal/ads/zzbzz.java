package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbzz {

    /* JADX INFO: renamed from: c */
    public static zzcet f9570c;

    /* JADX INFO: renamed from: a */
    public final Context f9571a;

    /* JADX INFO: renamed from: b */
    public final com.google.android.gms.ads.internal.client.zzeh f9572b;

    public zzbzz(Context context, com.google.android.gms.ads.internal.client.zzeh zzehVar) {
        this.f9571a = context;
        this.f9572b = zzehVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m5284a(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzcet zzcetVar;
        com.google.android.gms.ads.internal.client.zzm zzmVarM2979a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Context context = this.f9571a;
        synchronized (zzbzz.class) {
            try {
                if (f9570c == null) {
                    f9570c = com.google.android.gms.ads.internal.client.zzay.f3085g.f3087b.m2809i(context, new zzbvf());
                }
                zzcetVar = f9570c;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zzcetVar == null) {
            queryInfoGenerationCallback.mo3330a("Internal Error, query info generator is null.");
            return;
        }
        ObjectWrapper objectWrapper = new ObjectWrapper(context);
        com.google.android.gms.ads.internal.client.zzeh zzehVar = this.f9572b;
        if (zzehVar == null) {
            com.google.android.gms.ads.internal.client.zzn zznVar = new com.google.android.gms.ads.internal.client.zzn();
            zznVar.f3246l = jCurrentTimeMillis;
            zzmVarM2979a = zznVar.m2978a();
        } else {
            zzehVar.f3139n = jCurrentTimeMillis;
            com.google.android.gms.ads.internal.client.zzq.f3248a.getClass();
            zzmVarM2979a = com.google.android.gms.ads.internal.client.zzq.m2979a(context, zzehVar);
        }
        try {
            zzcetVar.mo3322E0(objectWrapper, new zzcex(null, "BANNER", null, zzmVarM2979a), new zzbzy(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.mo3330a("Internal Error.");
        }
    }
}
