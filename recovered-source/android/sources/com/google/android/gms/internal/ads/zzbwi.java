package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;

/* JADX INFO: loaded from: classes2.dex */
final class zzbwi implements MediationAdLoadCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzbvp f9453a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzbwk f9454b;

    public zzbwi(zzbwk zzbwkVar, zzbvp zzbvpVar) {
        this.f9453a = zzbvpVar;
        this.f9454b = zzbwkVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    /* JADX INFO: renamed from: a */
    public final void mo3278a(AdError adError) {
        int i2 = adError.f2928a;
        try {
            String canonicalName = this.f9454b.f9457s.getClass().getCanonicalName();
            String str = adError.f2929b;
            String str2 = adError.f2930c;
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41 + String.valueOf(i2).length() + 17 + String.valueOf(str).length() + 16 + String.valueOf(str2).length());
            sb.append(canonicalName);
            sb.append("failed to load mediation ad: ErrorCode = ");
            sb.append(i2);
            sb.append(". ErrorMessage = ");
            sb.append(str);
            sb.append(". ErrorDomain = ");
            sb.append(str2);
            com.google.android.gms.ads.internal.util.client.zzo.m3068a(sb.toString());
            zzbvp zzbvpVar = this.f9453a;
            zzbvpVar.mo5187C0(adError.m2745a());
            zzbvpVar.mo5198f4(i2, str);
            zzbvpVar.mo5202p(i2);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
        }
    }
}
