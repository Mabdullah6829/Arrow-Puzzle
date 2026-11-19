package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzme extends zzadu implements zzafd {
    private static final zzme zzh;
    private static volatile zzafj zzi;
    private int zzb;
    private zzmd zzf;
    private String zze = "";
    private String zzg = "";

    static {
        zzme zzmeVar = new zzme();
        zzh = zzmeVar;
        zzadu.m9561u(zzme.class, zzmeVar);
    }

    private zzme() {
    }

    /* JADX INFO: renamed from: B */
    public static zzmb m10479B() {
        return (zzmb) zzh.m9571q();
    }

    /* JADX INFO: renamed from: A */
    public final String m10480A() {
        return this.zze;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m10481C(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m10482D(zzmd zzmdVar) {
        zzmdVar.getClass();
        this.zzf = zzmdVar;
        this.zzb |= 2;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m10483E(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
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
            return new zzafn(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zzme();
        }
        if (i3 == 4) {
            return new zzmb(zzh);
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
        synchronized (zzme.class) {
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
