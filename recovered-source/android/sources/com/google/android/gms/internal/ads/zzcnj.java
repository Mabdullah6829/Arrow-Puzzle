package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import androidx.webkit.ProfileStore;
import androidx.webkit.WebViewFeature;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcnj {

    /* JADX INFO: renamed from: a */
    public final zzcna f10597a;

    /* JADX INFO: renamed from: b */
    public final zzdzt f10598b;

    public zzcnj(zzcna zzcnaVar, zzdzt zzdztVar) {
        this.f10597a = zzcnaVar;
        this.f10598b = zzdztVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m5675a(final Context context, final VersionInfoParcel versionInfoParcel) {
        zzbio zzbioVar = zzbix.f8757sf;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        zzbiv zzbivVar = zzbaVar.f3098c;
        zzbiv zzbivVar2 = zzbaVar.f3098c;
        if (((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue()) {
            Executor threadPoolExecutor = zzcfy.f9946a;
            if (((Boolean) zzbivVar2.m5030a(zzbix.f8791uf)).booleanValue()) {
                zzcni zzcniVar = new zzcni(((Integer) zzbivVar2.m5030a(zzbix.f8825wf)).intValue());
                int iIntValue = ((Integer) zzbivVar2.m5030a(zzbix.f8808vf)).intValue();
                threadPoolExecutor = new ThreadPoolExecutor(iIntValue, iIntValue, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzcniVar);
            }
            threadPoolExecutor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcng
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
                    zztVar.f3711k.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    zztVar.f3703c.m3231E(context, versionInfoParcel.f3396s);
                    zzbio zzbioVar2 = zzbix.f8774tf;
                    com.google.android.gms.ads.internal.client.zzba zzbaVar2 = com.google.android.gms.ads.internal.client.zzba.f3095e;
                    boolean zBooleanValue = ((Boolean) zzbaVar2.f3098c.m5030a(zzbioVar2)).booleanValue();
                    final zzcnj zzcnjVar = this.f10590s;
                    if (zBooleanValue) {
                        zztVar.f3711k.getClass();
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        zzdzs zzdzsVarM6111a = zzcnjVar.f10598b.m6111a();
                        zzdzsVarM6111a.m6107b("action", "webview_startup_l");
                        StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime2).length());
                        sb.append(jElapsedRealtime2);
                        zzdzsVarM6111a.m6107b("webview_startup_l", sb.toString());
                        zzdzsVarM6111a.m6108c();
                    }
                    if (((Boolean) zzbaVar2.f3098c.m5030a(zzbix.f8876zf)).booleanValue()) {
                        ((zzcfx) zzcfy.f9951f).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnf
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzcnj zzcnjVar2 = zzcnjVar;
                                zzdzt zzdztVar = zzcnjVar2.f10598b;
                                com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                                zzcne zzcneVar = new zzcne(zzcnjVar2, SystemClock.elapsedRealtime());
                                zzcna zzcnaVar = zzcnjVar2.f10597a;
                                zzcnaVar.getClass();
                                if (!WebViewFeature.isFeatureSupported(WebViewFeature.MULTI_PROFILE)) {
                                    int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                    com.google.android.gms.ads.internal.util.client.zzo.m3068a("WebViewFeature.MULTI_PROFILE is not supported");
                                    return;
                                }
                                ProfileStore profileStore = null;
                                try {
                                    profileStore = (ProfileStore) ProfileStore.class.getDeclaredMethod("getInstance", null).invoke(null, null);
                                } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e) {
                                    String strValueOf = String.valueOf(e.getMessage());
                                    int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                    com.google.android.gms.ads.internal.util.client.zzo.m3068a("Unable to get ProfileStore instance: ".concat(strValueOf));
                                    try {
                                        profileStore = (ProfileStore) Class.forName("androidx.webkit.ProfileStore$-CC").getDeclaredMethod("getInstance", null).invoke(null, null);
                                    } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e2) {
                                        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Unable to get ProfileStore instance: ".concat(String.valueOf(e2.getMessage())));
                                    }
                                }
                                if (profileStore == null) {
                                    int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("WebViewCompat failure: No instance");
                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8842xf)).booleanValue()) {
                                        zzdzs zzdzsVarM6111a2 = zzdztVar.m6111a();
                                        zzdzsVarM6111a2.m6107b("action", "webview_p_f");
                                        zzdzsVarM6111a2.m6107b("webview_p_f", "No instance");
                                        zzdzsVarM6111a2.m6108c();
                                        return;
                                    }
                                    return;
                                }
                                zzcnaVar.f10583a = profileStore.getOrCreateProfile("GMA_WEBVIEW_PROFILE");
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8842xf)).booleanValue()) {
                                    com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                                    long jElapsedRealtime3 = SystemClock.elapsedRealtime() - zzcneVar.f10588a;
                                    zzdzs zzdzsVarM6111a3 = zzdztVar.m6111a();
                                    zzdzsVarM6111a3.m6107b("action", "webview_p_l");
                                    zzdzsVarM6111a3.m6107b("webview_p_l", Long.toString(jElapsedRealtime3));
                                    zzdzsVarM6111a3.m6108c();
                                }
                            }
                        });
                    }
                }
            });
        }
    }
}
