package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbfm;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzck extends zzbem implements zzcl {

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ int f3103s = 0;

    public zzck() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 != 1) {
            return false;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        zzben.m4818f(parcel);
        ((zzbfm) this).mo2889n0(string, string2);
        parcel2.writeNoException();
        return true;
    }
}
