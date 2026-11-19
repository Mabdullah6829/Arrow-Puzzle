package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbfs {

    /* JADX INFO: renamed from: a */
    public final Object f7771a = new Object();

    /* JADX INFO: renamed from: b */
    public zzbfq f7772b = null;

    /* JADX INFO: renamed from: c */
    public boolean f7773c = false;

    /* JADX INFO: renamed from: a */
    public final void m4851a(Context context) {
        synchronized (this.f7771a) {
            try {
                if (!this.f7773c) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Can not cast Context to Application");
                        return;
                    }
                    if (this.f7772b == null) {
                        this.f7772b = new zzbfq();
                    }
                    zzbfq zzbfqVar = this.f7772b;
                    if (!zzbfqVar.f7761A) {
                        application.registerActivityLifecycleCallbacks(zzbfqVar);
                        if (context instanceof Activity) {
                            zzbfqVar.m4850a((Activity) context);
                        }
                        zzbfqVar.f7764t = application;
                        zzbfqVar.f7762B = ((Long) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8021B1)).longValue();
                        zzbfqVar.f7761A = true;
                    }
                    this.f7773c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4852b(zzbfr zzbfrVar) {
        synchronized (this.f7771a) {
            try {
                if (this.f7772b == null) {
                    this.f7772b = new zzbfq();
                }
                zzbfq zzbfqVar = this.f7772b;
                synchronized (zzbfqVar.f7765u) {
                    zzbfqVar.f7768x.add(zzbfrVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4853c(zzbfr zzbfrVar) {
        synchronized (this.f7771a) {
            try {
                zzbfq zzbfqVar = this.f7772b;
                if (zzbfqVar == null) {
                    return;
                }
                synchronized (zzbfqVar.f7765u) {
                    zzbfqVar.f7768x.remove(zzbfrVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final Activity m4854d() {
        synchronized (this.f7771a) {
            try {
                zzbfq zzbfqVar = this.f7772b;
                if (zzbfqVar == null) {
                    return null;
                }
                return zzbfqVar.f7763s;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4855e() {
        synchronized (this.f7771a) {
            try {
                zzbfq zzbfqVar = this.f7772b;
                if (zzbfqVar == null) {
                    return false;
                }
                return zzbfqVar.f7766v.get();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
