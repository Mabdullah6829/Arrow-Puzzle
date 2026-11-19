package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzetw implements zzddc {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzetk f14878s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzbsr f14879t;

    public /* synthetic */ zzetw(zzetk zzetkVar, zzbsr zzbsrVar) {
        this.f14878s = zzetkVar;
        this.f14879t = zzbsrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void mo5830v(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.f14878s.mo5830v(zzeVar);
        zzbsr zzbsrVar = this.f14879t;
        if (zzbsrVar != null) {
            try {
                zzbsrVar.mo5126q(zzeVar);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
            }
        }
        if (zzbsrVar != null) {
            try {
                zzbsrVar.mo5125o(zzeVar.f3106s);
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e2);
            }
        }
    }
}
