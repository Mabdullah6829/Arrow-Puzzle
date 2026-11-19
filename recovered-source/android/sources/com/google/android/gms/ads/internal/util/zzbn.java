package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbn extends zzbem implements zzbo {
    public zzbn() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 1) {
            IObjectWrapper iObjectWrapperM3696k0 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
            String string = parcel.readString();
            String string2 = parcel.readString();
            zzben.m4818f(parcel);
            boolean zZze = zze(iObjectWrapperM3696k0, string, string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZze ? 1 : 0);
            return true;
        }
        if (i2 == 2) {
            IObjectWrapper iObjectWrapperM3696k1 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
            zzben.m4818f(parcel);
            zzf(iObjectWrapperM3696k1);
            parcel2.writeNoException();
            return true;
        }
        if (i2 != 3) {
            return false;
        }
        IObjectWrapper iObjectWrapperM3696k2 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
        com.google.android.gms.ads.internal.offline.buffering.zza zzaVar = (com.google.android.gms.ads.internal.offline.buffering.zza) zzben.m4814b(parcel, com.google.android.gms.ads.internal.offline.buffering.zza.CREATOR);
        zzben.m4818f(parcel);
        boolean zZzg = zzg(iObjectWrapperM3696k2, zzaVar);
        parcel2.writeNoException();
        parcel2.writeInt(zZzg ? 1 : 0);
        return true;
    }
}
