package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbgy {

    /* JADX INFO: renamed from: a */
    public com.google.android.gms.ads.internal.client.zzbu f7831a;

    /* JADX INFO: renamed from: b */
    public final Context f7832b;

    /* JADX INFO: renamed from: c */
    public final String f7833c;

    /* JADX INFO: renamed from: d */
    public final com.google.android.gms.ads.internal.client.zzeh f7834d;

    /* JADX INFO: renamed from: e */
    public final AppOpenAd.AppOpenAdLoadCallback f7835e;

    /* JADX INFO: renamed from: f */
    public final zzbvf f7836f = new zzbvf();

    /* JADX INFO: renamed from: g */
    public final com.google.android.gms.ads.internal.client.zzq f7837g = com.google.android.gms.ads.internal.client.zzq.f3248a;

    public zzbgy(Context context, String str, com.google.android.gms.ads.internal.client.zzeh zzehVar, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.f7832b = context;
        this.f7833c = str;
        this.f7834d = zzehVar;
        this.f7835e = appOpenAdLoadCallback;
    }

    /* JADX INFO: renamed from: a */
    public final void m4880a() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.google.android.gms.ads.internal.client.zzr zzrVarM2980H = com.google.android.gms.ads.internal.client.zzr.m2980H();
            com.google.android.gms.ads.internal.client.zzaw zzawVar = com.google.android.gms.ads.internal.client.zzay.f3085g.f3087b;
            Context context = this.f7832b;
            String str = this.f7833c;
            com.google.android.gms.ads.internal.client.zzbu zzbuVarM2801a = zzawVar.m2801a(context, zzrVarM2980H, str, this.f7836f);
            this.f7831a = zzbuVarM2801a;
            if (zzbuVarM2801a != null) {
                com.google.android.gms.ads.internal.client.zzeh zzehVar = this.f7834d;
                zzehVar.f3139n = jCurrentTimeMillis;
                zzbuVarM2801a.mo2854c2(new zzbgl(this.f7835e, str));
                com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.f7831a;
                this.f7837g.getClass();
                zzbuVar.mo2850Z(com.google.android.gms.ads.internal.client.zzq.m2979a(context, zzehVar));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
    }
}
