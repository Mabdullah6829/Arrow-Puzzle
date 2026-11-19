package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhu extends zzadu implements zzafd {
    private static final zzhu zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private String zze = "";
    private long zzf;

    static {
        zzhu zzhuVar = new zzhu();
        zzg = zzhuVar;
        zzadu.m9561u(zzhu.class, zzhuVar);
    }

    private zzhu() {
    }

    /* JADX INFO: renamed from: A */
    public static zzht m10148A() {
        return (zzht) zzg.m9571q();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m10149B(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m10150C(long j2) {
        this.zzb |= 2;
        this.zzf = j2;
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
            return new zzafn(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzhu();
        }
        if (i3 == 4) {
            return new zzht(zzg);
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
        synchronized (zzhu.class) {
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
