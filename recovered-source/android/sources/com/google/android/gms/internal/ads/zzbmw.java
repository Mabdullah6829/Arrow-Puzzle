package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbmw extends zzbem implements zzbmx {
    public zzbmw() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        List list;
        zzbml zzbmlVar;
        double d;
        String strM6010p;
        String strM6010p2;
        IObjectWrapper iObjectWrapper;
        switch (i2) {
            case 2:
                ObjectWrapper objectWrapper = new ObjectWrapper(((zzduj) this).f12991t);
                parcel2.writeNoException();
                zzben.m4817e(parcel2, objectWrapper);
                return true;
            case 3:
                String strM5998a = ((zzduj) this).f12992u.m5998a();
                parcel2.writeNoException();
                parcel2.writeString(strM5998a);
                return true;
            case 4:
                zzdqb zzdqbVar = ((zzduj) this).f12992u;
                synchronized (zzdqbVar) {
                    list = zzdqbVar.f12614e;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 5:
                String strM6000c = ((zzduj) this).f12992u.m6000c();
                parcel2.writeNoException();
                parcel2.writeString(strM6000c);
                return true;
            case 6:
                zzdqb zzdqbVar2 = ((zzduj) this).f12992u;
                synchronized (zzdqbVar2) {
                    zzbmlVar = zzdqbVar2.f12628s;
                }
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzbmlVar);
                return true;
            case 7:
                String strM6002e = ((zzduj) this).f12992u.m6002e();
                parcel2.writeNoException();
                parcel2.writeString(strM6002e);
                return true;
            case 8:
                zzdqb zzdqbVar3 = ((zzduj) this).f12992u;
                synchronized (zzdqbVar3) {
                    d = zzdqbVar3.f12627r;
                }
                parcel2.writeNoException();
                parcel2.writeDouble(d);
                return true;
            case 9:
                zzdqb zzdqbVar4 = ((zzduj) this).f12992u;
                synchronized (zzdqbVar4) {
                    strM6010p = zzdqbVar4.m6010p("store");
                }
                parcel2.writeNoException();
                parcel2.writeString(strM6010p);
                return true;
            case 10:
                zzdqb zzdqbVar5 = ((zzduj) this).f12992u;
                synchronized (zzdqbVar5) {
                    strM6010p2 = zzdqbVar5.m6010p(FirebaseAnalytics.Param.PRICE);
                }
                parcel2.writeNoException();
                parcel2.writeString(strM6010p2);
                return true;
            case 11:
                Bundle bundleM6001d = ((zzduj) this).f12992u.m6001d();
                parcel2.writeNoException();
                zzben.m4816d(parcel2, bundleM6001d);
                return true;
            case 12:
                ((zzduj) this).f12991t.m5989p();
                parcel2.writeNoException();
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzea zzeaVarM6012r = ((zzduj) this).f12992u.m6012r();
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzeaVarM6012r);
                return true;
            case 14:
                Bundle bundle = (Bundle) zzben.m4814b(parcel, Bundle.CREATOR);
                zzben.m4818f(parcel);
                zzdpw zzdpwVar = ((zzduj) this).f12991t;
                synchronized (zzdpwVar) {
                    zzdpwVar.f12569n.mo5947O(bundle);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) zzben.m4814b(parcel, Bundle.CREATOR);
                zzben.m4818f(parcel);
                boolean zM5990q = ((zzduj) this).f12991t.m5990q(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zM5990q ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) zzben.m4814b(parcel, Bundle.CREATOR);
                zzben.m4818f(parcel);
                zzdpw zzdpwVar2 = ((zzduj) this).f12991t;
                synchronized (zzdpwVar2) {
                    zzdpwVar2.f12569n.mo5962n(bundle3);
                }
                parcel2.writeNoException();
                return true;
            case 17:
                zzbme zzbmeVarM6013s = ((zzduj) this).f12992u.m6013s();
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzbmeVarM6013s);
                return true;
            case 18:
                zzdqb zzdqbVar6 = ((zzduj) this).f12992u;
                synchronized (zzdqbVar6) {
                    iObjectWrapper = zzdqbVar6.f12626q;
                }
                parcel2.writeNoException();
                zzben.m4817e(parcel2, iObjectWrapper);
                return true;
            case 19:
                String str = ((zzduj) this).f12990s;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}
