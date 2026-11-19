package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfb extends zzadu implements zzafd {
    private static final zzfb zzi;
    private static volatile zzafj zzj;
    private int zzb;
    private boolean zzf;
    private long zzh;
    private String zze = "";
    private String zzg = "";

    static {
        zzfb zzfbVar = new zzfb();
        zzi = zzfbVar;
        zzadu.m9561u(zzfb.class, zzfbVar);
    }

    private zzfb() {
    }

    /* JADX INFO: renamed from: A */
    public static zzfa m9875A() {
        return (zzfa) zzi.m9571q();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m9876B(String str) {
        this.zzb |= 1;
        this.zze = str;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m9877C() {
        this.zzb |= 2;
        this.zzf = true;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m9878D(String str) {
        this.zzb |= 4;
        this.zzg = str;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m9879E(long j2) {
        this.zzb |= 8;
        this.zzh = j2;
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
            return new zzafn(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new zzfb();
        }
        if (i3 == 4) {
            return new zzfa(zzi);
        }
        if (i3 == 5) {
            return zzi;
        }
        if (i3 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzj;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzfb.class) {
            try {
                zzadqVar = zzj;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzi);
                    zzj = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }
}
