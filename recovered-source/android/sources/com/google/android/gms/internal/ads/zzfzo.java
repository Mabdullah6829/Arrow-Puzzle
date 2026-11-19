package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfzo extends zzbem implements zzfzp {
    public zzfzo() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        switch (i2) {
            case 2:
                IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                parcel.readString();
                zzben.m4818f(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                zzben.m4818f(parcel);
                break;
            case 5:
                parcel.createByteArray();
                zzben.m4818f(parcel);
                break;
            case 6:
                parcel.readInt();
                zzben.m4818f(parcel);
                break;
            case 7:
                parcel.readInt();
                zzben.m4818f(parcel);
                break;
            case 8:
                IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                zzben.m4818f(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
