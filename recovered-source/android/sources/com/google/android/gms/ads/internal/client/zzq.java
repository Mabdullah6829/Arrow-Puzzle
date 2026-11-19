package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes.dex */
public final class zzq {

    /* JADX INFO: renamed from: a */
    public static final zzq f3248a = new zzq();

    /* JADX WARN: Code duplicated, block: B:12:0x0043  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ec  */
    /* JADX INFO: renamed from: a */
    public static zzm m2979a(Context context, zzeh zzehVar) {
        boolean z;
        String str;
        String className;
        String str2 = zzehVar.f3126a;
        Set set = zzehVar.f3128c;
        List listUnmodifiableList = !set.isEmpty() ? Collections.unmodifiableList(new ArrayList(set)) : null;
        RequestConfiguration requestConfiguration = zzeu.m2944d().f3171j;
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = zzay.f3085g.f3086a;
        Set set2 = zzehVar.f3133h;
        String strM3034c = com.google.android.gms.ads.internal.util.client.zzf.m3034c(context);
        int i2 = 0;
        if (set2.contains(strM3034c)) {
            z = true;
        } else {
            requestConfiguration.getClass();
            if (new ArrayList(requestConfiguration.f2972a).contains(strM3034c)) {
                z = true;
            } else {
                z = false;
            }
        }
        Bundle bundle = zzehVar.f3129d.getBundle(AdMobAdapter.class.getName());
        String str3 = zzehVar.f3130e;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            while (true) {
                int i3 = i2 + 1;
                if (i3 >= stackTrace.length) {
                    className = null;
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i2];
                String className2 = stackTraceElement.getClassName();
                if ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (com.google.android.gms.ads.internal.util.client.zzf.f3410c.equalsIgnoreCase(className2) || com.google.android.gms.ads.internal.util.client.zzf.f3411d.equalsIgnoreCase(className2) || com.google.android.gms.ads.internal.util.client.zzf.f3412e.equalsIgnoreCase(className2) || com.google.android.gms.ads.internal.util.client.zzf.f3413f.equalsIgnoreCase(className2) || com.google.android.gms.ads.internal.util.client.zzf.f3414g.equalsIgnoreCase(className2))) {
                    className = stackTrace[i3].getClassName();
                    break;
                }
                i2 = i3;
            }
            if (packageName != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(packageName, ".");
                StringBuilder sb = new StringBuilder();
                if (stringTokenizer.hasMoreElements()) {
                    sb.append(stringTokenizer.nextToken());
                    for (int i4 = 2; i4 > 0 && stringTokenizer.hasMoreElements(); i4--) {
                        sb.append(".");
                        sb.append(stringTokenizer.nextToken());
                    }
                    packageName = sb.toString();
                }
                if (className == null || className.contains(packageName)) {
                    className = null;
                }
            } else {
                className = null;
            }
            str = className;
        } else {
            str = null;
        }
        boolean z2 = zzehVar.f3136k;
        RequestConfiguration requestConfiguration2 = zzeu.m2944d().f3171j;
        int i5 = zzehVar.f3132g;
        requestConfiguration2.getClass();
        return new zzm(8, -1L, bundle, -1, listUnmodifiableList, z, Math.max(i5, -1), false, str3, null, null, str2, zzehVar.f3129d, zzehVar.f3134i, Collections.unmodifiableList(new ArrayList(zzehVar.f3135j)), zzehVar.f3131f, str, z2, null, -1, (String) Collections.max(Arrays.asList(null, ""), new Comparator() { // from class: com.google.android.gms.ads.internal.client.zzp
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                List list = RequestConfiguration.f2971c;
                return list.indexOf((String) obj) - list.indexOf((String) obj2);
            }
        }), new ArrayList(zzehVar.f3127b), zzehVar.f3138m, zzehVar.f3137l, requestConfiguration2.f2973b.f2978s, zzehVar.f3139n, 0L, -1);
    }
}
