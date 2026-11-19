package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbgq;
import com.google.android.gms.internal.ads.zzbvi;
import com.google.android.gms.internal.ads.zzccp;
import com.google.android.gms.internal.ads.zzfsx;
import com.google.android.gms.internal.ads.zzftc;
import com.google.android.gms.internal.ads.zzftl;
import com.google.android.gms.internal.ads.zzful;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzcg extends zzbem implements zzch {
    public zzcg() {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) throws Throwable {
        zzcb zzbzVar = null;
        zzfpVar = null;
        zzfpVar = null;
        zzfp zzfpVar = null;
        zzce zzccVar = null;
        int i3 = 0;
        switch (i2) {
            case 1:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzfp.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    zzbzVar = iInterfaceQueryLocalInterface instanceof zzcb ? (zzcb) iInterfaceQueryLocalInterface : new zzbz(strongBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                }
                zzben.m4818f(parcel);
                ((zzftl) this).m6669k4(arrayListCreateTypedArrayList, zzbzVar);
                parcel2.writeNoException();
                return true;
            case 2:
                String string = parcel.readString();
                zzben.m4818f(parcel);
                boolean zM6670l4 = ((zzftl) this).m6670l4(string);
                parcel2.writeNoException();
                parcel2.writeInt(zM6670l4 ? 1 : 0);
                return true;
            case 3:
                String string2 = parcel.readString();
                zzben.m4818f(parcel);
                zzccp zzccpVarM6671m4 = ((zzftl) this).m6671m4(string2);
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzccpVarM6671m4);
                return true;
            case 4:
                String string3 = parcel.readString();
                zzben.m4818f(parcel);
                boolean zM6672n4 = ((zzftl) this).m6672n4(string3);
                parcel2.writeNoException();
                parcel2.writeInt(zM6672n4 ? 1 : 0);
                return true;
            case 5:
                String string4 = parcel.readString();
                zzben.m4818f(parcel);
                zzbgq zzbgqVarM6673o4 = ((zzftl) this).m6673o4(string4);
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzbgqVarM6673o4);
                return true;
            case 6:
                String string5 = parcel.readString();
                zzben.m4818f(parcel);
                boolean zM6674p4 = ((zzftl) this).m6674p4(string5);
                parcel2.writeNoException();
                parcel2.writeInt(zM6674p4 ? 1 : 0);
                return true;
            case 7:
                String string6 = parcel.readString();
                zzben.m4818f(parcel);
                zzbu zzbuVarM6675q4 = ((zzftl) this).m6675q4(string6);
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzbuVarM6675q4);
                return true;
            case 8:
                zzbvi.m5157k4(parcel.readStrongBinder());
                zzben.m4818f(parcel);
                parcel2.writeNoException();
                return true;
            case 9:
                String string7 = parcel.readString();
                zzfp zzfpVar2 = (zzfp) zzben.m4814b(parcel, zzfp.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
                    zzccVar = iInterfaceQueryLocalInterface2 instanceof zzce ? (zzce) iInterfaceQueryLocalInterface2 : new zzcc(strongBinder2, "com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
                }
                zzben.m4818f(parcel);
                boolean zM6676r4 = ((zzftl) this).m6676r4(string7, zzfpVar2, zzccVar);
                parcel2.writeNoException();
                parcel2.writeInt(zM6676r4 ? 1 : 0);
                return true;
            case 10:
                int i4 = parcel.readInt();
                String string8 = parcel.readString();
                zzben.m4818f(parcel);
                boolean zM6677s4 = ((zzftl) this).m6677s4(i4, string8);
                parcel2.writeNoException();
                parcel2.writeInt(zM6677s4 ? 1 : 0);
                return true;
            case 11:
                String string9 = parcel.readString();
                zzben.m4818f(parcel);
                zzbu zzbuVar = (zzbu) ((zzftl) this).f16496t.m6659b(AdFormat.INTERSTITIAL, zzbu.class, string9);
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzbuVar);
                return true;
            case 12:
                String string10 = parcel.readString();
                zzben.m4818f(parcel);
                zzbgq zzbgqVar = (zzbgq) ((zzftl) this).f16496t.m6659b(AdFormat.APP_OPEN_AD, zzbgq.class, string10);
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzbgqVar);
                return true;
            case 13:
                String string11 = parcel.readString();
                zzben.m4818f(parcel);
                zzccp zzccpVar = (zzccp) ((zzftl) this).f16496t.m6659b(AdFormat.REWARDED, zzccp.class, string11);
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzccpVar);
                return true;
            case 14:
                int i5 = parcel.readInt();
                String string12 = parcel.readString();
                zzben.m4818f(parcel);
                zzftl zzftlVar = (zzftl) this;
                AdFormat adFormatM2747b = AdFormat.m2747b(i5);
                if (adFormatM2747b != null) {
                    zzftc zzftcVar = zzftlVar.f16496t;
                    HashMap map = zzftcVar.f16458a;
                    synchronized (map) {
                        try {
                            if (map.containsKey(adFormatM2747b)) {
                                zzful zzfulVar = (zzful) ((Map) map.get(adFormatM2747b)).get(string12);
                                zzftcVar.f16460c.m6683f("pgc", zzftcVar.f16464g.currentTimeMillis(), string12, zzfulVar == null ? null : zzfulVar.m6710r(), adFormatM2747b, zzfulVar == null ? -1 : zzfulVar.m6711s(), zzfulVar != null ? zzfulVar.m6712t() : -1, 1);
                                if (zzfulVar != null) {
                                    zzfpVar = (zzfp) zzfulVar.f16559e.get();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    break;
                }
                parcel2.writeNoException();
                zzben.m4816d(parcel2, zzfpVar);
                return true;
            case 15:
                int i6 = parcel.readInt();
                zzben.m4818f(parcel);
                zzftc zzftcVar2 = ((zzftl) this).f16496t;
                zzftcVar2.getClass();
                HashMap map2 = new HashMap();
                HashMap map3 = zzftcVar2.f16458a;
                AdFormat adFormatM2747b2 = AdFormat.m2747b(i6);
                synchronized (map3) {
                    if (adFormatM2747b2 != null) {
                        try {
                            if (map3.containsKey(adFormatM2747b2)) {
                                for (zzful zzfulVar2 : ((Map) map3.get(adFormatM2747b2)).values()) {
                                    map2.put(zzfulVar2.f16566l, (zzfp) zzfulVar2.f16559e.get());
                                }
                                zzftcVar2.f16460c.m6683f("pgcs", zzftcVar2.f16464g.currentTimeMillis(), null, null, adFormatM2747b2, -1, -1, map2.size());
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                Bundle bundle = new Bundle();
                for (Map.Entry entry : map2.entrySet()) {
                    String str = (String) entry.getKey();
                    zzfp zzfpVar3 = (zzfp) entry.getValue();
                    Parcel parcelObtain = Parcel.obtain();
                    zzfpVar3.writeToParcel(parcelObtain, 0);
                    byte[] bArrMarshall = parcelObtain.marshall();
                    parcelObtain.recycle();
                    bundle.putByteArray(str, bArrMarshall);
                }
                parcel2.writeNoException();
                zzben.m4816d(parcel2, bundle);
                return true;
            case 16:
                int i7 = parcel.readInt();
                String string13 = parcel.readString();
                zzben.m4818f(parcel);
                zzftl zzftlVar2 = (zzftl) this;
                AdFormat adFormatM2747b3 = AdFormat.m2747b(i7);
                if (adFormatM2747b3 != null) {
                    zzftc zzftcVar3 = zzftlVar2.f16496t;
                    HashMap map4 = zzftcVar3.f16458a;
                    synchronized (map4) {
                        try {
                            if (map4.containsKey(adFormatM2747b3)) {
                                zzful zzfulVar3 = (zzful) ((Map) map4.get(adFormatM2747b3)).get(string13);
                                int iM6712t = zzfulVar3 != null ? zzfulVar3.m6712t() : 0;
                                zzftcVar3.f16460c.m6683f("pnav", zzftcVar3.f16464g.currentTimeMillis(), string13, zzfulVar3 != null ? zzfulVar3.m6710r() : null, adFormatM2747b3, zzfulVar3 != null ? zzfulVar3.m6711s() : -1, iM6712t, 1);
                                i3 = iM6712t;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    break;
                }
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 17:
                int i8 = parcel.readInt();
                String string14 = parcel.readString();
                zzben.m4818f(parcel);
                zzftl zzftlVar3 = (zzftl) this;
                AdFormat adFormatM2747b4 = AdFormat.m2747b(i8);
                if (adFormatM2747b4 != null) {
                    zzftc zzftcVar4 = zzftlVar3.f16496t;
                    HashMap map5 = zzftcVar4.f16458a;
                    synchronized (map5) {
                        try {
                            if (map5.containsKey(adFormatM2747b4)) {
                                zzful zzfulVar4 = (zzful) ((Map) map5.get(adFormatM2747b4)).remove(string14);
                                if (zzfulVar4 != null) {
                                    zzfulVar4.f16561g.set(false);
                                    zzfulVar4.f16570p.set(false);
                                    zzfsx zzfsxVar = zzftcVar4.f16466i;
                                    if (zzfsxVar != null) {
                                        zzfsxVar.m6648d(zzfulVar4);
                                    }
                                    int iM6712t2 = zzfulVar4.m6712t();
                                    Queue queue = zzfulVar4.f16564j;
                                    synchronized (queue) {
                                        queue.clear();
                                        break;
                                    }
                                    zzftcVar4.f16460c.m6683f("pd", zzftcVar4.f16464g.currentTimeMillis(), string14, zzfulVar4.m6710r(), adFormatM2747b4, zzfulVar4.m6711s(), iM6712t2, 1);
                                    i3 = 1;
                                }
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    break;
                }
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 18:
                int i9 = parcel.readInt();
                zzben.m4818f(parcel);
                ((zzftl) this).mo2887X(i9);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
