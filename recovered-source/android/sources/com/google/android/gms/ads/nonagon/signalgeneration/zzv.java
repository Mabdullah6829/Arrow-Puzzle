package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzdzy;
import com.google.android.gms.internal.ads.zzflg;
import com.google.android.gms.internal.ads.zzfqv;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzv {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX INFO: renamed from: a */
    public static String m3345a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str) {
            case "requester_type_0":
                return "0";
            case "requester_type_1":
                return "1";
            case "requester_type_2":
                return "2";
            case "requester_type_3":
                return "3";
            case "requester_type_4":
                return "4";
            case "requester_type_5":
                return "5";
            case "requester_type_6":
                return "6";
            case "requester_type_7":
                return "7";
            case "requester_type_8":
                return "8";
            default:
                return str;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m3346b(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        Bundle bundle;
        return (zzmVar == null || (bundle = zzmVar.f3229u) == null) ? "unspecified" : bundle.getString("query_info_type");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x007b  */
    /* JADX INFO: renamed from: c */
    public static zzfqv m3347c(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 != null) {
            bundle = bundle2;
        }
        String string = bundle.getString("query_info_type");
        boolean zIsEmpty = TextUtils.isEmpty(string);
        zzfqv zzfqvVar = zzfqv.SCAR_REQUEST_TYPE_UNSPECIFIED;
        if (zIsEmpty) {
            return zzfqvVar;
        }
        switch (string) {
            case "requester_type_0":
                return zzfqv.SCAR_REQUEST_TYPE_ADMOB;
            case "requester_type_1":
                return zzfqv.SCAR_REQUEST_TYPE_INBOUND_MEDIATION;
            case "requester_type_2":
                return zzfqv.SCAR_REQUEST_TYPE_GBID;
            case "requester_type_3":
                return zzfqv.SCAR_REQUEST_TYPE_GOLDENEYE;
            case "requester_type_4":
                return zzfqv.SCAR_REQUEST_TYPE_YAVIN;
            case "requester_type_5":
                return zzfqv.SCAR_REQUEST_TYPE_UNITY;
            case "requester_type_6":
                return zzfqv.SCAR_REQUEST_TYPE_PAW;
            case "requester_type_7":
                return zzfqv.SCAR_REQUEST_TYPE_GUILDER;
            case "requester_type_8":
                return zzfqv.SCAR_REQUEST_TYPE_GAM_S2S;
            default:
                return zzfqvVar;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m3348d(final zzdzy zzdzyVar, final String str, final Pair... pairArr) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8282Q7)).booleanValue()) {
            zzcfy.f9946a.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzu
                @Override // java.lang.Runnable
                public final void run() {
                    zzdzy zzdzyVar2 = zzdzyVar;
                    zzdzyVar2.getClass();
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdzyVar2.f13443a);
                    if (!TextUtils.isEmpty("action")) {
                        String str2 = str;
                        if (!TextUtils.isEmpty(str2)) {
                            concurrentHashMap.put("action", str2);
                        }
                    }
                    int i2 = 0;
                    while (true) {
                        Pair[] pairArr2 = pairArr;
                        if (i2 >= pairArr2.length) {
                            zzdzyVar2.m6127b(concurrentHashMap);
                            return;
                        }
                        Pair pair = pairArr2[i2];
                        String str3 = (String) pair.first;
                        String str4 = (String) pair.second;
                        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                            concurrentHashMap.put(str3, str4);
                        }
                        i2++;
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m3349e(zzflg zzflgVar) {
        if (zzflgVar.f16055s) {
            return 2;
        }
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzflgVar.f16040d;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzmVar.f3216K;
        String str = zzmVar.f3221P;
        if (zzcVar == null && str == null) {
            return 1;
        }
        if (zzcVar == null || str == null) {
            return zzcVar != null ? 3 : 4;
        }
        return 5;
    }
}
