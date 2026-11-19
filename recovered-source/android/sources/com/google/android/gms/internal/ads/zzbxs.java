package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;

/* JADX INFO: loaded from: classes2.dex */
final class zzbxs implements MediationAdLoadCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzbwt f9486a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzbvp f9487b;

    public zzbxs(zzbxv zzbxvVar, zzbwt zzbwtVar, zzbvp zzbvpVar) {
        this.f9486a = zzbwtVar;
        this.f9487b = zzbvpVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    /* JADX INFO: renamed from: a */
    public final void mo3278a(AdError adError) {
        try {
            this.f9486a.mo5234q(adError.m2745a());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
        }
    }
}
