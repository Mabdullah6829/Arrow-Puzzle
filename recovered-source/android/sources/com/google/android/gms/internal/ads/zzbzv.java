package com.google.android.gms.internal.ads;

import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbzv extends zzbel implements zzbzx {
    @Override // com.google.android.gms.internal.ads.zzbzx
    /* JADX INFO: renamed from: j0 */
    public final void mo5280j0(String str) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeString(str);
        m4811u0(2, parcelM4810u);
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final void zze(List list) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeTypedList(list);
        m4811u0(1, parcelM4810u);
    }
}
