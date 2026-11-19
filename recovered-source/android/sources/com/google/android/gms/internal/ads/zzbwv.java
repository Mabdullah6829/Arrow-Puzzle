package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbwv extends zzbem implements zzbww {
    public zzbwv() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        zzbvs zzbvqVar;
        if (i2 == 1) {
            IObjectWrapper iObjectWrapperM2440g = AbstractC1456a.m2440g(parcel, parcel);
            zzeni zzeniVar = (zzeni) this;
            zzeniVar.f14287t.f14290c = (View) ObjectWrapper.m3697u0(iObjectWrapperM2440g);
            ((zzenp) zzeniVar.f14286s.f14193c).zzj();
        } else if (i2 == 2) {
            String string = parcel.readString();
            zzben.m4818f(parcel);
            ((zzenp) ((zzeni) this).f14286s.f14193c).mo5198f4(0, string);
        } else if (i2 == 3) {
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzben.m4814b(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzben.m4818f(parcel);
            ((zzeni) this).mo5235q(zzeVar);
        } else {
            if (i2 != 4) {
                return false;
            }
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzbvqVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
                zzbvqVar = iInterfaceQueryLocalInterface instanceof zzbvs ? (zzbvs) iInterfaceQueryLocalInterface : new zzbvq(strongBinder);
            }
            zzben.m4818f(parcel);
            zzeni zzeniVar2 = (zzeni) this;
            zzeniVar2.f14287t.f14291d = zzbvqVar;
            ((zzenp) zzeniVar2.f14286s.f14193c).zzj();
        }
        parcel2.writeNoException();
        return true;
    }
}
