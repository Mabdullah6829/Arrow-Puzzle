package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfkk extends zzcby {

    /* JADX INFO: renamed from: s */
    public final zzfka f15868s;

    /* JADX INFO: renamed from: t */
    public final zzfjr f15869t;

    /* JADX INFO: renamed from: u */
    public final zzfkz f15870u;

    /* JADX INFO: renamed from: v */
    public zzdvu f15871v;

    /* JADX INFO: renamed from: w */
    public boolean f15872w = false;

    public zzfkk(zzfka zzfkaVar, zzfjr zzfjrVar, zzfkz zzfkzVar) {
        this.f15868s = zzfkaVar;
        this.f15869t = zzfjrVar;
        this.f15870u = zzfkzVar;
    }

    /* JADX INFO: renamed from: R2 */
    public final synchronized void m6472R2(IObjectWrapper iObjectWrapper) {
        Preconditions.m3540d("pause must be called on the main UI thread.");
        if (this.f15871v != null) {
            Context context = iObjectWrapper == null ? null : (Context) ObjectWrapper.m3697u0(iObjectWrapper);
            zzddy zzddyVar = this.f15871v.f11761c;
            zzddyVar.getClass();
            zzddyVar.m5923J0(new zzddx(context));
        }
    }

    /* JADX INFO: renamed from: d3 */
    public final synchronized void m6473d3(IObjectWrapper iObjectWrapper) {
        Preconditions.m3540d("resume must be called on the main UI thread.");
        if (this.f15871v != null) {
            Context context = iObjectWrapper == null ? null : (Context) ObjectWrapper.m3697u0(iObjectWrapper);
            zzddy zzddyVar = this.f15871v.f11761c;
            zzddyVar.getClass();
            zzddyVar.m5923J0(new zzddv(context));
        }
    }

    /* JADX INFO: renamed from: g2 */
    public final synchronized void m6474g2(IObjectWrapper iObjectWrapper) {
        try {
            Preconditions.m3540d("showAd must be called on the main UI thread.");
            if (this.f15871v != null) {
                Activity activity = null;
                if (iObjectWrapper != null) {
                    Object objM3697u0 = ObjectWrapper.m3697u0(iObjectWrapper);
                    if (objM3697u0 instanceof Activity) {
                        activity = (Activity) objM3697u0;
                    }
                }
                this.f15871v.m6072c(activity, this.f15872w);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(com.google.android.gms.internal.ads.zzbix.f8799v6)).booleanValue() == false) goto L18;
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void m6475k4(com.google.android.gms.internal.ads.zzccd r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.m3540d(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r5.f9739t     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbio r1 = com.google.android.gms.internal.ads.zzbix.f8765t6     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.ads.internal.client.zzba r2 = com.google.android.gms.ads.internal.client.zzba.f3095e     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbiv r2 = r2.f3098c     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r2.m5030a(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L2c
            if (r0 != 0) goto L19
            goto L2c
        L19:
            boolean r0 = java.util.regex.Pattern.matches(r1, r0)     // Catch: java.lang.Throwable -> L20 java.lang.RuntimeException -> L22
            if (r0 == 0) goto L2c
            goto L44
        L20:
            r5 = move-exception
            goto L65
        L22:
            r0 = move-exception
            java.lang.String r1 = "NonagonUtil.isPatternMatched"
            com.google.android.gms.ads.internal.zzt r2 = com.google.android.gms.ads.internal.zzt.f3698C     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzcfk r2 = r2.f3708h     // Catch: java.lang.Throwable -> L20
            r2.m5384d(r1, r0)     // Catch: java.lang.Throwable -> L20
        L2c:
            boolean r0 = r4.m6477m4()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L46
            com.google.android.gms.internal.ads.zzbio r0 = com.google.android.gms.internal.ads.zzbix.f8799v6     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.ads.internal.client.zzba r1 = com.google.android.gms.ads.internal.client.zzba.f3095e     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbiv r1 = r1.f3098c     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r1.m5030a(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L46
        L44:
            monitor-exit(r4)
            return
        L46:
            com.google.android.gms.internal.ads.zzfjt r0 = new com.google.android.gms.internal.ads.zzfjt     // Catch: java.lang.Throwable -> L20
            r0.<init>()     // Catch: java.lang.Throwable -> L20
            r1 = 0
            r4.f15871v = r1     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzfka r1 = r4.f15868s     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzflf r2 = r1.f15836h     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzfkt r2 = r2.f16027o     // Catch: java.lang.Throwable -> L20
            r3 = 1
            r2.f15996a = r3     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.ads.internal.client.zzm r2 = r5.f9738s     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = r5.f9739t     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzfki r3 = new com.google.android.gms.internal.ads.zzfki     // Catch: java.lang.Throwable -> L20
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L20
            r1.m6469a(r2, r5, r0, r3)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r4)
            return
        L65:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L20
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfkk.m6475k4(com.google.android.gms.internal.ads.zzccd):void");
    }

    /* JADX INFO: renamed from: l4 */
    public final synchronized void m6476l4(IObjectWrapper iObjectWrapper) {
        Preconditions.m3540d("destroy must be called on the main UI thread.");
        Context context = null;
        this.f15869t.f15810t.set(null);
        if (this.f15871v != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.m3697u0(iObjectWrapper);
            }
            zzddy zzddyVar = this.f15871v.f11761c;
            zzddyVar.getClass();
            zzddyVar.m5923J0(new zzddw(context));
        }
    }

    /* JADX INFO: renamed from: m4 */
    public final synchronized boolean m6477m4() {
        zzdvu zzdvuVar = this.f15871v;
        return (zzdvuVar == null || zzdvuVar.f13132r.f11796t.get()) ? false : true;
    }

    public final synchronized void zzc() {
        m6474g2(null);
    }

    public final synchronized String zzl() {
        zzdcs zzdcsVar;
        zzdvu zzdvuVar = this.f15871v;
        if (zzdvuVar == null || (zzdcsVar = zzdvuVar.f11764f) == null) {
            return null;
        }
        return zzdcsVar.f12046s;
    }
}
