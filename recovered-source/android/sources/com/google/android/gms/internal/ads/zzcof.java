package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcof implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzcnz f10637a;

    public zzcof(zzcnz zzcnzVar) {
        this.f10637a = zzcnzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        com.google.android.gms.ads.internal.client.zzez liteSdkVersion;
        com.google.android.gms.ads.internal.client.zzcv zzcvVar = zzfmc.m6524a(this.f10637a.m5709a()).f16103b;
        if (zzcvVar != null) {
            try {
                liteSdkVersion = zzcvVar.getLiteSdkVersion();
            } catch (RemoteException unused) {
                liteSdkVersion = null;
            }
        } else {
            liteSdkVersion = null;
        }
        if (liteSdkVersion != null) {
            return liteSdkVersion.f3177u;
        }
        return null;
    }
}
