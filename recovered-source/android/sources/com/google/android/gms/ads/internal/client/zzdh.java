package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;

/* JADX INFO: loaded from: classes.dex */
public final class zzdh implements MuteThisAdReason {

    /* JADX INFO: renamed from: a */
    public final String f3104a;

    /* JADX INFO: renamed from: b */
    public final zzdg f3105b;

    public zzdh(zzdg zzdgVar) {
        String strMo2907a;
        this.f3105b = zzdgVar;
        try {
            strMo2907a = zzdgVar.mo2907a();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
            strMo2907a = null;
        }
        this.f3104a = strMo2907a;
    }

    public final String toString() {
        return this.f3104a;
    }
}
