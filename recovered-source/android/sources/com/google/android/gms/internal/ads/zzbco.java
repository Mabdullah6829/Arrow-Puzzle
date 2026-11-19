package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbco extends zzbdm {
    public zzbco(zzbbz zzbbzVar, zzaxt zzaxtVar, int i2) {
        super(zzbbzVar, "m7g/XX2t5caOhtOM/ogmEO9Vkwmhkxe5gTS2qje4vP8HJASoqVE/26NLNeDuMz/t", "+Weh9OuqHFyRkOD06GxXjljhJF/GsDXbBDxKrn8yplc=", zzaxtVar, i2, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    /* JADX INFO: renamed from: a */
    public final void mo4750a() {
        zzaxt zzaxtVar = this.f7657d;
        zzaxtVar.m8326l();
        ((zzayt) zzaxtVar.f19780t).m4578K0(-1L);
        zzaxtVar.m8326l();
        ((zzayt) zzaxtVar.f19780t).m4580L0(-1L);
        int[] iArr = (int[]) this.f7658e.invoke(null, this.f7654a.f7547a);
        synchronized (zzaxtVar) {
            long j2 = iArr[0];
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4578K0(j2);
            long j3 = iArr[1];
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4580L0(j3);
            int i2 = iArr[2];
            if (i2 != Integer.MIN_VALUE) {
                zzaxtVar.m8326l();
                ((zzayt) zzaxtVar.f19780t).m4606b0(i2);
            }
        }
    }
}
