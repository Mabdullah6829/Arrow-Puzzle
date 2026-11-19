package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzedw;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzds extends zzbem implements zzdt {
    public zzds() {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 != 1) {
            return false;
        }
        ((zzedw) this).mo2915N2(parcel.readString(), IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder()), AbstractC1456a.m2440g(parcel, parcel));
        parcel2.writeNoException();
        return true;
    }
}
