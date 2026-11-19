package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbmy extends zzbem implements zzbmz {
    public zzbmy() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        List list;
        zzbml zzbmlVar;
        IObjectWrapper iObjectWrapper;
        switch (i2) {
            case 2:
                ObjectWrapper objectWrapper = new ObjectWrapper(((zzdul) this).f12997t);
                parcel2.writeNoException();
                zzben.m4817e(parcel2, objectWrapper);
                return true;
            case 3:
                String strM5998a = ((zzdul) this).f12998u.m5998a();
                parcel2.writeNoException();
                parcel2.writeString(strM5998a);
                return true;
            case 4:
                zzdqb zzdqbVar = ((zzdul) this).f12998u;
                synchronized (zzdqbVar) {
                    list = zzdqbVar.f12614e;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 5:
                String strM6000c = ((zzdul) this).f12998u.m6000c();
                parcel2.writeNoException();
                parcel2.writeString(strM6000c);
                return true;
            case 6:
                zzdqb zzdqbVar2 = ((zzdul) this).f12998u;
                synchronized (zzdqbVar2) {
                    zzbmlVar = zzdqbVar2.f12629t;
                }
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzbmlVar);
                return true;
            case 7:
                String strM6002e = ((zzdul) this).f12998u.m6002e();
                parcel2.writeNoException();
                parcel2.writeString(strM6002e);
                return true;
            case 8:
                String strM6003f = ((zzdul) this).f12998u.m6003f();
                parcel2.writeNoException();
                parcel2.writeString(strM6003f);
                return true;
            case 9:
                Bundle bundleM6001d = ((zzdul) this).f12998u.m6001d();
                parcel2.writeNoException();
                zzben.m4816d(parcel2, bundleM6001d);
                return true;
            case 10:
                ((zzdul) this).f12997t.m5989p();
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzea zzeaVarM6012r = ((zzdul) this).f12998u.m6012r();
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzeaVarM6012r);
                return true;
            case 12:
                Bundle bundle = (Bundle) zzben.m4814b(parcel, Bundle.CREATOR);
                zzben.m4818f(parcel);
                zzdpw zzdpwVar = ((zzdul) this).f12997t;
                synchronized (zzdpwVar) {
                    zzdpwVar.f12569n.mo5947O(bundle);
                }
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) zzben.m4814b(parcel, Bundle.CREATOR);
                zzben.m4818f(parcel);
                boolean zM5990q = ((zzdul) this).f12997t.m5990q(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zM5990q ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) zzben.m4814b(parcel, Bundle.CREATOR);
                zzben.m4818f(parcel);
                zzdpw zzdpwVar2 = ((zzdul) this).f12997t;
                synchronized (zzdpwVar2) {
                    zzdpwVar2.f12569n.mo5962n(bundle3);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                zzbme zzbmeVarM6013s = ((zzdul) this).f12998u.m6013s();
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzbmeVarM6013s);
                return true;
            case 16:
                zzdqb zzdqbVar3 = ((zzdul) this).f12998u;
                synchronized (zzdqbVar3) {
                    iObjectWrapper = zzdqbVar3.f12626q;
                }
                parcel2.writeNoException();
                zzben.m4817e(parcel2, iObjectWrapper);
                return true;
            case 17:
                String str = ((zzdul) this).f12996s;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}
