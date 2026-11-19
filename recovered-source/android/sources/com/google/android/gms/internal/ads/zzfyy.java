package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.AdError;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzfyy implements zzfxt {

    /* JADX INFO: renamed from: a */
    public final Object f16819a;

    /* JADX INFO: renamed from: b */
    public final zzfyz f16820b;

    /* JADX INFO: renamed from: c */
    public final zzfzk f16821c;

    /* JADX INFO: renamed from: d */
    public final zzfxq f16822d;

    /* JADX INFO: renamed from: e */
    public final boolean f16823e;

    public zzfyy(Object obj, zzfyz zzfyzVar, zzfzk zzfzkVar, zzfxq zzfxqVar, boolean z) {
        this.f16819a = obj;
        this.f16820b = zzfyzVar;
        this.f16821c = zzfzkVar;
        this.f16822d = zzfxqVar;
        this.f16823e = z;
    }

    /* JADX INFO: renamed from: h */
    public static String m6790h(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzazl zzazlVarM4670D = zzazm.m4670D();
        zzazlVarM4670D.m8326l();
        ((zzazm) zzazlVarM4670D.f19780t).m4674H(5);
        zzidl zzidlVarM8149y = zzidl.m8149y(bArr, 0, bArr.length);
        zzazlVarM4670D.m8326l();
        ((zzazm) zzazlVarM4670D.f19780t).m4671E(zzidlVarM8149y);
        return Base64.encodeToString(((zzazm) zzazlVarM4670D.m8328o()).m8099h(), 11);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized String m6791a(Context context) {
        byte[] bArrM6798i;
        try {
            HashMap mapZzb = this.f16821c.zzb();
            mapZzb.put("f", "q");
            mapZzb.put("ctx", context);
            mapZzb.put("aid", null);
            bArrM6798i = m6798i(mapZzb);
            if (this.f16823e) {
                mapZzb.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return m6790h(bArrM6798i);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized String m6792b(Context context, View view, Activity activity) {
        byte[] bArrM6798i;
        try {
            HashMap mapZzc = this.f16821c.zzc();
            mapZzc.put("f", "v");
            mapZzc.put("ctx", context);
            mapZzc.put("aid", null);
            mapZzc.put("view", view);
            mapZzc.put("act", activity);
            bArrM6798i = m6798i(mapZzc);
            if (this.f16823e) {
                mapZzc.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return m6790h(bArrM6798i);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized String m6793c(Context context, String str, View view, Activity activity) {
        byte[] bArrM6798i;
        try {
            HashMap mapMo4726d = this.f16821c.mo4726d();
            mapMo4726d.put("f", "c");
            mapMo4726d.put("ctx", context);
            mapMo4726d.put("cs", str);
            mapMo4726d.put("aid", null);
            mapMo4726d.put("view", view);
            mapMo4726d.put("act", activity);
            bArrM6798i = m6798i(mapMo4726d);
            if (this.f16823e) {
                mapMo4726d.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return m6790h(bArrM6798i);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m6794d(MotionEvent motionEvent) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            HashMap mapMo4724a = this.f16821c.mo4724a();
            mapMo4724a.put("aid", null);
            mapMo4724a.put("evt", motionEvent);
            Object obj = this.f16819a;
            obj.getClass().getDeclaredMethod("he", Map.class).invoke(obj, mapMo4724a);
            this.f16822d.mo6761b(3003, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e) {
            throw new zzfzi(e, 2005);
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized boolean m6795e() {
        Object obj;
        try {
            obj = this.f16819a;
        } catch (Exception e) {
            throw new zzfzi(e, AdError.INTERNAL_ERROR_CODE);
        }
        return ((Boolean) obj.getClass().getDeclaredMethod("init", null).invoke(obj, null)).booleanValue();
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m6796f() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Object obj = this.f16819a;
            obj.getClass().getDeclaredMethod("close", null).invoke(obj, null);
            this.f16822d.mo6761b(AdError.MEDIATION_ERROR_CODE, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e) {
            throw new zzfzi(e, AdError.INTERNAL_ERROR_2003);
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized int m6797g() {
        Object obj;
        try {
            obj = this.f16819a;
        } catch (Exception e) {
            throw new zzfzi(e, AdError.INTERNAL_ERROR_2006);
        }
        return ((Integer) obj.getClass().getDeclaredMethod("lcs", null).invoke(obj, null)).intValue();
    }

    /* JADX INFO: renamed from: i */
    public final synchronized byte[] m6798i(Map map) {
        Object obj;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            obj = this.f16819a;
        } catch (Exception e) {
            this.f16822d.mo6762c(2007, System.currentTimeMillis() - jCurrentTimeMillis, e);
            return null;
        }
        return (byte[]) obj.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(obj, null, map);
    }
}
