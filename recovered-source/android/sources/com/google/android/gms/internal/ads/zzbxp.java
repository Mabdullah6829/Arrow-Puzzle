package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;

/* JADX INFO: loaded from: classes2.dex */
final class zzbxp implements MediationAdLoadCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzbwz f9480a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzbvp f9481b;

    public zzbxp(zzbxv zzbxvVar, zzbwz zzbwzVar, zzbvp zzbvpVar) {
        this.f9480a = zzbwzVar;
        this.f9481b = zzbvpVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    /* JADX INFO: renamed from: a */
    public final void mo3278a(AdError adError) {
        try {
            this.f9480a.mo5236q(adError.m2745a());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
        }
    }
}
