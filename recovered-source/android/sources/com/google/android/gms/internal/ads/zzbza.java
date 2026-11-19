package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Parcel;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbza extends zzbem implements zzbzb {

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ int f9562s = 0;

    public zzbza() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        switch (i2) {
            case 1:
                Intent intent = (Intent) zzben.m4814b(parcel, Intent.CREATOR);
                zzben.m4818f(parcel);
                ((zzekz) this).mo5277q0(intent);
                break;
            case 2:
                IObjectWrapper iObjectWrapperM3696k0 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                String string = parcel.readString();
                String string2 = parcel.readString();
                zzben.m4818f(parcel);
                ((zzekz) this).mo5274X3(iObjectWrapperM3696k0, new com.google.android.gms.ads.internal.offline.buffering.zza(string, string2, ""));
                break;
            case 3:
                ((zzekz) this).mo5276c();
                break;
            case 4:
                ((zzekz) this).mo5275b0(AbstractC1456a.m2440g(parcel, parcel));
                break;
            case 5:
                ((zzekz) this).mo5273P3(parcel.createStringArray(), parcel.createIntArray(), AbstractC1456a.m2440g(parcel, parcel));
                break;
            case 6:
                IObjectWrapper iObjectWrapperM3696k1 = IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.offline.buffering.zza zzaVar = (com.google.android.gms.ads.internal.offline.buffering.zza) zzben.m4814b(parcel, com.google.android.gms.ads.internal.offline.buffering.zza.CREATOR);
                zzben.m4818f(parcel);
                ((zzekz) this).mo5274X3(iObjectWrapperM3696k1, zzaVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
