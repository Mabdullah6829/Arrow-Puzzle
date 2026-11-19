package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.text.TextUtils;
import android.view.View;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbnb extends zzbem implements zzbnc {
    public zzbnb() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    /* JADX INFO: renamed from: j4 */
    public final boolean mo2817j4(int i2, Parcel parcel, Parcel parcel2) {
        SimpleArrayMap simpleArrayMap;
        SimpleArrayMap simpleArrayMap2;
        List<String> arrayList;
        SimpleArrayMap simpleArrayMap3;
        SimpleArrayMap simpleArrayMap4;
        zzdpw zzdpwVar;
        String str;
        zzbmi zzbmiVar;
        zzbmi zzbmiVar2 = null;
        int i3 = 0;
        switch (i2) {
            case 1:
                String string = parcel.readString();
                zzben.m4818f(parcel);
                zzdqb zzdqbVar = ((zzduo) this).f13004t;
                synchronized (zzdqbVar) {
                    simpleArrayMap = zzdqbVar.f12632w;
                }
                String str2 = (String) simpleArrayMap.get(string);
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 2:
                String string2 = parcel.readString();
                zzben.m4818f(parcel);
                zzdqb zzdqbVar2 = ((zzduo) this).f13004t;
                synchronized (zzdqbVar2) {
                    simpleArrayMap2 = zzdqbVar2.f12631v;
                }
                zzbml zzbmlVar = (zzbml) simpleArrayMap2.get(string2);
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzbmlVar);
                return true;
            case 3:
                try {
                    zzdqb zzdqbVar3 = ((zzduo) this).f13004t;
                    synchronized (zzdqbVar3) {
                        simpleArrayMap3 = zzdqbVar3.f12631v;
                    }
                    synchronized (zzdqbVar3) {
                        simpleArrayMap4 = zzdqbVar3.f12632w;
                    }
                    String[] strArr = new String[simpleArrayMap3.size() + simpleArrayMap4.size()];
                    int i4 = 0;
                    for (int i5 = 0; i5 < simpleArrayMap3.size(); i5++) {
                        strArr[i4] = (String) simpleArrayMap3.keyAt(i5);
                        i4++;
                    }
                    while (i3 < simpleArrayMap4.size()) {
                        strArr[i4] = (String) simpleArrayMap4.keyAt(i3);
                        i4++;
                        i3++;
                    }
                    arrayList = Arrays.asList(strArr);
                } catch (NullPointerException e) {
                    com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("InternalNativeCustomTemplateAdShim.getAvailableAssetNames", e);
                    arrayList = new ArrayList<>();
                }
                parcel2.writeNoException();
                parcel2.writeStringList(arrayList);
                return true;
            case 4:
                String strM6004g = ((zzduo) this).f13004t.m6004g();
                parcel2.writeNoException();
                parcel2.writeString(strM6004g);
                return true;
            case 5:
                String string3 = parcel.readString();
                zzben.m4818f(parcel);
                zzdpw zzdpwVar2 = ((zzduo) this).f13006v;
                if (zzdpwVar2 != null) {
                    synchronized (zzdpwVar2) {
                        zzdpwVar2.f12569n.mo5946G(string3);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 6:
                zzdpw zzdpwVar3 = ((zzduo) this).f13006v;
                if (zzdpwVar3 != null) {
                    synchronized (zzdpwVar3) {
                        if (!zzdpwVar3.f12580y) {
                            zzdpwVar3.f12569n.mo5953e0();
                        }
                        break;
                    }
                }
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzea zzeaVarM6012r = ((zzduo) this).f13004t.m6012r();
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzeaVarM6012r);
                return true;
            case 8:
                zzduo zzduoVar = (zzduo) this;
                zzdpw zzdpwVar4 = zzduoVar.f13006v;
                if (zzdpwVar4 != null) {
                    zzdpwVar4.m5989p();
                }
                zzduoVar.f13006v = null;
                zzduoVar.f13005u = null;
                parcel2.writeNoException();
                return true;
            case 9:
                IObjectWrapper iObjectWrapperMo5069B2 = ((zzduo) this).mo5069B2();
                parcel2.writeNoException();
                zzben.m4817e(parcel2, iObjectWrapperMo5069B2);
                return true;
            case 10:
                boolean zMo5070N = ((zzduo) this).mo5070N(AbstractC1456a.m2440g(parcel, parcel));
                parcel2.writeNoException();
                parcel2.writeInt(zMo5070N ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                ClassLoader classLoader = zzben.f7689a;
                parcel2.writeStrongBinder(null);
                return true;
            case 12:
                zzduo zzduoVar2 = (zzduo) this;
                zzdpw zzdpwVar5 = zzduoVar2.f13006v;
                if (zzdpwVar5 == null || zzdpwVar5.f12571p.mo6016c()) {
                    zzdqb zzdqbVar4 = zzduoVar2.f13004t;
                    if (zzdqbVar4.m6007j() != null && zzdqbVar4.m6005h() == null) {
                        i3 = 1;
                    }
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = zzben.f7689a;
                parcel2.writeInt(i3);
                return true;
            case 13:
                zzdqb zzdqbVar5 = ((zzduo) this).f13004t;
                zzelv zzelvVarM6008k = zzdqbVar5.m6008k();
                if (zzelvVarM6008k != null) {
                    com.google.android.gms.ads.internal.zzt.f3698C.f3724x.m6276c(zzelvVarM6008k.f14182a);
                    if (zzdqbVar5.m6007j() != null) {
                        zzdqbVar5.m6007j().mo5129b("onSdkLoaded", new ArrayMap());
                    }
                    i3 = 1;
                } else {
                    int i6 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("Trying to start OMID session before creation.");
                }
                parcel2.writeNoException();
                ClassLoader classLoader3 = zzben.f7689a;
                parcel2.writeInt(i3);
                return true;
            case 14:
                IObjectWrapper iObjectWrapperM2440g = AbstractC1456a.m2440g(parcel, parcel);
                zzduo zzduoVar3 = (zzduo) this;
                Object objM3697u0 = ObjectWrapper.m3697u0(iObjectWrapperM2440g);
                if ((objM3697u0 instanceof View) && zzduoVar3.f13004t.m6008k() != null && (zzdpwVar = zzduoVar3.f13006v) != null) {
                    zzdpwVar.m5980g((View) objM3697u0);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                zzduo zzduoVar4 = (zzduo) this;
                try {
                    zzdqb zzdqbVar6 = zzduoVar4.f13004t;
                    synchronized (zzdqbVar6) {
                        str = zzdqbVar6.f12634y;
                    }
                    if (Objects.equals(str, "Google")) {
                        int i7 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Illegal argument specified for omid partner name.");
                    } else if (TextUtils.isEmpty(str)) {
                        int i8 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Not starting OMID session. OM partner name has not been configured.");
                    } else {
                        zzdpw zzdpwVar6 = zzduoVar4.f13006v;
                        if (zzdpwVar6 != null) {
                            zzdpwVar6.m5979f(str, false);
                        }
                    }
                } catch (NullPointerException e2) {
                    com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement", e2);
                }
                parcel2.writeNoException();
                return true;
            case 16:
                try {
                    zzdpy zzdpyVar = ((zzduo) this).f13006v.f12563F;
                    synchronized (zzdpyVar) {
                        zzbmiVar = zzdpyVar.f12601a;
                    }
                    zzbmiVar2 = zzbmiVar;
                } catch (NullPointerException e3) {
                    com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("InternalNativeCustomTemplateAdShim.getMediaContent", e3);
                }
                parcel2.writeNoException();
                zzben.m4817e(parcel2, zzbmiVar2);
                return true;
            case 17:
                boolean zMo5071T = ((zzduo) this).mo5071T(AbstractC1456a.m2440g(parcel, parcel));
                parcel2.writeNoException();
                parcel2.writeInt(zMo5071T ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
