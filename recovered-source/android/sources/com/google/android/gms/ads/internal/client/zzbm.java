package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbm extends zzbem implements zzbn {
    public zzbm() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 1) {
            zzm zzmVar = (zzm) zzben.m4814b(parcel, zzm.CREATOR);
            zzben.m4818f(parcel);
            mo2824Z(zzmVar);
            parcel2.writeNoException();
            return true;
        }
        if (i2 == 2) {
            String strMo2825b = mo2825b();
            parcel2.writeNoException();
            parcel2.writeString(strMo2825b);
            return true;
        }
        if (i2 == 3) {
            boolean zMo2826c = mo2826c();
            parcel2.writeNoException();
            ClassLoader classLoader = zzben.f7689a;
            parcel2.writeInt(zMo2826c ? 1 : 0);
            return true;
        }
        if (i2 == 4) {
            String strZzh = zzh();
            parcel2.writeNoException();
            parcel2.writeString(strZzh);
            return true;
        }
        if (i2 != 5) {
            return false;
        }
        zzm zzmVar2 = (zzm) zzben.m4814b(parcel, zzm.CREATOR);
        int i3 = parcel.readInt();
        zzben.m4818f(parcel);
        mo2827n1(zzmVar2, i3);
        parcel2.writeNoException();
        return true;
    }
}
