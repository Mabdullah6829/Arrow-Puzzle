package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbnx extends zzbel implements zzbnz {
    @Override // com.google.android.gms.internal.ads.zzbnz
    /* JADX INFO: renamed from: b */
    public final void mo5078b() {
        m4811u0(2, m4810u());
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    /* JADX INFO: renamed from: y */
    public final void mo5079y(String str) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeString(str);
        m4811u0(1, parcelM4810u);
    }
}
