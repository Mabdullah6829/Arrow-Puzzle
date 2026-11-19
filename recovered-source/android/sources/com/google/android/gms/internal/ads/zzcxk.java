package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcxk implements zzbex {

    /* JADX INFO: renamed from: s */
    public final zzclb f11676s;

    /* JADX INFO: renamed from: t */
    public final Executor f11677t;

    /* JADX INFO: renamed from: u */
    public final AtomicReference f11678u = new AtomicReference();

    public zzcxk(zzclb zzclbVar, Executor executor) {
        this.f11676s = zzclbVar;
        this.f11677t = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    /* JADX INFO: renamed from: t */
    public final synchronized void mo4826t(zzbew zzbewVar) {
        final zzclb zzclbVar = this.f11676s;
        if (zzclbVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8468be)).booleanValue()) {
                if (zzbewVar.f7707j) {
                    AtomicReference atomicReference = this.f11678u;
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        this.f11677t.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcxj
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzclbVar.onResume();
                            }
                        });
                    }
                } else {
                    AtomicReference atomicReference2 = this.f11678u;
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        this.f11677t.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcxi
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzclbVar.onPause();
                            }
                        });
                    }
                }
            }
        }
    }
}
