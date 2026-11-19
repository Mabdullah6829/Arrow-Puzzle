package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcfk {

    /* JADX INFO: renamed from: a */
    public final Object f9889a = new Object();

    /* JADX INFO: renamed from: b */
    public final com.google.android.gms.ads.internal.util.zzj f9890b;

    /* JADX INFO: renamed from: c */
    public final zzcfp f9891c;

    /* JADX INFO: renamed from: d */
    public boolean f9892d;

    /* JADX INFO: renamed from: e */
    public Context f9893e;

    /* JADX INFO: renamed from: f */
    public VersionInfoParcel f9894f;

    /* JADX INFO: renamed from: g */
    public String f9895g;

    /* JADX INFO: renamed from: h */
    public zzbjc f9896h;

    /* JADX INFO: renamed from: i */
    public zzdzt f9897i;

    /* JADX INFO: renamed from: j */
    public Boolean f9898j;

    /* JADX INFO: renamed from: k */
    public final AtomicInteger f9899k;

    /* JADX INFO: renamed from: l */
    public final AtomicInteger f9900l;

    /* JADX INFO: renamed from: m */
    public final zzcfj f9901m;

    /* JADX INFO: renamed from: n */
    public final Object f9902n;

    /* JADX INFO: renamed from: o */
    public ListenableFuture f9903o;

    /* JADX INFO: renamed from: p */
    public final AtomicBoolean f9904p;

    /* JADX INFO: renamed from: q */
    public final AtomicBoolean f9905q;

    public zzcfk() {
        com.google.android.gms.ads.internal.util.zzj zzjVar = new com.google.android.gms.ads.internal.util.zzj();
        this.f9890b = zzjVar;
        this.f9891c = new zzcfp(com.google.android.gms.ads.internal.client.zzay.f3085g.f3091f, zzjVar);
        this.f9892d = false;
        this.f9896h = null;
        this.f9897i = null;
        this.f9898j = null;
        this.f9899k = new AtomicInteger(0);
        this.f9900l = new AtomicInteger(0);
        this.f9901m = new zzcfj(0);
        this.f9902n = new Object();
        this.f9904p = new AtomicBoolean();
        this.f9905q = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: a */
    public final zzbjc m5381a() {
        zzbjc zzbjcVar;
        synchronized (this.f9889a) {
            zzbjcVar = this.f9896h;
        }
        return zzbjcVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m5382b(Context context, VersionInfoParcel versionInfoParcel, zzdzt zzdztVar) {
        zzbjc zzbjcVar;
        synchronized (this.f9889a) {
            try {
                if (!this.f9892d) {
                    this.f9893e = context.getApplicationContext();
                    this.f9894f = versionInfoParcel;
                    com.google.android.gms.ads.internal.zzt.f3698C.f3707g.m4852b(this.f9891c);
                    this.f9890b.m3182g(this.f9893e);
                    zzcaf.m5287d(this.f9893e, this.f9894f);
                    this.f9897i = zzdztVar;
                    zzbio zzbioVar = zzbix.f8073E2;
                    com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                    if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                        zzbjcVar = new zzbjc();
                    } else {
                        com.google.android.gms.ads.internal.util.zze.m3150k("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        zzbjcVar = null;
                    }
                    this.f9896h = zzbjcVar;
                    if (zzbjcVar != null) {
                        zzcgb.m5394a(new zzcfg(this).mo3108b(), "AppState.registerCsiReporter", zzcfy.f9953h);
                    }
                    Context context2 = this.f9893e;
                    if (PlatformVersion.m3653a()) {
                        if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8046C9)).booleanValue()) {
                            try {
                                ((ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new zzcfh(this));
                            } catch (RuntimeException e) {
                                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                                com.google.android.gms.ads.internal.util.client.zzo.m3074g("Failed to register network callback", e);
                                this.f9904p.set(true);
                            }
                        }
                    }
                    this.f9892d = true;
                    m5388h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8757sf)).booleanValue()) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.f3698C.f3703c.m3231E(context, versionInfoParcel.f3396s);
    }

    /* JADX INFO: renamed from: c */
    public final Resources m5383c() {
        if (this.f9894f.f3399v) {
            return this.f9893e.getResources();
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8669nc)).booleanValue()) {
                return com.google.android.gms.ads.internal.util.client.zzs.m3080b(this.f9893e).f4731a.getResources();
            }
            com.google.android.gms.ads.internal.util.client.zzs.m3080b(this.f9893e).f4731a.getResources();
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5384d(String str, Throwable th) {
        zzcaf.m5287d(this.f9893e, this.f9894f).mo5291a(str, th);
    }

    /* JADX INFO: renamed from: e */
    public final void m5385e(String str, Throwable th) {
        zzcaf.m5287d(this.f9893e, this.f9894f).mo5292b(th, str, ((Double) zzblg.f9128f.m5057c()).floatValue());
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0037 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:4:0x0007, B:6:0x000b, B:8:0x001d, B:10:0x002d, B:13:0x0037, B:14:0x003e), top: B:19:0x0007 }] */
    /* JADX INFO: renamed from: f */
    public final void m5386f(String str, Throwable th) {
        Context context = this.f9893e;
        VersionInfoParcel versionInfoParcel = this.f9894f;
        synchronized (zzcaf.f9585l) {
            try {
                if (zzcaf.f9587n == null) {
                    zzbio zzbioVar = zzbix.f8011A8;
                    com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                    if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                        if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8869z8)).booleanValue()) {
                            zzcaf.f9587n = new zzcag();
                        } else {
                            zzcaf.f9587n = new zzcaf(context, versionInfoParcel);
                        }
                    } else {
                        zzcaf.f9587n = new zzcag();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zzcaf.f9587n.mo5291a(str, th);
    }

    /* JADX INFO: renamed from: g */
    public final com.google.android.gms.ads.internal.util.zzj m5387g() {
        com.google.android.gms.ads.internal.util.zzj zzjVar;
        synchronized (this.f9889a) {
            zzjVar = this.f9890b;
        }
        return zzjVar;
    }

    /* JADX INFO: renamed from: h */
    public final ListenableFuture m5388h() {
        if (this.f9893e != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8210M3)).booleanValue()) {
                synchronized (this.f9902n) {
                    try {
                        ListenableFuture listenableFuture = this.f9903o;
                        if (listenableFuture != null) {
                            return listenableFuture;
                        }
                        ListenableFuture listenableFutureSubmit = ((zzhbb) zzcfy.f9946a).submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzcfi
                            @Override // java.util.concurrent.Callable
                            public final /* synthetic */ Object call() {
                                Context contextM5311a = zzcbu.m5311a(this.f9885a.f9893e);
                                ArrayList arrayList = new ArrayList();
                                try {
                                    PackageInfo packageInfoM3663b = Wrappers.m3665a(contextM5311a).m3663b(4096, contextM5311a.getApplicationInfo().packageName);
                                    if (packageInfoM3663b.requestedPermissions != null && packageInfoM3663b.requestedPermissionsFlags != null) {
                                        int i2 = 0;
                                        while (true) {
                                            String[] strArr = packageInfoM3663b.requestedPermissions;
                                            if (i2 >= strArr.length) {
                                                break;
                                            }
                                            if ((packageInfoM3663b.requestedPermissionsFlags[i2] & 2) != 0) {
                                                arrayList.add(strArr[i2]);
                                            }
                                            i2++;
                                        }
                                    }
                                } catch (PackageManager.NameNotFoundException unused) {
                                }
                                return arrayList;
                            }
                        });
                        this.f9903o = listenableFutureSubmit;
                        return listenableFutureSubmit;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return zzhcf.m7367a(new ArrayList());
    }

    /* JADX INFO: renamed from: i */
    public final boolean m5389i(Context context) {
        if (PlatformVersion.m3653a()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8046C9)).booleanValue()) {
                return this.f9904p.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
