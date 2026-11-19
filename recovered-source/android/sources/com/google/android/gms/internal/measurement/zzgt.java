package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgt extends zzadu implements zzafd {
    private static final zzgt zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private String zze = "";
    private String zzf = "";

    static {
        zzgt zzgtVar = new zzgt();
        zzg = zzgtVar;
        zzadu.m9561u(zzgt.class, zzgtVar);
    }

    private zzgt() {
    }

    /* JADX INFO: renamed from: A */
    public final String m9998A() {
        return this.zze;
    }

    /* JADX INFO: renamed from: B */
    public final String m9999B() {
        return this.zzf;
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
            return new zzafn(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzgt();
        }
        if (i3 == 4) {
            return new zzgs(zzg);
        }
        if (i3 == 5) {
            return zzg;
        }
        if (i3 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzh;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzgt.class) {
            try {
                zzadqVar = zzh;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzg);
                    zzh = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }
}
