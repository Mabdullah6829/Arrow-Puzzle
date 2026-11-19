package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbdi extends zzbdm {
    public zzbdi(zzbbz zzbbzVar, zzaxt zzaxtVar, int i2) {
        super(zzbbzVar, "GkIdfnRezKvEfAeB5157D8Ci3lpp/e7Oge9xr/GzO3KjC7JXvYHgpg7VRCtGuOw4", "kXUmyuEurXcq5mqFokC5oFFCqidwlGAMD9JpJXYa0Mk=", zzaxtVar, i2, 48);
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    /* JADX INFO: renamed from: a */
    public final void mo4750a() {
        zzaxt zzaxtVar = this.f7657d;
        zzaxtVar.m4530q(3);
        boolean zBooleanValue = ((Boolean) this.f7658e.invoke(null, this.f7654a.f7547a)).booleanValue();
        synchronized (zzaxtVar) {
            try {
                if (zBooleanValue) {
                    zzaxtVar.m4530q(2);
                } else {
                    zzaxtVar.m4530q(1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
