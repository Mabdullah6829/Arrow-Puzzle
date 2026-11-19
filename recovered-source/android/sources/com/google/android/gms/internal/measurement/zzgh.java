package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgh extends zzadu implements zzafd {
    private static final zzgh zzh;
    private static volatile zzafj zzi;
    private int zzb;
    private String zze = "";
    private zzaef zzf = zzafm.f22097w;
    private boolean zzg;

    static {
        zzgh zzghVar = new zzgh();
        zzh = zzghVar;
        zzadu.m9561u(zzgh.class, zzghVar);
    }

    private zzgh() {
    }

    /* JADX INFO: renamed from: A */
    public final String m9966A() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    /* JADX INFO: renamed from: z */
    public final Object mo9574z(int i2) {
        zzafj zzadqVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzafn(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zze", "zzf", zzgr.class, "zzg"});
        }
        if (i3 == 3) {
            return new zzgh();
        }
        if (i3 == 4) {
            return new zzgg(zzh);
        }
        if (i3 == 5) {
            return zzh;
        }
        if (i3 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzi;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzgh.class) {
            try {
                zzadqVar = zzi;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzh);
                    zzi = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }
}
