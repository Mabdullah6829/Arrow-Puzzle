package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgqd implements zzgpl {

    /* JADX INFO: renamed from: a */
    public long f18033a = -1;

    /* JADX INFO: renamed from: b */
    public long f18034b = -1;

    /* JADX INFO: renamed from: c */
    public long f18035c = -1;

    /* JADX INFO: renamed from: d */
    public long f18036d = -1;

    /* JADX INFO: renamed from: e */
    public long f18037e = -1;

    /* JADX INFO: renamed from: f */
    public long f18038f = -1;

    /* JADX INFO: renamed from: g */
    public long f18039g = -1;

    /* JADX INFO: renamed from: h */
    public long f18040h = -1;

    /* JADX INFO: renamed from: i */
    public final long f18041i = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: d */
    public static boolean m7054d(View view) {
        try {
            if (view.getClass().getName().contains("DebugGestureViewWrapper")) {
                view = ((ViewGroup) view).getChildAt(0);
            }
            Object objInvoke = view.getClass().getMethod("getAdConfiguration", null).invoke(view, null);
            Integer num = (Integer) objInvoke.getClass().getField("adType").get(objInvoke);
            num.intValue();
            String str = (String) objInvoke.getClass().getMethod("adTypeToString", Integer.TYPE).invoke(null, num);
            return str.contains("INTERSTITIAL") || str.contains("APP_OPEN") || str.contains("REWARDED");
        } catch (NullPointerException | ReflectiveOperationException | SecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgpl
    /* JADX INFO: renamed from: a */
    public final synchronized void mo7050a(HashMap map) {
        this.f18040h = this.f18039g;
        this.f18039g = SystemClock.uptimeMillis();
        m7055e(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgpl
    /* JADX INFO: renamed from: b */
    public final synchronized void mo7051b(HashMap map) {
        this.f18034b = this.f18033a;
        this.f18033a = SystemClock.uptimeMillis();
        m7055e(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgpl
    /* JADX INFO: renamed from: c */
    public final synchronized void mo7052c(HashMap map, Context context, View view) {
        WindowManager windowManager;
        try {
            this.f18036d = this.f18035c;
            this.f18035c = SystemClock.uptimeMillis();
            long j2 = this.f18037e;
            if (j2 != -1) {
                this.f18038f = j2;
            }
            DisplayMetrics displayMetrics = null;
            if ((Build.VERSION.SDK_INT < 33 || context.isUiContext()) && (windowManager = (WindowManager) context.getSystemService("window")) != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                displayMetrics = new DisplayMetrics();
                try {
                    defaultDisplay.getRealMetrics(displayMetrics);
                } catch (NoSuchMethodError unused) {
                    defaultDisplay.getMetrics(displayMetrics);
                }
            }
            if (displayMetrics != null) {
                int i2 = displayMetrics.widthPixels * displayMetrics.heightPixels;
                if (view != null) {
                    int iMin = Math.min(view.getWidth(), displayMetrics.widthPixels) * Math.min(view.getHeight(), displayMetrics.heightPixels);
                    if (iMin + iMin >= i2 || (iMin == 0 && m7054d(view))) {
                        this.f18037e = this.f18035c;
                    }
                }
                m7055e(map);
            }
            this.f18037e = -1L;
            m7055e(map);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m7055e(HashMap map) {
        map.put("tcq", Long.valueOf(this.f18033a));
        map.put("tpq", Long.valueOf(this.f18034b));
        map.put("tcc", Long.valueOf(this.f18039g));
        map.put("tpc", Long.valueOf(this.f18040h));
        map.put("tpv", Long.valueOf(this.f18036d));
        map.put("tcv", Long.valueOf(this.f18035c));
        map.put("tchv", Long.valueOf(this.f18037e));
        map.put("tphv", Long.valueOf(this.f18038f));
        map.put("tst", Long.valueOf(this.f18041i));
    }
}
