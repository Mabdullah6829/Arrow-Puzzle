package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbcz extends zzbdm {

    /* JADX INFO: renamed from: h */
    public static volatile String f7630h;

    /* JADX INFO: renamed from: i */
    public static final Object f7631i = new Object();

    public zzbcz(zzbbz zzbbzVar, zzaxt zzaxtVar, int i2) {
        super(zzbbzVar, "XQdLYJkQLpAC0Ie4wfLqMhdIIwn1qr11ViPPFEC485DwlLnjXHhmJUbAoJDOqgC4", "EiIklDudUBV1tLFQO3J+6veHT/B2kTFeB6bPUIAs1V0=", zzaxtVar, i2, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    /* JADX INFO: renamed from: a */
    public final void mo4750a() {
        zzaxt zzaxtVar = this.f7657d;
        zzaxtVar.m8326l();
        ((zzayt) zzaxtVar.f19780t).m4572H0("E");
        if (f7630h == null) {
            synchronized (f7631i) {
                try {
                    if (f7630h == null) {
                        f7630h = (String) this.f7658e.invoke(null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        zzaxt zzaxtVar2 = this.f7657d;
        synchronized (zzaxtVar2) {
            String str = f7630h;
            zzaxtVar2.m8326l();
            ((zzayt) zzaxtVar2.f19780t).m4572H0(str);
        }
    }
}
