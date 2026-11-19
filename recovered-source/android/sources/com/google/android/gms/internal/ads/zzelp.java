package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class zzelp implements zzelq {
    /* JADX INFO: renamed from: f */
    public static zzfvh m6269f(String str) {
        if ("native".equals(str)) {
            return zzfvh.NATIVE;
        }
        return "javascript".equals(str) ? zzfvh.JAVASCRIPT : zzfvh.NONE;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    /* JADX INFO: renamed from: g */
    public static zzfvc m6270g(String str) {
        byte b;
        int iHashCode = str.hashCode();
        if (iHashCode != -1104128070) {
            if (iHashCode != 1318088141) {
                if (iHashCode == 1988248512 && str.equals("onePixel")) {
                    b = 2;
                } else {
                    b = -1;
                }
            } else if (str.equals("definedByJavascript")) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (str.equals("beginToRender")) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0) {
            return zzfvc.BEGIN_TO_RENDER;
        }
        if (b != 1) {
            return b != 2 ? zzfvc.UNSPECIFIED : zzfvc.ONE_PIXEL;
        }
        return zzfvc.DEFINED_BY_JAVASCRIPT;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    /* JADX INFO: renamed from: h */
    public static zzfuz m6271h(String str) {
        byte b;
        int iHashCode = str.hashCode();
        if (iHashCode != -382745961) {
            if (iHashCode != 112202875) {
                if (iHashCode == 714893483 && str.equals("nativeDisplay")) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (str.equals("video")) {
                b = 2;
            } else {
                b = -1;
            }
        } else if (str.equals("htmlDisplay")) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0) {
            return zzfuz.HTML_DISPLAY;
        }
        if (b == 1) {
            return zzfuz.NATIVE_DISPLAY;
        }
        if (b != 2) {
            return null;
        }
        return zzfuz.VIDEO;
    }

    /* JADX INFO: renamed from: i */
    public static final Object m6272i(zzelo zzeloVar) {
        try {
            return zzeloVar.zza();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5385e("omid exception", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m6273j(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5385e("omid exception", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m6274a(final Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8562h6)).booleanValue()) {
            Boolean bool = (Boolean) m6272i(new zzelo() { // from class: com.google.android.gms.internal.ads.zzeln
                @Override // com.google.android.gms.internal.ads.zzelo
                public final Object zza() {
                    zzfut zzfutVar = zzfus.f16595a;
                    if (zzfutVar.f16596a) {
                        return Boolean.TRUE;
                    }
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        throw new IllegalArgumentException("Application Context cannot be null");
                    }
                    if (!zzfutVar.f16596a) {
                        zzfutVar.f16596a = true;
                        zzfwa zzfwaVarM6737a = zzfwa.m6737a();
                        zzfwaVarM6737a.getClass();
                        new zzfvk();
                        zzfwaVarM6737a.f16691b = new zzfvo(new Handler(), applicationContext, zzfwaVarM6737a);
                        zzfvr zzfvrVar = zzfvr.f16670v;
                        zzfvrVar.getClass();
                        boolean z = applicationContext instanceof Application;
                        if (z) {
                            ((Application) applicationContext).registerActivityLifecycleCallbacks(zzfvrVar);
                        }
                        zzfwn.f16711a = (UiModeManager) applicationContext.getSystemService("uimode");
                        WindowManager windowManager = zzfwo.f16712a;
                        zzfwo.f16714c = applicationContext.getResources().getDisplayMetrics().density;
                        zzfwo.f16712a = (WindowManager) applicationContext.getSystemService("window");
                        applicationContext.registerReceiver(new zzfwq(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
                        zzfvx zzfvxVar = zzfvx.f16683b;
                        zzfvxVar.getClass();
                        zzfvxVar.f16684a = applicationContext.getApplicationContext();
                        zzfvq zzfvqVar = zzfvq.f16665e;
                        if (!zzfvqVar.f16667b) {
                            zzfvu zzfvuVar = zzfvqVar.f16668c;
                            if (z) {
                                ((Application) applicationContext).registerActivityLifecycleCallbacks(zzfvuVar);
                            }
                            zzfvuVar.f16676u = zzfvqVar;
                            zzfvuVar.f16674s = true;
                            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                            ActivityManager.getMyMemoryState(runningAppProcessInfo);
                            zzfvuVar.f16675t = runningAppProcessInfo.importance == 100;
                            zzfvqVar.f16669d = zzfvuVar.f16675t;
                            zzfvqVar.f16667b = true;
                        }
                        zzfwc zzfwcVar = zzfwc.f16694d;
                        zzfwcVar.getClass();
                        zzfwcVar.f16695a = new WeakReference(applicationContext);
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
                        intentFilter.addAction("android.intent.action.SCREEN_ON");
                        applicationContext.registerReceiver(new zzfwb(zzfwcVar), intentFilter);
                    }
                    return Boolean.valueOf(zzfutVar.f16596a);
                }
            });
            return bool != null && bool.booleanValue();
        }
        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Omid flag is disabled");
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final zzelv m6275b(final WebView webView, final zzelr zzelrVar, final zzels zzelsVar, final String str, final String str2, final String str3) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8562h6)).booleanValue() && zzfus.f16595a.f16596a) {
            return (zzelv) m6272i(new zzelo() { // from class: com.google.android.gms.internal.ads.zzelf
                @Override // com.google.android.gms.internal.ads.zzelo
                public final Object zza() {
                    if (TextUtils.isEmpty("Google")) {
                        throw new IllegalArgumentException("Name is null or empty");
                    }
                    String str4 = str;
                    if (TextUtils.isEmpty(str4)) {
                        throw new IllegalArgumentException("Version is null or empty");
                    }
                    zzfvi zzfviVar = new zzfvi("Google", str4);
                    zzfvh zzfvhVarM6269f = zzelp.m6269f("javascript");
                    zzelr zzelrVar2 = zzelrVar;
                    zzfuz zzfuzVarM6271h = zzelp.m6271h(zzelrVar2.f14164s);
                    zzfvh zzfvhVar = zzfvh.NONE;
                    if (zzfvhVarM6269f == zzfvhVar) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Omid html session error; Unable to parse impression owner: javascript");
                        return null;
                    }
                    if (zzfuzVarM6271h == null) {
                        String strValueOf = String.valueOf(zzelrVar2);
                        int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Omid html session error; Unable to parse creative type: ".concat(strValueOf));
                        return null;
                    }
                    String str5 = str2;
                    zzfvh zzfvhVarM6269f2 = zzelp.m6269f(str5);
                    if (zzfuzVarM6271h == zzfuz.VIDEO && zzfvhVarM6269f2 == zzfvhVar) {
                        String strValueOf2 = String.valueOf(str5);
                        int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Omid html session error; Video events owner unknown for video creative: ".concat(strValueOf2));
                        return null;
                    }
                    zzfuw zzfuwVar = new zzfuw(zzfviVar, webView, str3, "", zzfux.HTML);
                    zzfuv zzfuvVarM6724a = zzfuv.m6724a(zzfuzVarM6271h, zzelp.m6270g(zzelsVar.f14170s), zzfvhVarM6269f, zzfvhVarM6269f2, true);
                    if (zzfus.f16595a.f16596a) {
                        return new zzelv(new zzfuy(zzfuvVarM6724a, zzfuwVar, UUID.randomUUID().toString()), zzfuwVar);
                    }
                    throw new IllegalStateException("Method called before OM SDK activation");
                }
            });
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m6276c(final zzfuy zzfuyVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8562h6)).booleanValue() && zzfus.f16595a.f16596a) {
            m6273j(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeld
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfuyVar.m6725d();
                }
            });
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m6277d(final zzfuy zzfuyVar, final View view) {
        m6273j(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeli
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8562h6)).booleanValue() && zzfus.f16595a.f16596a) {
                    zzfuyVar.mo6723c(view, zzfvb.f16631s);
                }
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m6278e(final zzfuy zzfuyVar, final View view) {
        m6273j(new Runnable() { // from class: com.google.android.gms.internal.ads.zzelj
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8562h6)).booleanValue() && zzfus.f16595a.f16596a) {
                    zzfuyVar.mo6721a(view);
                }
            }
        });
    }
}
