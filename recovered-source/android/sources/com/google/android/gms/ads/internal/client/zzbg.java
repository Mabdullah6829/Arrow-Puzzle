package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbg extends zzbem implements zzbh {
    public zzbg() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        switch (i2) {
            case 1:
                zzb();
                break;
            case 2:
                int i3 = parcel.readInt();
                zzben.m4818f(parcel);
                mo2818A(i3);
                break;
            case 3:
                break;
            case 4:
                mo2820b();
                break;
            case 5:
                mo2821c();
                break;
            case 6:
                zzh();
                break;
            case 7:
                zzj();
                break;
            case 8:
                zze zzeVar = (zze) zzben.m4814b(parcel, zze.CREATOR);
                zzben.m4818f(parcel);
                mo2822d0(zzeVar);
                break;
            case 9:
                zzi();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
