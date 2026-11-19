package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbob extends zzbem implements zzboc {
    public zzbob() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
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
        List list2;
        com.google.android.gms.ads.internal.client.zzew zzewVar;
        boolean zZzh;
        zzdbv zzdbvVar;
        zzdbv zzdbvVar2;
        int i3 = 0;
        zzbnz zzbnxVar = null;
        com.google.android.gms.ads.internal.client.zzdc zzdaVar = null;
        switch (i2) {
            case 2:
                String strM5998a = ((zzduq) this).f13013u.m5998a();
                parcel2.writeNoException();
                parcel2.writeString(strM5998a);
                return true;
            case 3:
                zzdqb zzdqbVar = ((zzduq) this).f13013u;
                synchronized (zzdqbVar) {
                    list = zzdqbVar.f12614e;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 4:
                String strM6000c = ((zzduq) this).f13013u.m6000c();
                parcel2.writeNoException();
                parcel2.writeString(strM6000c);
                return true;
            case 5:
                zzdqb zzdqbVar2 = ((zzduq) this).f13013u;
                synchronized (zzdqbVar2) {
                    zzbmlVar = zzdqbVar2.f12628s;
                }
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzbmlVar);
                return true;
            case 6:
                String strM6002e = ((zzduq) this).f13013u.m6002e();
                parcel2.writeNoException();
                parcel2.writeString(strM6002e);
                return true;
            case 7:
                String strM6003f = ((zzduq) this).f13013u.m6003f();
                parcel2.writeNoException();
                parcel2.writeString(strM6003f);
                return true;
            case 8:
                zzdqb zzdqbVar3 = ((zzduq) this).f13013u;
                synchronized (zzdqbVar3) {
                    d = zzdqbVar3.f12627r;
                }
                parcel2.writeNoException();
                parcel2.writeDouble(d);
                return true;
            case 9:
                zzdqb zzdqbVar4 = ((zzduq) this).f13013u;
                synchronized (zzdqbVar4) {
                    strM6010p = zzdqbVar4.m6010p("store");
                }
                parcel2.writeNoException();
                parcel2.writeString(strM6010p);
                return true;
            case 10:
                zzdqb zzdqbVar5 = ((zzduq) this).f13013u;
                synchronized (zzdqbVar5) {
                    strM6010p2 = zzdqbVar5.m6010p(FirebaseAnalytics.Param.PRICE);
                }
                parcel2.writeNoException();
                parcel2.writeString(strM6010p2);
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzea zzeaVarM6012r = ((zzduq) this).f13013u.m6012r();
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzeaVarM6012r);
                return true;
            case 12:
                String str = ((zzduq) this).f13011s;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 13:
                ((zzduq) this).mo5081Q();
                parcel2.writeNoException();
                return true;
            case 14:
                zzbme zzbmeVarM6013s = ((zzduq) this).f13013u.m6013s();
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzbmeVarM6013s);
                return true;
            case 15:
                Bundle bundle = (Bundle) zzben.m4814b(parcel, Bundle.CREATOR);
                zzben.m4818f(parcel);
                zzdpw zzdpwVar = ((zzduq) this).f13012t;
                synchronized (zzdpwVar) {
                    zzdpwVar.f12569n.mo5947O(bundle);
                }
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) zzben.m4814b(parcel, Bundle.CREATOR);
                zzben.m4818f(parcel);
                boolean zM5990q = ((zzduq) this).f13012t.m5990q(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zM5990q ? 1 : 0);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) zzben.m4814b(parcel, Bundle.CREATOR);
                zzben.m4818f(parcel);
                zzdpw zzdpwVar2 = ((zzduq) this).f13012t;
                synchronized (zzdpwVar2) {
                    zzdpwVar2.f12569n.mo5962n(bundle3);
                }
                parcel2.writeNoException();
                return true;
            case 18:
                IObjectWrapper iObjectWrapperMo5088k = ((zzduq) this).mo5088k();
                parcel2.writeNoException();
                zzben.m4817e(parcel2, iObjectWrapperMo5088k);
                return true;
            case 19:
                zzdqb zzdqbVar6 = ((zzduq) this).f13013u;
                synchronized (zzdqbVar6) {
                    iObjectWrapper = zzdqbVar6.f12626q;
                }
                parcel2.writeNoException();
                zzben.m4817e(parcel2, iObjectWrapper);
                return true;
            case 20:
                Bundle bundleM6001d = ((zzduq) this).f13013u.m6001d();
                parcel2.writeNoException();
                zzben.m4816d(parcel2, bundleM6001d);
                return true;
            case 21:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    zzbnxVar = iInterfaceQueryLocalInterface instanceof zzbnz ? (zzbnz) iInterfaceQueryLocalInterface : new zzbnx(strongBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                }
                zzben.m4818f(parcel);
                ((zzduq) this).m6067m4(zzbnxVar);
                parcel2.writeNoException();
                return true;
            case 22:
                zzdpw zzdpwVar3 = ((zzduq) this).f13012t;
                synchronized (zzdpwVar3) {
                    zzdpwVar3.f12569n.mo5945F();
                }
                parcel2.writeNoException();
                return true;
            case 23:
                List listMo5091x = ((zzduq) this).mo5091x();
                parcel2.writeNoException();
                parcel2.writeList(listMo5091x);
                return true;
            case 24:
                zzdqb zzdqbVar7 = ((zzduq) this).f13013u;
                synchronized (zzdqbVar7) {
                    list2 = zzdqbVar7.f12615f;
                }
                if (!list2.isEmpty()) {
                    synchronized (zzdqbVar7) {
                        zzewVar = zzdqbVar7.f12616g;
                    }
                    if (zzewVar != null) {
                        i3 = 1;
                    }
                }
                parcel2.writeNoException();
                ClassLoader classLoader = zzben.f7689a;
                parcel2.writeInt(i3);
                return true;
            case 25:
                com.google.android.gms.ads.internal.client.zzdg zzdgVarM2909k4 = com.google.android.gms.ads.internal.client.zzdf.m2909k4(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                ((zzduq) this).m6065k4(zzdgVarM2909k4);
                parcel2.writeNoException();
                return true;
            case 26:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
                    zzdaVar = iInterfaceQueryLocalInterface2 instanceof com.google.android.gms.ads.internal.client.zzdc ? (com.google.android.gms.ads.internal.client.zzdc) iInterfaceQueryLocalInterface2 : new com.google.android.gms.ads.internal.client.zzda(strongBinder2, "com.google.android.gms.ads.internal.client.IMuteThisAdListener");
                }
                zzben.m4818f(parcel);
                ((zzduq) this).m6066l4(zzdaVar);
                parcel2.writeNoException();
                return true;
            case 27:
                zzdpw zzdpwVar4 = ((zzduq) this).f13012t;
                synchronized (zzdpwVar4) {
                    zzdpwVar4.f12569n.mo5950c();
                }
                parcel2.writeNoException();
                return true;
            case 28:
                final zzdpw zzdpwVar5 = ((zzduq) this).f13012t;
                synchronized (zzdpwVar5) {
                    zzdry zzdryVar = zzdpwVar5.f12578w;
                    if (zzdryVar == null) {
                        int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Ad should be associated with an ad view before calling recordCustomClickGesture()");
                    } else {
                        final boolean z = zzdryVar instanceof zzdqu;
                        zzdpwVar5.f12567l.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpr
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzdpw zzdpwVar6 = zzdpwVar5;
                                zzdry zzdryVar2 = zzdpwVar6.f12578w;
                                if (zzdryVar2 == null) {
                                    int i5 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                    com.google.android.gms.ads.internal.util.client.zzo.m3068a("Ad should be associated with an ad view before calling recordCustomClickGesture()");
                                    return;
                                }
                                zzdpwVar6.f12569n.mo5961m(null, zzdryVar2.mo6021D0(), zzdpwVar6.f12578w.zzi(), zzdpwVar6.f12578w.zzj(), z, zzdpwVar6.m5986m(), 0);
                            }
                        });
                    }
                }
                parcel2.writeNoException();
                return true;
            case 29:
                zzbmi zzbmiVarMo5090w = ((zzduq) this).mo5090w();
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzbmiVarMo5090w);
                return true;
            case 30:
                zzdpw zzdpwVar6 = ((zzduq) this).f13012t;
                synchronized (zzdpwVar6) {
                    zZzh = zzdpwVar6.f12569n.zzh();
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = zzben.f7689a;
                parcel2.writeInt(zZzh ? 1 : 0);
                return true;
            case 31:
                com.google.android.gms.ads.internal.client.zzdx zzdxVarMo5080L = ((zzduq) this).mo5080L();
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzdxVarMo5080L);
                return true;
            case 32:
                com.google.android.gms.ads.internal.client.zzdq zzdqVarM2914k4 = com.google.android.gms.ads.internal.client.zzdp.m2914k4(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                zzduq zzduqVar = (zzduq) this;
                try {
                    if (!zzdqVarM2914k4.mo2912b()) {
                        zzduqVar.f13014v.m6112b();
                    }
                    break;
                } catch (RemoteException e) {
                    int i5 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3069b("Error in making CSI ping for reporting paid event callback", e);
                }
                zzdpw zzdpwVar7 = zzduqVar.f13012t;
                synchronized (zzdpwVar7) {
                    zzdpwVar7.f12564G.f14850s.set(zzdqVarM2914k4);
                }
                parcel2.writeNoException();
                return true;
            case 33:
                Bundle bundle4 = (Bundle) zzben.m4814b(parcel, Bundle.CREATOR);
                zzben.m4818f(parcel);
                ((zzduq) this).mo5092y2(bundle4);
                parcel2.writeNoException();
                return true;
            case 34:
                zzdpw zzdpwVar8 = ((zzduq) this).f13012t;
                long j2 = (zzdpwVar8 == null || (zzdbvVar = zzdpwVar8.f11768j) == null) ? 0L : zzdbvVar.f11972a.get();
                parcel2.writeNoException();
                parcel2.writeLong(j2);
                return true;
            case 35:
                long j3 = parcel.readLong();
                zzben.m4818f(parcel);
                zzdpw zzdpwVar9 = ((zzduq) this).f13012t;
                if (zzdpwVar9 != null && (zzdbvVar2 = zzdpwVar9.f11768j) != null) {
                    zzdbvVar2.m5891a(j3);
                }
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
