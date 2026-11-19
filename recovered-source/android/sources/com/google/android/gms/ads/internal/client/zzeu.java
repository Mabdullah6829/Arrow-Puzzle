package com.google.android.gms.ads.internal.client;

import android.content.ContextWrapper;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzbrw;
import com.google.android.gms.internal.ads.zzbse;
import com.google.android.gms.internal.ads.zzbsf;
import com.google.android.gms.internal.ads.zzbvf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzeu {

    /* JADX INFO: renamed from: k */
    public static zzeu f3161k;

    /* JADX INFO: renamed from: a */
    public zzem f3162a;

    /* JADX INFO: renamed from: b */
    public zzey f3163b;

    /* JADX INFO: renamed from: c */
    public zzel f3164c;

    /* JADX INFO: renamed from: e */
    public final ArrayList f3166e;

    /* JADX INFO: renamed from: i */
    public zzcy f3170i;

    /* JADX INFO: renamed from: j */
    public final RequestConfiguration f3171j;

    /* JADX INFO: renamed from: d */
    public final Object f3165d = new Object();

    /* JADX INFO: renamed from: f */
    public boolean f3167f = false;

    /* JADX INFO: renamed from: g */
    public boolean f3168g = false;

    /* JADX INFO: renamed from: h */
    public final Object f3169h = new Object();

    static {
        new HashSet(Arrays.asList(AdFormat.APP_OPEN_AD, AdFormat.INTERSTITIAL, AdFormat.REWARDED));
    }

    private zzeu() {
        RequestConfiguration.Builder builder = new RequestConfiguration.Builder();
        this.f3171j = new RequestConfiguration(builder.f2974a, builder.f2975b);
        this.f3166e = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static zzbsf m2943a(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            map.put(((zzbrw) it.next()).f9309s, new zzbse());
        }
        return new zzbsf();
    }

    /* JADX INFO: renamed from: d */
    public static zzeu m2944d() {
        zzeu zzeuVar;
        synchronized (zzeu.class) {
            try {
                if (f3161k == null) {
                    f3161k = new zzeu();
                }
                zzeuVar = f3161k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzeuVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m2945b(ContextWrapper contextWrapper) {
        if (this.f3170i == null) {
            this.f3170i = (zzcy) new zzat(zzay.f3085g.f3087b, contextWrapper).m2811d(contextWrapper, false);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2946c() {
        zzcy zzcyVar = this.f3170i;
        if (zzcyVar == null) {
            return;
        }
        try {
            zzcyVar.mo2894a();
            this.f3170i.mo2890H0(new ObjectWrapper(null), null);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("MobileAdsSettingManager initialization failed", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0086 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:20:0x0029, B:22:0x0030, B:27:0x0048, B:30:0x0053, B:32:0x0064, B:34:0x0076, B:41:0x00b9, B:42:0x00d4, B:35:0x0086, B:37:0x0094, B:39:0x00a6, B:40:0x00b1, B:29:0x004e), top: B:48:0x0029, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0094 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:20:0x0029, B:22:0x0030, B:27:0x0048, B:30:0x0053, B:32:0x0064, B:34:0x0076, B:41:0x00b9, B:42:0x00d4, B:35:0x0086, B:37:0x0094, B:39:0x00a6, B:40:0x00b1, B:29:0x004e), top: B:48:0x0029, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a6 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:20:0x0029, B:22:0x0030, B:27:0x0048, B:30:0x0053, B:32:0x0064, B:34:0x0076, B:41:0x00b9, B:42:0x00d4, B:35:0x0086, B:37:0x0094, B:39:0x00a6, B:40:0x00b1, B:29:0x004e), top: B:48:0x0029, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b1 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:20:0x0029, B:22:0x0030, B:27:0x0048, B:30:0x0053, B:32:0x0064, B:34:0x0076, B:41:0x00b9, B:42:0x00d4, B:35:0x0086, B:37:0x0094, B:39:0x00a6, B:40:0x00b1, B:29:0x004e), top: B:48:0x0029, inners: #2 }] */
    /* JADX INFO: renamed from: e */
    public final void m2947e(ContextWrapper contextWrapper, OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.f3165d) {
            try {
                if (this.f3167f) {
                    this.f3166e.add(onInitializationCompleteListener);
                    return;
                }
                if (this.f3168g) {
                    m2948f();
                    onInitializationCompleteListener.mo2782a();
                    return;
                }
                this.f3167f = true;
                this.f3166e.add(onInitializationCompleteListener);
                synchronized (this.f3169h) {
                    try {
                        try {
                            m2945b(contextWrapper);
                            zzcy zzcyVar = this.f3170i;
                            if (zzcyVar != null) {
                                zzcyVar.mo2892W0(new zzet(this));
                                this.f3170i.mo2891M2(new zzbvf());
                            }
                            this.f3171j.getClass();
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.m3074g("MobileAdsSettingManager initialization failed", e);
                    }
                    zzbix.m5032a(contextWrapper);
                    if (((Boolean) zzbkv.f9039a.m5057c()).booleanValue()) {
                        if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8032Bc)).booleanValue()) {
                            com.google.android.gms.ads.internal.util.client.zzo.m3068a("Initializing on bg thread");
                            com.google.android.gms.ads.internal.util.client.zzb.f3403a.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzer
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    zzeu zzeuVar = this.f3159s;
                                    synchronized (zzeuVar.f3169h) {
                                        zzeuVar.m2946c();
                                    }
                                }
                            });
                        } else if (((Boolean) zzbkv.f9040b.m5057c()).booleanValue()) {
                            if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8032Bc)).booleanValue()) {
                                com.google.android.gms.ads.internal.util.client.zzb.f3404b.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzep
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        zzeu zzeuVar = this.f3158s;
                                        synchronized (zzeuVar.f3169h) {
                                            zzeuVar.m2946c();
                                        }
                                    }
                                });
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzo.m3068a("Initializing on calling thread");
                                m2946c();
                            }
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.m3068a("Initializing on calling thread");
                            m2946c();
                        }
                    } else if (((Boolean) zzbkv.f9040b.m5057c()).booleanValue()) {
                        if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8032Bc)).booleanValue()) {
                            com.google.android.gms.ads.internal.util.client.zzb.f3404b.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzep
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    zzeu zzeuVar = this.f3158s;
                                    synchronized (zzeuVar.f3169h) {
                                        zzeuVar.m2946c();
                                    }
                                }
                            });
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.m3068a("Initializing on calling thread");
                            m2946c();
                        }
                    } else {
                        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Initializing on calling thread");
                        m2946c();
                    }
                    this.f3162a = new zzem(contextWrapper, AdFormat.INTERSTITIAL);
                    this.f3163b = new zzey(contextWrapper, AdFormat.REWARDED);
                    this.f3164c = new zzel(contextWrapper, AdFormat.APP_OPEN_AD);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final InitializationStatus m2948f() {
        synchronized (this.f3169h) {
            Preconditions.m3547k(this.f3170i != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            zzcy zzcyVar = this.f3170i;
            if (zzcyVar == null) {
                return new zzeq();
            }
            try {
                return m2943a(zzcyVar.mo2896f());
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.m3070c("Unable to get Initialization status.");
                return new zzeq();
            }
        }
    }
}
