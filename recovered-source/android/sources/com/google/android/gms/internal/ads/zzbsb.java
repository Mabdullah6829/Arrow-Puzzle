package com.google.android.gms.internal.ads;

import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbsb extends zzbel implements zzbsd {
    @Override // com.google.android.gms.internal.ads.zzbsd
    /* JADX INFO: renamed from: i3 */
    public final void mo2942i3(List list) {
        Parcel parcelM4810u = m4810u();
        parcelM4810u.writeTypedList(list);
        m4811u0(1, parcelM4810u);
    }
}
