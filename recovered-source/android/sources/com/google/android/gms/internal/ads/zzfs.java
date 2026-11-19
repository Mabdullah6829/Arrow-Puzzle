package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.os.PowerManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfs {

    /* JADX INFO: renamed from: a */
    public final zzfr f16372a;

    /* JADX INFO: renamed from: b */
    public final zzea f16373b;

    /* JADX INFO: renamed from: c */
    public final zzea f16374c;

    /* JADX INFO: renamed from: d */
    public boolean f16375d;

    /* JADX INFO: renamed from: e */
    public boolean f16376e;

    public zzfs(Context context, Looper looper, zzdp zzdpVar) {
        this.f16372a = new zzfr(context.getApplicationContext());
        this.f16373b = zzdpVar.mo5975a(looper, null);
        this.f16374c = zzdpVar.mo5975a(Looper.getMainLooper(), null);
    }

    /* JADX INFO: renamed from: a */
    public final void m6634a(boolean z) {
        if (this.f16376e == z) {
            return;
        }
        this.f16376e = z;
        if (this.f16375d) {
            m6635b(true, z);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6635b(final boolean z, final boolean z2) {
        zzea zzeaVar = this.f16373b;
        if (z && z2) {
            zzeaVar.mo6122g(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f16196s.f16372a.m6617a(z, z2);
                }
            });
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.f16374c.mo6121f(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                final AtomicBoolean atomicBoolean2 = atomicBoolean;
                if (atomicBoolean2.get()) {
                    final zzfr zzfrVar = this.f16222s.f16372a;
                    new Thread(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfq
                        @Override // java.lang.Runnable
                        public final void run() {
                            PowerManager.WakeLock wakeLock;
                            zzfr zzfrVar2 = zzfrVar;
                            AtomicBoolean atomicBoolean3 = atomicBoolean2;
                            synchronized (zzfrVar2) {
                                if (!atomicBoolean3.get() || (wakeLock = zzfrVar2.f16371b) == null) {
                                    return;
                                }
                                wakeLock.release();
                            }
                        }
                    }, "ExoPlayer:WakeLockManager").start();
                }
            }
        });
        zzeaVar.mo6122g(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfs zzfsVar = this.f16141s;
                zzfsVar.getClass();
                atomicBoolean.set(false);
                zzfsVar.f16372a.m6617a(z, z2);
            }
        });
    }
}
