package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcak extends zzbem implements zzcal {
    public zzcak() {
        super("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 != 1) {
            return false;
        }
        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("FlagsAccessedBeforeInitialized", new zzcai("Flags were accessed before initialized."));
        parcel2.writeNoException();
        return true;
    }
}
