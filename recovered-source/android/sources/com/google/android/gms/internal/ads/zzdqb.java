package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdqb {

    /* JADX INFO: renamed from: a */
    public int f12610a;

    /* JADX INFO: renamed from: b */
    public com.google.android.gms.ads.internal.client.zzea f12611b;

    /* JADX INFO: renamed from: c */
    public zzbme f12612c;

    /* JADX INFO: renamed from: d */
    public View f12613d;

    /* JADX INFO: renamed from: e */
    public List f12614e;

    /* JADX INFO: renamed from: g */
    public com.google.android.gms.ads.internal.client.zzew f12616g;

    /* JADX INFO: renamed from: h */
    public Bundle f12617h;

    /* JADX INFO: renamed from: i */
    public zzclb f12618i;

    /* JADX INFO: renamed from: j */
    public zzclb f12619j;

    /* JADX INFO: renamed from: k */
    public zzclb f12620k;

    /* JADX INFO: renamed from: l */
    public zzelv f12621l;

    /* JADX INFO: renamed from: m */
    public ListenableFuture f12622m;

    /* JADX INFO: renamed from: n */
    public zzcgd f12623n;

    /* JADX INFO: renamed from: o */
    public View f12624o;

    /* JADX INFO: renamed from: p */
    public View f12625p;

    /* JADX INFO: renamed from: q */
    public IObjectWrapper f12626q;

    /* JADX INFO: renamed from: r */
    public double f12627r;

    /* JADX INFO: renamed from: s */
    public zzbml f12628s;

    /* JADX INFO: renamed from: t */
    public zzbml f12629t;

    /* JADX INFO: renamed from: u */
    public String f12630u;

    /* JADX INFO: renamed from: x */
    public float f12633x;

    /* JADX INFO: renamed from: y */
    public String f12634y;

    /* JADX INFO: renamed from: v */
    public final SimpleArrayMap f12631v = new SimpleArrayMap();

    /* JADX INFO: renamed from: w */
    public final SimpleArrayMap f12632w = new SimpleArrayMap();

    /* JADX INFO: renamed from: f */
    public List f12615f = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: l */
    public static zzdqb m5995l(zzbvy zzbvyVar) {
        zzdqa zzdqaVar;
        zzbvy zzbvyVar2;
        try {
            com.google.android.gms.ads.internal.client.zzea zzeaVarMo5221g = zzbvyVar.mo5221g();
            if (zzeaVarMo5221g == null) {
                zzbvyVar2 = zzbvyVar;
                zzdqaVar = null;
            } else {
                zzbvyVar2 = zzbvyVar;
                zzdqaVar = new zzdqa(zzeaVarMo5221g, zzbvyVar2);
            }
            return m5996m(zzdqaVar, zzbvyVar2.mo5223j(), (View) m5997n(zzbvyVar2.mo5222i()), zzbvyVar2.mo5216a(), zzbvyVar2.mo5217b(), zzbvyVar2.mo5218c(), zzbvyVar2.mo5209A3(), zzbvyVar2.zzi(), (View) m5997n(zzbvyVar2.mo5220f()), zzbvyVar2.mo5224n(), zzbvyVar2.zzl(), zzbvyVar2.mo5219e(), zzbvyVar2.zzk(), zzbvyVar2.zzh(), zzbvyVar2.zzj(), zzbvyVar2.mo5228x());
        } catch (RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static zzdqb m5996m(zzdqa zzdqaVar, zzbme zzbmeVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d, zzbml zzbmlVar, String str6, float f2) {
        zzdqb zzdqbVar = new zzdqb();
        zzdqbVar.f12610a = 6;
        zzdqbVar.f12611b = zzdqaVar;
        zzdqbVar.f12612c = zzbmeVar;
        zzdqbVar.f12613d = view;
        zzdqbVar.m6009o("headline", str);
        zzdqbVar.f12614e = list;
        zzdqbVar.m6009o("body", str2);
        zzdqbVar.f12617h = bundle;
        zzdqbVar.m6009o("call_to_action", str3);
        zzdqbVar.f12624o = view2;
        zzdqbVar.f12626q = iObjectWrapper;
        zzdqbVar.m6009o("store", str4);
        zzdqbVar.m6009o(FirebaseAnalytics.Param.PRICE, str5);
        zzdqbVar.f12627r = d;
        zzdqbVar.f12628s = zzbmlVar;
        zzdqbVar.m6009o("advertiser", str6);
        synchronized (zzdqbVar) {
            zzdqbVar.f12633x = f2;
        }
        return zzdqbVar;
    }

    /* JADX INFO: renamed from: n */
    public static Object m5997n(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.m3697u0(iObjectWrapper);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized String m5998a() {
        return m6010p("headline");
    }

    /* JADX INFO: renamed from: b */
    public final zzbml m5999b() {
        List list = this.f12614e;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.f12614e.get(0);
        if (obj instanceof IBinder) {
            return zzbmk.m5066k4((IBinder) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized String m6000c() {
        return m6010p("body");
    }

    /* JADX INFO: renamed from: d */
    public final synchronized Bundle m6001d() {
        try {
            if (this.f12617h == null) {
                this.f12617h = new Bundle();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f12617h;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized String m6002e() {
        return m6010p("call_to_action");
    }

    /* JADX INFO: renamed from: f */
    public final synchronized String m6003f() {
        return m6010p("advertiser");
    }

    /* JADX INFO: renamed from: g */
    public final synchronized String m6004g() {
        return this.f12630u;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized zzclb m6005h() {
        return this.f12618i;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized zzclb m6006i() {
        return this.f12619j;
    }

    /* JADX INFO: renamed from: j */
    public final synchronized zzclb m6007j() {
        return this.f12620k;
    }

    /* JADX INFO: renamed from: k */
    public final synchronized zzelv m6008k() {
        return this.f12621l;
    }

    /* JADX INFO: renamed from: o */
    public final synchronized void m6009o(String str, String str2) {
        try {
            if (str2 == null) {
                this.f12632w.remove(str);
            } else {
                this.f12632w.put(str, str2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: p */
    public final synchronized String m6010p(String str) {
        return (String) this.f12632w.get(str);
    }

    /* JADX INFO: renamed from: q */
    public final synchronized int m6011q() {
        return this.f12610a;
    }

    /* JADX INFO: renamed from: r */
    public final synchronized com.google.android.gms.ads.internal.client.zzea m6012r() {
        return this.f12611b;
    }

    /* JADX INFO: renamed from: s */
    public final synchronized zzbme m6013s() {
        return this.f12612c;
    }
}
