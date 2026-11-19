package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdob implements zzdcz, zzdkl {

    /* JADX INFO: renamed from: s */
    public final zzced f12411s;

    /* JADX INFO: renamed from: t */
    public final Context f12412t;

    /* JADX INFO: renamed from: u */
    public final zzceg f12413u;

    /* JADX INFO: renamed from: v */
    public final View f12414v;

    /* JADX INFO: renamed from: w */
    public String f12415w;

    /* JADX INFO: renamed from: x */
    public final zzbic.zza.EnumC6586zza f12416x;

    /* JADX INFO: renamed from: y */
    public final zzfkn f12417y;

    public zzdob(zzced zzcedVar, Context context, zzceg zzcegVar, WebView webView, zzbic.zza.EnumC6586zza enumC6586zza, zzfkn zzfknVar) {
        this.f12411s = zzcedVar;
        this.f12412t = context;
        this.f12413u = zzcegVar;
        this.f12414v = webView;
        this.f12416x = enumC6586zza;
        this.f12417y = zzfknVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: G */
    public final void mo5824G() {
        if (this.f12417y.f15894G0) {
            View view = this.f12414v;
            if (view != null && this.f12415w != null) {
                Context context = view.getContext();
                String str = this.f12415w;
                zzceg zzcegVar = this.f12413u;
                AtomicReference atomicReference = zzcegVar.f9835h;
                if (zzcegVar.m5361a(context) && (context instanceof Activity) && zzcegVar.m5371m(context, "com.google.firebase.analytics.FirebaseAnalytics", atomicReference, false)) {
                    ConcurrentHashMap concurrentHashMap = zzcegVar.f9836i;
                    Method declaredMethod = (Method) concurrentHashMap.get("setCurrentScreen");
                    if (declaredMethod == null) {
                        try {
                            declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                            concurrentHashMap.put("setCurrentScreen", declaredMethod);
                        } catch (Exception unused) {
                            zzcegVar.m5370l("setCurrentScreen", false);
                            declaredMethod = null;
                        }
                    }
                    try {
                        declaredMethod.invoke(atomicReference.get(), (Activity) context, str, context.getPackageName());
                    } catch (Exception unused2) {
                        zzcegVar.m5370l("setCurrentScreen", false);
                    }
                }
            }
            this.f12411s.m5358a(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: a */
    public final void mo5825a() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: b */
    public final void mo5826b() {
    }

    @Override // com.google.android.gms.internal.ads.zzdkl
    /* JADX INFO: renamed from: c */
    public final void mo5890c() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: l */
    public final void mo5827l(zzcbt zzcbtVar, String str, String str2) {
        zzceg zzcegVar = this.f12413u;
        Context context = this.f12412t;
        if (zzcegVar.m5361a(context) && this.f12417y.f15894G0) {
            try {
                zzcegVar.m5365e(context, zzcegVar.m5364d(context), this.f12411s.f9823u, zzcbtVar.f9736s, zzcbtVar.f9737t);
            } catch (RemoteException e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3074g("Remote Exception to get reward item.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: u */
    public final void mo5828u() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    /* JADX INFO: renamed from: x */
    public final void mo5829x() {
        if (this.f12417y.f15894G0) {
            this.f12411s.m5358a(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkl
    public final void zzh() {
        zzbic.zza.EnumC6586zza enumC6586zza = zzbic.zza.EnumC6586zza.APP_OPEN;
        zzbic.zza.EnumC6586zza enumC6586zza2 = this.f12416x;
        if (enumC6586zza2 != enumC6586zza && this.f12417y.f15894G0) {
            zzceg zzcegVar = this.f12413u;
            Context context = this.f12412t;
            String str = "";
            if (zzcegVar.m5361a(context)) {
                AtomicReference atomicReference = zzcegVar.f9834g;
                if (zzcegVar.m5371m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                    try {
                        String str2 = (String) zzcegVar.m5367i(context, "getCurrentScreenName").invoke(atomicReference.get(), null);
                        if (str2 == null) {
                            str2 = (String) zzcegVar.m5367i(context, "getCurrentScreenClass").invoke(atomicReference.get(), null);
                        }
                        if (str2 != null) {
                            str = str2;
                        }
                    } catch (Exception unused) {
                        zzcegVar.m5370l("getCurrentScreenName", false);
                    }
                }
            }
            this.f12415w = str;
            this.f12415w = String.valueOf(str).concat(enumC6586zza2 == zzbic.zza.EnumC6586zza.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
        }
    }
}
