package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbix;

/* JADX INFO: loaded from: classes.dex */
public final class zzaa {

    /* JADX INFO: renamed from: c */
    public static volatile float f3448c = -1.0f;

    /* JADX INFO: renamed from: d */
    public static volatile long f3449d;

    /* JADX INFO: renamed from: e */
    public static final Object f3450e = new Object();

    /* JADX INFO: renamed from: a */
    public boolean f3451a = false;

    /* JADX INFO: renamed from: b */
    public float f3452b = 1.0f;

    /* JADX INFO: renamed from: b */
    public static float m3086b(Context context) {
        zzbio zzbioVar = zzbix.f8086Ef;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        float f2 = 0.0f;
        if (!((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return 0.0f;
            }
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            if (streamMaxVolume == 0) {
                return 0.0f;
            }
            return streamVolume / streamMaxVolume;
        }
        com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
        zztVar.f3711k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jIntValue = ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8103Ff)).intValue();
        if (f3448c != -1.0f && jCurrentTimeMillis - f3449d < jIntValue) {
            return f3448c;
        }
        synchronized (f3450e) {
            try {
                zztVar.f3711k.getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (f3448c != -1.0f && jCurrentTimeMillis2 - f3449d < jIntValue) {
                    return f3448c;
                }
                AudioManager audioManager2 = (AudioManager) context.getSystemService("audio");
                if (audioManager2 == null) {
                    f3448c = 0.0f;
                    f3449d = jCurrentTimeMillis2;
                    return 0.0f;
                }
                int streamMaxVolume2 = audioManager2.getStreamMaxVolume(3);
                int streamVolume2 = audioManager2.getStreamVolume(3);
                if (streamMaxVolume2 != 0) {
                    f2 = streamVolume2 / streamMaxVolume2;
                }
                f3448c = f2;
                f3449d = jCurrentTimeMillis2;
                return f3448c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized float m3087a() {
        synchronized (this) {
            float f2 = this.f3452b;
            if (f2 >= 0.0f) {
                return f2;
            }
            return 1.0f;
        }
    }
}
