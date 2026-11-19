package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbub {

    /* JADX INFO: renamed from: b */
    public final Context f9383b;

    /* JADX INFO: renamed from: c */
    public final String f9384c;

    /* JADX INFO: renamed from: d */
    public final VersionInfoParcel f9385d;

    /* JADX INFO: renamed from: e */
    public final zzfqt f9386e;

    /* JADX INFO: renamed from: f */
    public final com.google.android.gms.ads.internal.util.zzbc f9387f;

    /* JADX INFO: renamed from: g */
    public final com.google.android.gms.ads.internal.util.zzbc f9388g;

    /* JADX INFO: renamed from: h */
    public zzbua f9389h;

    /* JADX INFO: renamed from: a */
    public final Object f9382a = new Object();

    /* JADX INFO: renamed from: i */
    public int f9390i = 1;

    public zzbub(Context context, VersionInfoParcel versionInfoParcel, String str, com.google.android.gms.ads.internal.util.zzbc zzbcVar, com.google.android.gms.ads.internal.util.zzbc zzbcVar2, zzfqt zzfqtVar) {
        this.f9384c = str;
        this.f9383b = context.getApplicationContext();
        this.f9385d = versionInfoParcel;
        this.f9386e = zzfqtVar;
        this.f9387f = zzbcVar;
        this.f9388g = zzbcVar2;
    }

    /* JADX INFO: renamed from: a */
    public final zzbua m5141a() {
        zzfqg zzfqgVarM6562l = zzfqg.m6562l(this.f9383b, 6);
        zzfqgVarM6562l.zza();
        final zzbua zzbuaVar = new zzbua(this.f9388g);
        com.google.android.gms.ads.internal.util.zze.m3150k("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        ((zzcfx) zzcfy.f9951f).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbtr
            @Override // java.lang.Runnable
            public final void run() {
                zzbua zzbuaVar2 = zzbuaVar;
                zzbub zzbubVar = this.f9368s;
                com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                try {
                    com.google.android.gms.ads.internal.util.zze.m3150k("loadJavascriptEngine > Before createJavascriptEngine");
                    Context context = zzbubVar.f9383b;
                    VersionInfoParcel versionInfoParcel = zzbubVar.f9385d;
                    final zzbte zzbteVar = new zzbte();
                    zzclb zzclbVarM5647a = zzclr.m5647a(context, versionInfoParcel, null, null, null, zzbhw.m4893a(), null, new zzcnl(0, 0, 0), null, null, null, null, null, "", false, false);
                    zzbteVar.f9335s = zzclbVarM5647a;
                    zzclbVarM5647a.mo5577H().setWillNotDraw(true);
                    com.google.android.gms.ads.internal.util.zze.m3150k("loadJavascriptEngine > After createJavascriptEngine");
                    com.google.android.gms.ads.internal.util.zze.m3150k("loadJavascriptEngine > Before setting new engine loaded listener");
                    final zzbtp zzbtpVar = new zzbtp(jCurrentTimeMillis, zzbteVar, zzbuaVar2, zzbubVar, arrayList);
                    zzclb zzclbVar = zzbteVar.f9335s;
                    if (zzclbVar != null) {
                        zzclbVar.mo5582K().f10451z = new zzcmy() { // from class: com.google.android.gms.internal.ads.zzbsy
                            @Override // com.google.android.gms.internal.ads.zzcmy
                            public final void zza() {
                                zzbtp zzbtpVar2 = (zzbtp) zzbtpVar;
                                com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                final long j2 = zzbtpVar2.f9360c;
                                final ArrayList arrayList2 = zzbtpVar2.f9359b;
                                arrayList2.add(Long.valueOf(jCurrentTimeMillis2 - j2));
                                String strValueOf = String.valueOf(arrayList2.get(0));
                                StringBuilder sb = new StringBuilder(strValueOf.length() + 52);
                                sb.append("LoadNewJavascriptEngine(onEngLoaded) latency is ");
                                sb.append(strValueOf);
                                sb.append(" ms.");
                                com.google.android.gms.ads.internal.util.zze.m3150k(sb.toString());
                                com.google.android.gms.ads.internal.util.zzf zzfVar = com.google.android.gms.ads.internal.util.zzs.f3626l;
                                final zzbub zzbubVar2 = zzbtpVar2.f9358a;
                                final zzbua zzbuaVar3 = zzbtpVar2.f9361d;
                                final zzbte zzbteVar2 = zzbtpVar2.f9362e;
                                zzfVar.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbtq
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        zzbub zzbubVar3 = zzbubVar2;
                                        zzbua zzbuaVar4 = zzbuaVar3;
                                        final zzbte zzbteVar3 = zzbteVar2;
                                        ArrayList arrayList3 = arrayList2;
                                        long j3 = j2;
                                        com.google.android.gms.ads.internal.util.zze.m3150k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
                                        synchronized (zzbubVar3.f9382a) {
                                            try {
                                                com.google.android.gms.ads.internal.util.zze.m3150k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
                                                if (zzbuaVar4.f9964b.get() != -1 && zzbuaVar4.f9964b.get() != 1) {
                                                    zzbio zzbioVar = zzbix.f8045C8;
                                                    com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                                                    if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                                                        zzbuaVar4.m5401c("SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener", new TimeoutException("Unable to receive /jsLoaded GMSG."));
                                                    } else {
                                                        zzbuaVar4.m5400b();
                                                    }
                                                    ((zzcfx) zzcfy.f9951f).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbtm
                                                        @Override // java.lang.Runnable
                                                        public final /* synthetic */ void run() {
                                                            zzbteVar3.zzj();
                                                        }
                                                    });
                                                    String strValueOf2 = String.valueOf(zzbaVar.f3098c.m5030a(zzbix.f8487d));
                                                    int i2 = zzbuaVar4.f9964b.get();
                                                    int i3 = zzbubVar3.f9390i;
                                                    String strValueOf3 = String.valueOf(arrayList3.get(0));
                                                    com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                                                    long jCurrentTimeMillis3 = System.currentTimeMillis() - j3;
                                                    StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 94 + String.valueOf(i2).length() + 39 + String.valueOf(i3).length() + 57 + strValueOf3.length() + 42 + String.valueOf(jCurrentTimeMillis3).length() + 15);
                                                    sb2.append("Could not receive /jsLoaded in ");
                                                    sb2.append(strValueOf2);
                                                    sb2.append(" ms. JS engine session reference status(onEngLoadedTimeout) is ");
                                                    sb2.append(i2);
                                                    sb2.append(". Update status(onEngLoadedTimeout) is ");
                                                    sb2.append(i3);
                                                    sb2.append(". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is ");
                                                    sb2.append(strValueOf3);
                                                    sb2.append(" ms. Total latency(onEngLoadedTimeout) is ");
                                                    sb2.append(jCurrentTimeMillis3);
                                                    sb2.append(" ms. Rejecting.");
                                                    com.google.android.gms.ads.internal.util.zze.m3150k(sb2.toString());
                                                    com.google.android.gms.ads.internal.util.zze.m3150k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                                                    return;
                                                }
                                                com.google.android.gms.ads.internal.util.zze.m3150k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                    }
                                }, ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8487d)).intValue());
                            }
                        };
                    }
                    com.google.android.gms.ads.internal.util.zze.m3150k("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
                    zzbteVar.mo5134r("/jsLoaded", new zzbtg(zzbubVar, jCurrentTimeMillis, zzbuaVar2, zzbteVar));
                    com.google.android.gms.ads.internal.util.zzbv zzbvVar = new com.google.android.gms.ads.internal.util.zzbv();
                    zzbth zzbthVar = new zzbth(zzbubVar, zzbteVar, zzbvVar);
                    zzbvVar.f3546a = zzbthVar;
                    com.google.android.gms.ads.internal.util.zze.m3150k("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
                    if (!((Boolean) zzbkx.f9062d.m5057c()).booleanValue() || TextUtils.equals(zzbubVar.f9383b.getPackageName(), "com.google.android.gms")) {
                        zzbteVar.mo5134r("/requestReload", zzbthVar);
                    }
                    final String str = zzbubVar.f9384c;
                    com.google.android.gms.ads.internal.util.zze.m3150k("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(str)));
                    if (str.endsWith(".js")) {
                        com.google.android.gms.ads.internal.util.zze.m3150k("loadJavascriptEngine > Before newEngine.loadJavascript");
                        com.google.android.gms.ads.internal.util.zze.m3150k("loadJavascript on adWebView from path: ".concat(str));
                        final String str2 = "<!DOCTYPE html><html><head><script src=\"" + str + "\"></script></head><body></body></html>";
                        zzbte.m5132c(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsz
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzclb zzclbVar2 = zzbteVar.f9335s;
                                if (zzclbVar2 != null) {
                                    zzclbVar2.loadData(str2, "text/html", "UTF-8");
                                }
                            }
                        });
                        com.google.android.gms.ads.internal.util.zze.m3150k("loadJavascriptEngine > After newEngine.loadJavascript");
                    } else if (str.startsWith("<html>")) {
                        com.google.android.gms.ads.internal.util.zze.m3150k("loadJavascriptEngine > Before newEngine.loadHtml");
                        com.google.android.gms.ads.internal.util.zze.m3150k("loadHtml on adWebView from html");
                        zzbte.m5132c(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbta
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzclb zzclbVar2 = zzbteVar.f9335s;
                                if (zzclbVar2 != null) {
                                    zzclbVar2.loadData(str, "text/html", "UTF-8");
                                }
                            }
                        });
                        com.google.android.gms.ads.internal.util.zze.m3150k("loadJavascriptEngine > After newEngine.loadHtml");
                    } else {
                        com.google.android.gms.ads.internal.util.zze.m3150k("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                        com.google.android.gms.ads.internal.util.zze.m3150k("loadHtmlWrapper on adWebView from path: ".concat(str));
                        zzbte.m5132c(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbtb
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzclb zzclbVar2 = zzbteVar.f9335s;
                                if (zzclbVar2 != null) {
                                    zzclbVar2.loadUrl(str);
                                }
                            }
                        });
                        com.google.android.gms.ads.internal.util.zze.m3150k("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
                    }
                    com.google.android.gms.ads.internal.util.zze.m3150k("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
                    com.google.android.gms.ads.internal.util.zzs.f3626l.postDelayed(new zzbtj(jCurrentTimeMillis, zzbteVar, zzbuaVar2, zzbubVar, arrayList), ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8504e)).intValue());
                } catch (Throwable th) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                    com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error creating webview.", th);
                    zzbio zzbioVar = zzbix.f8045C8;
                    com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                    if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                        zzbuaVar2.m5401c("SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine", th);
                        return;
                    }
                    if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8079E8)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5385e("SdkJavascriptFactory.loadJavascriptEngine", th);
                        zzbuaVar2.m5400b();
                    } else {
                        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("SdkJavascriptFactory.loadJavascriptEngine", th);
                        zzbuaVar2.m5400b();
                    }
                }
            }
        });
        com.google.android.gms.ads.internal.util.zze.m3150k("loadNewJavascriptEngine: Promise created");
        zzbuaVar.m5399a(new zzbtk(this, zzbuaVar, zzfqgVarM6562l), new zzbtl(this, zzbuaVar, zzfqgVarM6562l));
        return zzbuaVar;
    }

    /* JADX INFO: renamed from: b */
    public final zzbtv m5142b() {
        com.google.android.gms.ads.internal.util.zze.m3150k("getEngine: Trying to acquire lock");
        Object obj = this.f9382a;
        synchronized (obj) {
            try {
                com.google.android.gms.ads.internal.util.zze.m3150k("getEngine: Lock acquired");
                com.google.android.gms.ads.internal.util.zze.m3150k("refreshIfDestroyed: Trying to acquire lock");
                synchronized (obj) {
                    try {
                        com.google.android.gms.ads.internal.util.zze.m3150k("refreshIfDestroyed: Lock acquired");
                        zzbua zzbuaVar = this.f9389h;
                        if (zzbuaVar != null && this.f9390i == 0) {
                            zzbuaVar.m5399a(new zzcgh() { // from class: com.google.android.gms.internal.ads.zzbtn
                                @Override // com.google.android.gms.internal.ads.zzcgh
                                /* JADX INFO: renamed from: b */
                                public final /* synthetic */ void mo5135b(Object obj2) {
                                    zzbub zzbubVar = this.f9356a;
                                    zzbubVar.getClass();
                                    if (((zzbsw) obj2).zzk()) {
                                        zzbubVar.f9390i = 1;
                                    }
                                }
                            }, new zzcgf() { // from class: com.google.android.gms.internal.ads.zzbto
                                @Override // com.google.android.gms.internal.ads.zzcgf
                                public final /* synthetic */ void zza() {
                                }
                            });
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        com.google.android.gms.ads.internal.util.zze.m3150k("refreshIfDestroyed: Lock released");
        zzbua zzbuaVar2 = this.f9389h;
        if (zzbuaVar2 != null && zzbuaVar2.f9964b.get() != -1) {
            int i2 = this.f9390i;
            if (i2 == 0) {
                com.google.android.gms.ads.internal.util.zze.m3150k("getEngine (NO_UPDATE): Lock released");
                return this.f9389h.m5137d();
            }
            if (i2 != 1) {
                com.google.android.gms.ads.internal.util.zze.m3150k("getEngine (UPDATING): Lock released");
                return this.f9389h.m5137d();
            }
            this.f9390i = 2;
            m5141a();
            com.google.android.gms.ads.internal.util.zze.m3150k("getEngine (PENDING_UPDATE): Lock released");
            return this.f9389h.m5137d();
        }
        this.f9390i = 2;
        this.f9389h = m5141a();
        com.google.android.gms.ads.internal.util.zze.m3150k("getEngine (NULL or REJECTED): Lock released");
        return this.f9389h.m5137d();
    }
}
