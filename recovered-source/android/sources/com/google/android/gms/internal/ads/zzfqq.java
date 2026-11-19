package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfqq implements Runnable {

    /* JADX INFO: renamed from: t */
    public final zzfqt f16334t;

    /* JADX INFO: renamed from: u */
    public String f16335u;

    /* JADX INFO: renamed from: w */
    public String f16337w;

    /* JADX INFO: renamed from: x */
    public zzfkx f16338x;

    /* JADX INFO: renamed from: y */
    public com.google.android.gms.ads.internal.client.zze f16339y;

    /* JADX INFO: renamed from: z */
    public ScheduledFuture f16340z;

    /* JADX INFO: renamed from: s */
    public final ArrayList f16333s = new ArrayList();

    /* JADX INFO: renamed from: A */
    public int f16332A = 2;

    /* JADX INFO: renamed from: v */
    public zzfqv f16336v = zzfqv.SCAR_REQUEST_TYPE_UNSPECIFIED;

    public zzfqq(zzfqt zzfqtVar) {
        this.f16334t = zzfqtVar;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m6578a(zzfqg zzfqgVar) {
        try {
            if (((Boolean) zzbkq.f9009c.m5057c()).booleanValue()) {
                ArrayList arrayList = this.f16333s;
                zzfqgVar.zzc();
                arrayList.add(zzfqgVar);
                ScheduledFuture scheduledFuture = this.f16340z;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f16340z = ((ScheduledThreadPoolExecutor) zzcfy.f9949d).schedule(this, ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8382W9)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m6579b(ArrayList arrayList) {
        try {
            if (((Boolean) zzbkq.f9009c.m5057c()).booleanValue()) {
                if (arrayList.contains("banner") || arrayList.contains("BANNER")) {
                    this.f16332A = 3;
                } else if (arrayList.contains("interstitial") || arrayList.contains("INTERSTITIAL")) {
                    this.f16332A = 4;
                } else if (arrayList.contains("native") || arrayList.contains("NATIVE")) {
                    this.f16332A = 8;
                } else if (arrayList.contains("rewarded") || arrayList.contains("REWARDED")) {
                    this.f16332A = 5;
                } else if (arrayList.contains("app_open_ad")) {
                    this.f16332A = 7;
                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains("REWARDED_INTERSTITIAL")) {
                    this.f16332A = 6;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m6580c(String str) {
        boolean zMatches;
        if (((Boolean) zzbkq.f9009c.m5057c()).booleanValue()) {
            if (TextUtils.isEmpty(str)) {
                zMatches = false;
            } else {
                zMatches = Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8398X9), str);
            }
            if (zMatches) {
                this.f16335u = str;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m6581d(Bundle bundle) {
        if (((Boolean) zzbkq.f9009c.m5057c()).booleanValue()) {
            this.f16336v = com.google.android.gms.ads.nonagon.signalgeneration.zzv.m3347c(bundle);
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m6582e(zzfkx zzfkxVar) {
        if (((Boolean) zzbkq.f9009c.m5057c()).booleanValue()) {
            this.f16338x = zzfkxVar;
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m6583f(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbkq.f9009c.m5057c()).booleanValue()) {
            this.f16339y = zzeVar;
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m6584g(String str) {
        if (((Boolean) zzbkq.f9009c.m5057c()).booleanValue()) {
            this.f16337w = str;
        }
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m6585h() {
        try {
            if (((Boolean) zzbkq.f9009c.m5057c()).booleanValue()) {
                ScheduledFuture scheduledFuture = this.f16340z;
                int i2 = 0;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ArrayList arrayList = this.f16333s;
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    zzfqg zzfqgVar = (zzfqg) obj;
                    int i3 = this.f16332A;
                    if (i3 != 2) {
                        zzfqgVar.mo6570n(i3);
                    }
                    if (!TextUtils.isEmpty(this.f16335u)) {
                        zzfqgVar.mo6572y(this.f16335u);
                    }
                    if (!TextUtils.isEmpty(this.f16337w) && !zzfqgVar.zzl()) {
                        zzfqgVar.mo6571p0(this.f16337w);
                    }
                    zzfkx zzfkxVar = this.f16338x;
                    if (zzfkxVar != null) {
                        zzfqgVar.mo6567i(zzfkxVar);
                    } else {
                        com.google.android.gms.ads.internal.client.zze zzeVar = this.f16339y;
                        if (zzeVar != null) {
                            zzfqgVar.mo6568j(zzeVar);
                        }
                    }
                    zzfqgVar.mo6569m(this.f16336v);
                    this.f16334t.m6588b(zzfqgVar.mo6564e());
                }
                arrayList.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m6586i(int i2) {
        if (((Boolean) zzbkq.f9009c.m5057c()).booleanValue()) {
            this.f16332A = i2;
        }
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        m6585h();
    }
}
