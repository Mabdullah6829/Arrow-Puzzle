package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcvn extends zzbgp {

    /* JADX INFO: renamed from: s */
    public final zzcvm f11574s;

    /* JADX INFO: renamed from: t */
    public final com.google.android.gms.ads.internal.client.zzbu f11575t;

    /* JADX INFO: renamed from: u */
    public final zzfgm f11576u;

    /* JADX INFO: renamed from: v */
    public boolean f11577v;

    /* JADX INFO: renamed from: w */
    public final zzdzt f11578w;

    public zzcvn(zzcvm zzcvmVar, com.google.android.gms.ads.internal.client.zzbu zzbuVar, zzfgm zzfgmVar, zzdzt zzdztVar) {
        this.f11574s = zzcvmVar;
        this.f11575t = zzbuVar;
        this.f11576u = zzfgmVar;
        this.f11578w = zzdztVar;
        zzbio zzbioVar = zzbix.f8641m1;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() && Build.VERSION.SDK_INT >= 35) {
            this.f11577v = true;
        } else {
            this.f11577v = ((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8658n1)).booleanValue();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    /* JADX INFO: renamed from: c */
    public final com.google.android.gms.ads.internal.client.zzdx mo4878c() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8095F7)).booleanValue()) {
            return this.f11574s.f11764f;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    /* JADX INFO: renamed from: i4 */
    public final void mo4879i4(IObjectWrapper iObjectWrapper, zzbgx zzbgxVar) {
        try {
            this.f11576u.f15626v.set(zzbgxVar);
            this.f11574s.m5843c((Activity) ObjectWrapper.m3697u0(iObjectWrapper), this.f11577v);
        } catch (RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
    }
}
