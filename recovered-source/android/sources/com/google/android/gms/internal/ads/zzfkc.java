package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* JADX INFO: loaded from: classes2.dex */
final class zzfkc implements OnAdMetadataChangedListener {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzdn f15844s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzfke f15845t;

    public zzfkc(zzfke zzfkeVar, com.google.android.gms.ads.internal.client.zzdn zzdnVar) {
        this.f15844s = zzdnVar;
        this.f15845t = zzfkeVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    /* JADX INFO: renamed from: g */
    public final void mo3359g() {
        if (this.f15845t.f15848B != null) {
            try {
                this.f15844s.mo2911a();
            } catch (RemoteException e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
            }
        }
    }
}
