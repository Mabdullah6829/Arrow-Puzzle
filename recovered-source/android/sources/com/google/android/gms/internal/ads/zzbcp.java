package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbcp extends zzbdm {

    /* JADX INFO: renamed from: h */
    public static volatile Long f7616h;

    /* JADX INFO: renamed from: i */
    public static final Object f7617i = new Object();

    public zzbcp(zzbbz zzbbzVar, zzaxt zzaxtVar, int i2) {
        super(zzbbzVar, "c2tDBlieP1HgAca8BbxZWeFItAa95IUNAJZ8eF9wTfwT8H+oJvTJgvb0TMn4OhPJ", "tm0zp+MQfD9mNSBt0r3mfYhq2ky3SeNyaSrFjHWQaT0=", zzaxtVar, i2, 44);
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    /* JADX INFO: renamed from: a */
    public final void mo4750a() {
        if (f7616h == null) {
            synchronized (f7617i) {
                try {
                    if (f7616h == null) {
                        f7616h = (Long) this.f7658e.invoke(null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        zzaxt zzaxtVar = this.f7657d;
        synchronized (zzaxtVar) {
            long jLongValue = f7616h.longValue();
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4587P(jLongValue);
        }
    }
}
