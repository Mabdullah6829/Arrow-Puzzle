package com.google.android.gms.ads.internal.util;

import android.util.Log;
import com.google.android.gms.internal.ads.zzbkz;

/* JADX INFO: loaded from: classes.dex */
public final class zze extends com.google.android.gms.ads.internal.util.client.zzo {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f3574b = 0;

    /* JADX INFO: renamed from: k */
    public static void m3150k(String str) {
        if (m3152m()) {
            if (str == null || str.length() <= 4000) {
                Log.v("Ads", str);
                return;
            }
            boolean z = true;
            for (String str2 : com.google.android.gms.ads.internal.util.client.zzo.f3437a.m7146d(str)) {
                if (z) {
                    Log.v("Ads", str2);
                } else {
                    Log.v("Ads-cont", str2);
                }
                z = false;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m3151l(String str, Throwable th) {
        if (m3152m()) {
            Log.v("Ads", str, th);
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m3152m() {
        return com.google.android.gms.ads.internal.util.client.zzo.m3077j(2) && ((Boolean) zzbkz.f9078a.m5057c()).booleanValue();
    }
}
