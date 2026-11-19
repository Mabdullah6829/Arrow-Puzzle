package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zzbjm {

    /* JADX INFO: renamed from: a */
    public final LinkedList f8902a = new LinkedList();

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f8903b;

    /* JADX INFO: renamed from: c */
    public final Object f8904c;

    public zzbjm(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f8903b = linkedHashMap;
        this.f8904c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put(FirebaseAnalytics.Param.AD_FORMAT, str);
    }

    /* JADX INFO: renamed from: d */
    public static final zzbjj m5041d() {
        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
        return new zzbjj(SystemClock.elapsedRealtime(), null, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m5042a(zzbjj zzbjjVar, long j2, String... strArr) {
        synchronized (this.f8904c) {
            this.f8902a.add(new zzbjj(j2, strArr[0], zzbjjVar));
        }
    }

    /* JADX INFO: renamed from: b */
    public final zzbjl m5043b() {
        zzbjl zzbjlVar;
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8829x2)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.f8904c) {
            try {
                LinkedList<zzbjj> linkedList = this.f8902a;
                for (zzbjj zzbjjVar : linkedList) {
                    long j2 = zzbjjVar.f8895a;
                    String str = zzbjjVar.f8896b;
                    zzbjj zzbjjVar2 = zzbjjVar.f8897c;
                    if (zzbjjVar2 != null && j2 > 0) {
                        long j3 = j2 - zzbjjVar2.f8895a;
                        sb.append(str);
                        sb.append('.');
                        sb.append(j3);
                        sb.append(',');
                        if (zBooleanValue) {
                            if (map.containsKey(Long.valueOf(zzbjjVar2.f8895a))) {
                                StringBuilder sb2 = (StringBuilder) map.get(Long.valueOf(zzbjjVar2.f8895a));
                                sb2.append('+');
                                sb2.append(str);
                            } else {
                                map.put(Long.valueOf(zzbjjVar2.f8895a), new StringBuilder(str));
                            }
                        }
                    }
                }
                linkedList.clear();
                String string = null;
                if (!TextUtils.isEmpty(null)) {
                    sb.append((String) null);
                } else if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                StringBuilder sb3 = new StringBuilder();
                if (zBooleanValue) {
                    for (Map.Entry entry : map.entrySet()) {
                        sb3.append((CharSequence) entry.getValue());
                        sb3.append('.');
                        long jLongValue = ((Long) entry.getKey()).longValue();
                        com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
                        zztVar.f3711k.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        zztVar.f3711k.getClass();
                        sb3.append((jLongValue - SystemClock.elapsedRealtime()) + jCurrentTimeMillis);
                        sb3.append(',');
                    }
                    if (sb3.length() > 0) {
                        sb3.setLength(sb3.length() - 1);
                    }
                    string = sb3.toString();
                }
                zzbjlVar = new zzbjl(sb.toString(), string);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbjlVar;
    }

    /* JADX INFO: renamed from: c */
    public final void m5044c(String str, String str2) {
        zzbjc zzbjcVarM5381a;
        if (TextUtils.isEmpty(str2) || (zzbjcVarM5381a = com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5381a()) == null) {
            return;
        }
        synchronized (this.f8904c) {
            zzbji zzbjiVar = (zzbji) zzbjcVarM5381a.f8885c.get(str);
            if (zzbjiVar == null) {
                zzbjiVar = zzbji.f8892a;
            }
            LinkedHashMap linkedHashMap = this.f8903b;
            linkedHashMap.put(str, zzbjiVar.mo5039a((String) linkedHashMap.get(str), str2));
        }
    }
}
