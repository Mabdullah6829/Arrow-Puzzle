package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbiq {
    /* JADX INFO: renamed from: a */
    public static final SharedPreferences m5025a(Context context) {
        try {
            return context.getSharedPreferences("google_ads_flags", 0);
        } catch (IllegalStateException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("", e);
            return null;
        }
    }
}
