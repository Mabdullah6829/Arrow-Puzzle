package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbzh extends zzbem implements zzbzi {

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ int f9564s = 0;

    public zzbzh() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        switch (i2) {
            case 1:
                Bundle bundle = (Bundle) zzben.m4814b(parcel, Bundle.CREATOR);
                zzben.m4818f(parcel);
                mo2992Q3(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                zzi();
                parcel2.writeNoException();
                return true;
            case 3:
                zzj();
                parcel2.writeNoException();
                return true;
            case 4:
                zzk();
                parcel2.writeNoException();
                return true;
            case 5:
                zzl();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle2 = (Bundle) zzben.m4814b(parcel, Bundle.CREATOR);
                zzben.m4818f(parcel);
                zzo(bundle2);
                parcel2.writeNoException();
                zzben.m4816d(parcel2, bundle2);
                return true;
            case 7:
                mo2991Q();
                parcel2.writeNoException();
                return true;
            case 8:
                mo2989F();
                parcel2.writeNoException();
                return true;
            case 9:
                mo2996h();
                parcel2.writeNoException();
                return true;
            case 10:
                mo2993a();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean zMo2995c = mo2995c();
                parcel2.writeNoException();
                ClassLoader classLoader = zzben.f7689a;
                parcel2.writeInt(zMo2995c ? 1 : 0);
                return true;
            case 12:
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                Intent intent = (Intent) zzben.m4814b(parcel, Intent.CREATOR);
                zzben.m4818f(parcel);
                mo3000x1(i3, i4, intent);
                parcel2.writeNoException();
                return true;
            case 13:
                IObjectWrapper.Stub.m3696k0(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                parcel2.writeNoException();
                return true;
            case 14:
                mo2994b();
                parcel2.writeNoException();
                return true;
            case 15:
                int i5 = parcel.readInt();
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                zzben.m4818f(parcel);
                mo2999o1(i5, strArrCreateStringArray, iArrCreateIntArray);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
