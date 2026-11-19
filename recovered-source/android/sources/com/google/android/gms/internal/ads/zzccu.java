package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzccu extends zzbel implements zzccw {
    public zzccu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    /* JADX INFO: renamed from: a */
    public final void mo5338a() {
        m4811u0(1, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    /* JADX INFO: renamed from: o */
    public final void mo5339o(int i2) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeInt(i2);
        m4811u0(2, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    /* JADX INFO: renamed from: q */
    public final void mo5340q(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel parcelM4810u = m4810u();
        zzben.m4815c(parcelM4810u, zzeVar);
        m4811u0(3, parcelM4810u);
    }
}
