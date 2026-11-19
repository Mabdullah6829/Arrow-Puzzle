package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class zzab extends com.google.android.gms.internal.common.zza implements zzad {
    @Override // com.google.android.gms.common.internal.zzad
    /* JADX INFO: renamed from: N0 */
    public final boolean mo3608N0(com.google.android.gms.common.zzt zztVar, ObjectWrapper objectWrapper) {
        Parcel parcelM9084k0 = m9084k0();
        int i2 = com.google.android.gms.internal.common.zzc.f21582a;
        parcelM9084k0.writeInt(1);
        zztVar.writeToParcel(parcelM9084k0, 0);
        com.google.android.gms.internal.common.zzc.m9104b(parcelM9084k0, objectWrapper);
        Parcel parcelM9085u = m9085u(5, parcelM9084k0);
        boolean z = parcelM9085u.readInt() != 0;
        parcelM9085u.recycle();
        return z;
    }

    @Override // com.google.android.gms.common.internal.zzad
    /* JADX INFO: renamed from: W2 */
    public final com.google.android.gms.common.zzr mo3609W2(com.google.android.gms.common.zzp zzpVar) {
        Parcel parcelM9084k0 = m9084k0();
        int i2 = com.google.android.gms.internal.common.zzc.f21582a;
        parcelM9084k0.writeInt(1);
        zzpVar.writeToParcel(parcelM9084k0, 0);
        Parcel parcelM9085u = m9085u(6, parcelM9084k0);
        com.google.android.gms.common.zzr zzrVar = (com.google.android.gms.common.zzr) com.google.android.gms.internal.common.zzc.m9103a(parcelM9085u, com.google.android.gms.common.zzr.CREATOR);
        parcelM9085u.recycle();
        return zzrVar;
    }

    @Override // com.google.android.gms.common.internal.zzad
    /* JADX INFO: renamed from: c */
    public final boolean mo3610c() {
        Parcel parcelM9085u = m9085u(7, m9084k0());
        int i2 = com.google.android.gms.internal.common.zzc.f21582a;
        boolean z = parcelM9085u.readInt() != 0;
        parcelM9085u.recycle();
        return z;
    }
}
