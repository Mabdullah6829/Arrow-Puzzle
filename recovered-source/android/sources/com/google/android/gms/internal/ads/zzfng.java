package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfng implements zzfnf {

    /* JADX INFO: renamed from: a */
    public final Object[] f16159a;

    public zzfng(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, int i2, String str2, com.google.android.gms.ads.internal.client.zzx zzxVar) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i2));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(zzmVar.f3228t));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(m6543a(zzmVar.f3229u));
        } else if (hashSet.contains("npa")) {
            arrayList.add(zzmVar.f3229u.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(zzmVar.f3230v));
        }
        if (hashSet.contains("keywords")) {
            List list = zzmVar.f3231w;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(zzmVar.f3232x));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(zzmVar.f3233y));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(zzmVar.f3234z));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(zzmVar.f3206A);
        }
        if (hashSet.contains(FirebaseAnalytics.Param.LOCATION)) {
            Location location = zzmVar.f3208C;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(zzmVar.f3209D);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(m6543a(zzmVar.f3210E));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(m6543a(zzmVar.f3211F));
        }
        if (hashSet.contains("categoryExclusions")) {
            List list2 = zzmVar.f3212G;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(zzmVar.f3213H);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(zzmVar.f3214I);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(zzmVar.f3215J));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(zzmVar.f3217L));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(zzmVar.f3218M);
        }
        if (hashSet.contains("orientation")) {
            if (zzxVar != null) {
                arrayList.add(Integer.valueOf(zzxVar.f3277s));
            } else {
                arrayList.add(null);
            }
        }
        this.f16159a = arrayList.toArray();
    }

    /* JADX INFO: renamed from: a */
    public static String m6543a(Bundle bundle) {
        String strM6543a;
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            if (obj == null) {
                strM6543a = "null";
            } else {
                strM6543a = obj instanceof Bundle ? m6543a((Bundle) obj) : obj.toString();
            }
            sb.append(strM6543a);
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfng) {
            return Arrays.equals(this.f16159a, ((zzfng) obj).f16159a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f16159a);
    }

    public final String toString() {
        Object[] objArr = this.f16159a;
        int iHashCode = Arrays.hashCode(objArr);
        String string = Arrays.toString(objArr);
        StringBuilder sb = new StringBuilder(String.valueOf(iHashCode).length() + 10 + String.valueOf(string).length() + 1);
        sb.append("[PoolKey#");
        sb.append(iHashCode);
        sb.append(" ");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }
}
