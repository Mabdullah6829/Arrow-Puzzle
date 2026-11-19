package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zzbjd {
    /* JADX INFO: renamed from: a */
    public static final void m5037a(final zzbjc zzbjcVar, zzbja zzbjaVar) {
        File externalStorageDirectory;
        if (zzbjaVar.f8880c == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(zzbjaVar.f8881d)) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        Context context = zzbjaVar.f8880c;
        String str = zzbjaVar.f8881d;
        String str2 = zzbjaVar.f8878a;
        LinkedHashMap linkedHashMap = zzbjaVar.f8879b;
        zzbjcVar.f8887e = context;
        zzbjcVar.f8888f = str;
        zzbjcVar.f8886d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        zzbjcVar.f8890h = atomicBoolean;
        atomicBoolean.set(((Boolean) zzbks.f9015c.m5057c()).booleanValue());
        if (zzbjcVar.f8890h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            zzfzu.f16872a.getClass();
            zzbjcVar.f8891i = new File(zzfzv.m6833a(externalStorageDirectory, "sdk_csi_data.txt"));
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            zzbjcVar.f8884b.put((String) entry.getKey(), (String) entry.getValue());
        }
        ((zzcfx) zzcfy.f9946a).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbjb
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                LinkedHashMap linkedHashMap2;
                zzbjc zzbjcVar2 = zzbjcVar;
                zzbjcVar2.getClass();
                while (true) {
                    try {
                        zzbjm zzbjmVar = (zzbjm) zzbjcVar2.f8883a.take();
                        zzbjl zzbjlVarM5043b = zzbjmVar.m5043b();
                        if (!TextUtils.isEmpty(zzbjlVarM5043b.f8900a)) {
                            LinkedHashMap linkedHashMap3 = zzbjcVar2.f8884b;
                            synchronized (zzbjmVar.f8904c) {
                                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5381a();
                                linkedHashMap2 = zzbjmVar.f8903b;
                            }
                            zzbjcVar2.m5036b(zzbjcVar2.m5035a(linkedHashMap3, linkedHashMap2), zzbjlVarM5043b);
                        }
                    } catch (InterruptedException e) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3074g("CsiReporter:reporter interrupted", e);
                        return;
                    }
                }
            }
        });
        HashMap map = zzbjcVar.f8885c;
        zzbji zzbjiVar = zzbji.f8893b;
        map.put("action", zzbjiVar);
        map.put(FirebaseAnalytics.Param.AD_FORMAT, zzbjiVar);
        map.put("e", zzbji.f8894c);
    }
}
