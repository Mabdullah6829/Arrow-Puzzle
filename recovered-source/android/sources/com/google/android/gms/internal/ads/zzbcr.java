package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbcr extends zzbdm {

    /* JADX INFO: renamed from: h */
    public static volatile String f7619h;

    /* JADX INFO: renamed from: i */
    public static final Object f7620i = new Object();

    @Override // com.google.android.gms.internal.ads.zzbdm
    /* JADX INFO: renamed from: a */
    public final void mo4750a() {
        if (f7619h == null) {
            synchronized (f7620i) {
                try {
                    if (f7619h == null) {
                        f7619h = (String) this.f7658e.invoke(null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        zzaxt zzaxtVar = this.f7657d;
        synchronized (zzaxtVar) {
            String str = f7619h;
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4614j0(str);
        }
    }
}
