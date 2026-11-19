package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;

/* JADX INFO: loaded from: classes2.dex */
final class zzbxq implements MediationAdLoadCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzbxc f9482a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzbvp f9483b;

    public zzbxq(zzbxv zzbxvVar, zzbxc zzbxcVar, zzbvp zzbvpVar) {
        this.f9482a = zzbxcVar;
        this.f9483b = zzbvpVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    /* JADX INFO: renamed from: a */
    public final void mo3278a(AdError adError) {
        try {
            this.f9482a.mo5237q(adError.m2745a());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
        }
    }
}
