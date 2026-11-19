package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;

/* JADX INFO: loaded from: classes2.dex */
final class zzbxn implements MediationAdLoadCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzbww f9476a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzbvp f9477b;

    public zzbxn(zzbxv zzbxvVar, zzbww zzbwwVar, zzbvp zzbvpVar) {
        this.f9476a = zzbwwVar;
        this.f9477b = zzbvpVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    /* JADX INFO: renamed from: a */
    public final void mo3278a(AdError adError) {
        try {
            this.f9476a.mo5235q(adError.m2745a());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
        }
    }
}
